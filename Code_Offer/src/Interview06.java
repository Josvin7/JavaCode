/**
 * @ClassName Interview06
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/04/12:29
 */


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Interview06 {
    public int[] reversePrint(ListNode head) {
        int count = 0;
        ListNode tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            count++;
        }
        int[] array = new int[count];

        reversePrintHelper(head,array,count-1);
        return array;

    }

    private void reversePrintHelper(ListNode head, int[] array,int i) {
        if (head == null) {
            return;
        }
        array[i] = head.val;
        reversePrintHelper(head.next,array,--i);
    }

}
