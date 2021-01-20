/**
 * @ClassName leetcode206
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/20/20:08
 */

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class leetcode206 {


    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;// 指向新链表头节点的指针
        while (head != null) {
            ListNode temp = head.next;//备份head的next 不然后边会断掉
            head.next = newHead;// 更新head.next
            newHead = head;// 移动 newHead
            head = temp;// 遍历链表
        }
        return newHead;// 返回新链表头节点
    }


}
