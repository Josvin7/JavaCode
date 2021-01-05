/**
 * @ClassName ssr
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/04/11:16
 */

public class ssr {
    public ListNode partition(ListNode head, int x) {
        ListNode minNode = new ListNode(-1);
        ListNode maxNode = new ListNode(-1);
        ListNode minNodeHead = minNode;
        ListNode maxNodeHead = maxNode;
        while (head != null) {
            if (head.val >= x) {
                maxNodeHead.next = head;
                maxNodeHead = maxNodeHead.next;

            }
            if (head.val < x) {
                minNodeHead.next = head;
                minNodeHead = minNodeHead.next;

            }
            head = head.next;
        }
        minNodeHead.next = maxNode.next;
        maxNodeHead.next = null;
        return minNode.next;
    }
}
