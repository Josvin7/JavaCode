/**
 * @ClassName Interview07
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/06/21:45
 */

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Interview07 {
    //输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
    //前序遍历 preorder = [3,9,20,15,7]
    //中序遍历 inorder = [9,3,15,20,7]
    private int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        return buildTreeHelper(preorder, inorder, 0, inorder.length);//递归

    }

    //[inorderLeft,inorderRight) 表示当前这个子树的中序遍历区间
    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int inorderLeft, int inorderRight) {
        if (inorderLeft >= inorderRight) {
            return null;
        }
        if (index >= preorder.length) {
            return null;
        }
        // 创建一个新的结点
        TreeNode newNode = new TreeNode(preorder[index]);
        // 在中序结果中查找newNode的位置
        int pos = find(inorder, inorderLeft, inorderRight, newNode.val);
        index++;
        newNode.left = buildTreeHelper(preorder, inorder, inorderLeft, pos);
        newNode.right = buildTreeHelper(preorder, inorder, pos + 1, inorderRight);
        return newNode;
    }

    // 在中序中查找 newNode.val位置
    private int find(int[] inorder, int inorderLeft, int inorderRight, int val) {
        for (int i = inorderLeft; i < inorderRight; i++) {
            if (inorder[i] == val) {
                return i;
            }

        }
        return -1;
    }


}
