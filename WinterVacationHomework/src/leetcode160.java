import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName leetcode160
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/21/13:57
 */
public class leetcode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pa = headA;
        ListNode pb = headB;
        while (pa != pb) {
            if (pa == null) {
                pa = headB;
            }else {
                pa = pa.next;
            }
            if (pb == null) {
                pb = headA;
            }else {
                pb = pb.next;
            }
        }
        return pa;
    }






    public ListNode getIntersectionNode12(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }










    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        // 步骤一
        ListNode temp = headA;
        int lenA = 0;
        while (temp != null) {
            temp = temp.next;
            lenA++;
        }
        temp = headB;
        int lenB = 0;
        while (temp != null) {
            temp = temp.next;
            lenB++;
        }

        // 步骤二：
        if (lenA > lenB) {
            while (lenA - lenB > 0) {
                headA = headA.next;
            }

        }else {
            while (lenB - lenA > 0) {
                headB = headB.next;
            }
        }

        //步骤三
        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
