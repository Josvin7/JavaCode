import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName leetcode141
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/21/18:15
 */
public class leetcode141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }







        public boolean hasCycle11(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        if (head.next == null) {
            return false;
        }
        ListNode fast = head.next;
        while (fast != null && fast.next !=null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
