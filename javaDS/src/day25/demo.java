package day25;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName demo
 * @Description ：TODO
 * @Author Josvin
 *
// preorder traversal
// inorder
// postorder
 * @Date 2021/03/25/18:47
 */
public class demo {
    public static void main(String[] args) {

        System.out.println(inorder(builder()));
        System.out.println(countLeaf(builder()));
        System.out.println(kthSize(builder(),4));
        System.out.println(highTree(builder()));
        char aim = 'a';
        System.out.println(contains(builder(),aim));
        System.out.println(nodeOf(builder(),aim));
        //System.out.println();
    }

    public static void sort(int[] array) {


    }



    public static TreeNode builder(){
        TreeNode a = new TreeNode('a');
        TreeNode b = new TreeNode('b');
        TreeNode c = new TreeNode('c');
        TreeNode d = new TreeNode('d');
        TreeNode e = new TreeNode('e');
        TreeNode f = new TreeNode('f');
        TreeNode g = new TreeNode('g');
        TreeNode h = new TreeNode('h');

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.right = h;
        return a;
    }


    public static void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static int kthSize(TreeNode node, int k) {
        if (node == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return kthSize(node.left, k - 1) + kthSize(node.right, k - 1);
    }

    public static int highTree(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(highTree(node.left) + 1, highTree(node.right) + 1);
    }

    public static boolean contains(TreeNode root, Character e) {
        if (root == null) {
            return false;
        }
        return root.val == e || contains(root.left, e) || contains(root.left, e);
    }
    public static TreeNode nodeOf(TreeNode node, Character e) {
        TreeNode ans = null;
        if (node == null) {
            return null;
        }
        return (ans = node).val == e || ((ans = (nodeOf(node.left, e))) != null) || ((ans = (nodeOf(node.right, e))) != null) ? ans : null;
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        if (isSametree(s, t)) {
            return true;
        }
        if (isSubtree(s.left, t)) {
            return true;

        }
        return isSubtree(s.right, t);

    }

    private boolean isSametree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        return s.val == t.val && isSametree(s.left, t.left) && isSametree(s.right, t.right);

    }


    public static int countLeaf(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.right == null && node.left == null) {
            return 1;
        }
        return countLeaf(node.left) + countLeaf(node.right);
    }
    public static List<Character> inorder(TreeNode node) {
        List<Character> list = new ArrayList<>();
        if (node == null) {
            return list;
        }
        List<Character> leftList = inorder(node.left);
        for (Character e : leftList) {
            list.add(e);
        }
        //list.addAll();
        list.add(node.val);
        list.addAll(inorder(node.right));
        return list;
    }

}
