import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Test
 * @Description ${DESCRIPTION}
 * @Author Fangwenhui
 * @Date 2020/12/22/10:56
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Test {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Deque<TreeNode>  leftstack = new LinkedList<>();// 左优先栈（先加入右子树再加入右子树）
        Deque<TreeNode> rightstack = new LinkedList<>();// 右优先栈 与上边相反
        leftstack.push(root);//先从左往右，所以root加入左优先栈
        while (!leftstack.isEmpty() || !rightstack.isEmpty()) { //只要有一个不为空说明就没有便利结束
            // 因为第一层root已经加入左优先栈，下来就给右优先栈加入左右子树。
            // 如果不为空说明还是上一层的，只有空了才能加入
            if (rightstack.isEmpty()) {
                List<Integer> tempList = new ArrayList<>();
                while (!leftstack.isEmpty()) {// 左优先（本层）不为空，向右优先（下一层）加入左右子树
                    TreeNode temp = leftstack.peek();
                    tempList.add(temp.val);
                    //在这里，左优先栈是出栈状态，右优先栈是进栈状态。这和下边的进栈顺序不同也就实现锯齿形层序遍历
                    if (temp.left != null) {
                        rightstack.push(temp.left);
                    }
                    if (temp.right != null) {
                        rightstack.push(temp.right);
                    }
                    leftstack.pop();// 左优先出栈，左优先栈循环出栈，出栈时加入每个的左右子树
                }
                list.add(tempList);// 走到这里说明左优先栈为空了，说明本层也就便利完毕，同时下一层元素也就加入了右优先栈。将本层元素加入list
            } else {
                // 与上边刚好相反
                List<Integer> tempList = new ArrayList<>();
                while (!rightstack.isEmpty()) {
                    TreeNode temp = rightstack.peek();
                    tempList.add(temp.val);
                    if (temp.right != null) {
                        leftstack.push(temp.right);
                    }
                    if (temp.left != null) {
                        leftstack.push(temp.left);

                    }
                    rightstack.pop();
                }
                list.add(tempList);
            }
        }
        //走到这里，循环结束说明两个栈内都为空了，说明二叉树遍历完毕
        return list;

    }
    public static void main(String[] args) {

    }
}
