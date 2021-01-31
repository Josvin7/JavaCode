/**
 * @ClassName Interview24
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/31/21:29
 */
public class Interview24 {

    public ListNode reverseList(ListNode head) {
        ListNode prev = head;
        ListNode next = head;
        if (head != null) {
            next = next.next;
            head.next = null;
        }
        while (next != null) {
            ListNode tmp = next.next;
            next.next = prev;
            prev = next;
            next = tmp;
        }
        return prev;
    }
}
