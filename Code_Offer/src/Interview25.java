/**
 * @ClassName Interview25
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/31/21:02
 */
public class Interview25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode ans = newHead;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                newHead.next = l2;
                newHead = newHead.next;
                l2 = l2.next;
            } else {
                newHead.next = l1;
                newHead = newHead.next;
                l1 = l1.next;
            }
        }
        // 处理不等长的部分
        if (l1 != null) {
            newHead.next = l1;
        }

        if (l2 != null) {
            newHead.next = l2;
        }
        return ans.next;
    }
}
