/**
 * @ClassName niuke01
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/25/21:24
 */
public class niuke01 {


    public ListNode FindKthToTail1(ListNode head,int k) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k > 0 && fast != null) {
            k--;
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return k > 0 ? null : slow;
    }



    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k < 1) {
            return null;
        }
        ListNode fast = null;
        ListNode slow = null;
        while (k > 0) {
            fast = fast.next;
            if (fast == null) {
                break;
            }
            k++;
        }
        if (fast == null && k > 0) {
            return null;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }
}
