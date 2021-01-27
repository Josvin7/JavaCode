/**
 * @ClassName Interview18
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/26/21:21
 */
public class Interview18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode tmp = newHead;
        ListNode prev = newHead.next;
        while (prev != null) {
            if (prev.val == val) {
                ListNode aa = prev.next;
                tmp.next = aa;
                prev = aa;
            } else {
                prev = prev.next;
                tmp = tmp.next;
            }

        }
        return newHead.next;
    }
}
