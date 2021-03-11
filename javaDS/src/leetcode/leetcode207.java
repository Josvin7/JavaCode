package leetcode;

import java.util.List;

/**
 * @ClassName leetcode207
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/11/20:08
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class leetcode207 {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
