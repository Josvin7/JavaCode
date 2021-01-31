/**
 * @ClassName leetcode22
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/31/21:15
 */
public class leetcode22 {

    public ListNode getKthFromEnd1(ListNode head, int k) {
        int len = 0;
        ListNode tmp = head;
        while (head != null) {
            len++;
        }
        int index = len - k;
        while (index-- > 0) {
            tmp = tmp.next;

        }
        return tmp;
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && k-- > 0) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
