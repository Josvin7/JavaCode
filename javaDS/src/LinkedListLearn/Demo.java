package LinkedListLearn;

/**
 * @ClassName Demo
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/09/14:32
 */
public class Demo {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        System.out.println(node1.val);

    }
}
