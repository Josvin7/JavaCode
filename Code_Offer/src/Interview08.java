/**
 * @ClassName Interview08
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/11/15:02
 */
class TreeLinkNode {
    int val;
    TreeLinkNode left;
    TreeLinkNode right;
    TreeLinkNode parent;

    TreeLinkNode(int x) { val = x; }
}
public class Interview08 {
    public TreeLinkNode getNext(TreeLinkNode pNode){

        // 1，首先判断为空的情况
        if(pNode == null){
            return null;
        }

        // 2.当前节点有右子节点
        TreeLinkNode curr = pNode;
        if(null != pNode.right){
            //则去找最左边的子节点即可
            curr = curr.right;
            while (curr.left!=null){
                curr = curr.left;
            }
            return curr;
            // 3.当前节点没有由右子节点
        }else {
            //就去父节点中找,反正得到的结果一定是一个父节点
            //下面这个可以考虑i节点的下一节点是a的情况
            while(curr.parent !=null && curr == curr.parent.right){
                curr = curr.parent;
            }
            return curr.parent;
        }
    }

}
