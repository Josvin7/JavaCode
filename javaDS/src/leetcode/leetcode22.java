package leetcode;


/**
 * @ClassName leetcode22
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/11/21:02
 */
public class leetcode22 {
    public ListNode FindKthToTail(ListNode head,int k) {

        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        // 先走k步
        while (k > 0 && fast != null) {
            fast = fast.next;
            k--;
        }
        // 一块走
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        // 如果 k > 0 ，说明没有倒数第k个节点返回 null ，否则返回 slow
        return k > 0 ? null : slow;
    }

}
