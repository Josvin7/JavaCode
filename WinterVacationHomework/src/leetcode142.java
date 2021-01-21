/**
 * @ClassName leetcode142
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/21/20:19
 */
public class leetcode142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode meet = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                meet = fast;
                break;
            }
        }

        while (meet != null) {
            if (head == meet) {
                return head;
            }
            meet = meet.next;
            head = head.next;
        }
        return null;
    }
}
