/**
 * @ClassName leetcode203
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/25/14:46
 */
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

 /*
 * 输入: 1->2->6->3->4->5->6, val = 6
   输出: 1->2->3->4->5
 * */
public class leetcode203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        while (head.val == val) {
            head = head.next;
            if (head == null) {
                return head;
            }
        }
        ListNode cur = head.next;
        ListNode pre = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur = cur.next;
            }else {
                cur = cur.next;
                pre = pre.next;
            }
        }
        return head;
    }
}
