/**
 * @ClassName leetcode21
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/23/20:05
 */

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class leetcode21 {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        for (int i = 0; i < len - 1; i++) {
            lists[i+1] = mergeTwoLists(lists[i], lists[i + 1]);
        }
        return lists[len - 1];

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null ) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode newHead = new ListNode(-1);
        ListNode ans = newHead;
        while (l1 != null && l2 != null) {
            if ( l1.val > l2.val) {
                newHead.next = l2;
                l2 = l2.next;
                newHead = newHead.next;
            } else {
                newHead.next = l1;
                newHead = newHead.next;
                l1 = l1.next;
            }


        }
        if (l1 == null) {
            newHead.next = l2;
        }
        if(l2 == null) {
            newHead.next = l1;
        }
        return ans.next;

    }
}
