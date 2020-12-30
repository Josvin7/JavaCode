/**
 * @ClassName leetcode2031
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/25/15:48
 */
public class leetcode2031 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode kind = new ListNode(0);
        kind.next = head;
        ListNode cur = head;
        ListNode prev = kind;
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = prev.next;
                cur = cur.next;
            }
        }
        return kind.next;
    }
}
