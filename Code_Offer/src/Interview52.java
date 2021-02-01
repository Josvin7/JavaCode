/**
 * @ClassName Interview52
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/01/15:41
 */
public class Interview52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode tmpA = headA;
        ListNode tmpB = headB;
        while (headA != headB) {
            if (headA == null) {
                headA = tmpB;
            }else {
                headA = headA.next;
            }
            if (headB == null) {
                headB = tmpA;
            } else {
                headB = headB.next;
            }

        }
        return headA;
    }
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode tmpA = headA;
        ListNode tmpB = headB;
        while (headA != null) {
            headA = headA.next;
            lenA++;

        }
        while (headB != null) {
            headB = headB.next;
            lenB++;

        }

        while (lenA > lenB) {
            tmpA = tmpA.next;
            lenA--;
        }
        while (lenA < lenB) {
            tmpB = tmpB.next;
            lenB--;
        }

        while (tmpA != tmpB) {
            tmpA = tmpA.next;
            tmpB = tmpB.next;
        }
        return tmpA;
    }
}
