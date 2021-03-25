package day23.my_LinkedList;

/**
 * @ClassName MyItertor
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/25/9:32
 */
public class MyIterator {
    private Node cur;

    public MyIterator(Node head) {
        cur = head;
    }

    public boolean hasNext() {
        return cur != null;
    }

    public String next() {
        String e = cur.val;
        cur = cur.next;
        return e;

    }

}
