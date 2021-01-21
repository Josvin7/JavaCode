/**
 * @ClassName leetcode92
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/20/20:36
 */
public class leetcode92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int len = n-m;

        ListNode first = head;
        ListNode second = head;
        while (m-- > 2) {
            first = first.next;
        }
        while (n-- > 1) {
            second = second.next;
        }
        ListNode tmp = second;// 保存second
        ListNode temp = second.next;// 保存 second.next
        ListNode temp2 = first; //保存 first
        /*while (len-- > 0) {
            second.next = first.next;
            first = first.next;
            second = second.next;
        }*/
        second.next = reverseHelper(len,first);

        temp2.next = second;
        tmp.next = temp;
        return head;




    }

    private ListNode reverseHelper(int len, ListNode first) {
        if (len == 0) {
            return first;
        }
        ListNode second = new ListNode(0);
                second.next = reverseHelper(--len, first.next);
        return second.next;

    }
}
