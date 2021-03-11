package LinkedListLearn;

/**
 * @ClassName MyLinked
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/11/19:05
 */
public class MyLinked {
    public static Node pushFront(Node head, int val) {
        Node node = new Node(val);
        node.next = head;
        return node;
    }

    public static Node popFront(Node head) {
        return head.next;
    }

    private static Node pushBack(Node head, int val) {
        Node node = new Node(val);
        if (head != null) {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
            return head;
        } else {
            return node;
        }
    }


    private static Node popBack(Node head, int k) {

        //  1->2->2->3
        if (head == null) {
            return null;
        }

        Node ans = head;
        Node prev = head;
        while (k-- > 0) {
            prev = prev.next;//  1  2
            if (prev == null) {
                if (k > 0) {
                    return null;
                } else {
                    return ans.next;
                }

            }
        }
        if (prev.next == null) {
            return ans.next;
        }
        while (prev.next != null) {
            head = head.next;
            prev = prev.next;
        }
        head.next = head.next.next;
        return ans;
    }
}
