package day25;

/**
 * @ClassName TreeNode
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/25/18:56
 */
public class TreeNode {

    public char val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(char val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return String.format("TreeNode{%c}", val);
    }
}
