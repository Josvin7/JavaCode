/**
 * @ClassName leetcode876
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/25/17:36
 */
public class leetcode876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }
}
