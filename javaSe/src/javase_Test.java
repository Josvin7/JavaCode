/**
 * @ClassName javase_Test
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/05/9:27
 */
public class javase_Test {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }


        ListNode newHead = new ListNode(-1);
        ListNode ans = newHead;
        /*if (list1.val > list2.val) {
            newHead.next = list1;
        } else {
            newHead.next = list2;
        }
        newHead = newHead.next;*/
        // 3 456     2 3 3
        // 2345
        while (list1 != null && list2 != null) {
            while (list1 != null&&list1.val <= list2.val) {
                newHead.next = list1;
                newHead = newHead.next;
                list1 = list1.next;
            }
            if (list1 == null) {
                break;
            }
            while (list2!=null && list1.val > list2.val) {
                newHead.next = list2;
                newHead = newHead.next;
                list2 = list2.next;
            }

        }
        if (list1 == null) {
            newHead.next = list2;
        }
        else if (list2 == null) {
            newHead.next = list1;
        }
        return ans.next;
    }

}
