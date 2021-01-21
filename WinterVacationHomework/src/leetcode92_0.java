/**
 * @ClassName leetcode92_0
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/20/22:52
 */
public class leetcode92_0 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
//        输入: 1->2->3->4->5->NULL, m = 2, n = 4
//        输出: 1->4->3->2->5->NULL
        //如果头节点为空直接返回
        if (head == null) {
            return null;
        }
        // 当 m == n 则不需要翻转直接返回头节点
        if (m - n == 0) {
            return head;
        }
        // 计算需要反转的长度   2-4 总共3个元素长度
        int len = n - m + 1;

        ListNode second = head;//该节点记录n位置节点（4）
        ListNode first = head;//该节点记录m位置节点（2）
        ListNode first_pre = null;//该节点用于保存m位置节点的前驱

        while (m-- > 1) {
            first_pre = first;
            first = first.next;
        }// 循环走到m位置节点，并且找到前驱节点    first->2
        while (n-- > 1) {
            second = second.next;
        }// 循环走到n位置节点  second->4
        ListNode second_next = second.next;// 保存 n 位置的后继节点 5
// 3        3   2  1
        ListNode tt = null;//用来保存first的前驱

        // 循环翻转
        while (len-- > 0) {
            tt = first;
            ListNode temp = first.next;//保存first的后继  也就是3 节点
            first.next = second_next;//2->5
            second_next = first;//second_next 往前走，指向2
            first  = temp;// first指向 3
        }
        // 循环结束4->3->2->5->NULL
        //注意first结束后指向的temp 是 节点5位置，也就是需要tt 节点保存没有更新之前，tt是指向4的


        // 如果m == 1 则first_pre == null 则直接返回tt即可

        if (first_pre == null) {
            return tt;
        }
        // 不为空则将 之前保存的前驱节点first_pre指向tt，返回头节点
        first_pre.next = tt;
        return head;




    }
}


