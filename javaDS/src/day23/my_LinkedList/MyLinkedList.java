package day23.my_LinkedList;

/**
 * @ClassName MyLinkedList
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/23/20:48
 */

public class MyLinkedList {
    public Node head;
    public Node last;
    public int size;

    public MyLinkedList() {
        head = null;
        last = null;
        size = 0;
    }

    // 尾插
    public boolean add(String e) {
        Node node = new Node(e);
        if (head == null) {
            head = last = node;
        } else {
            node.prev = last;
            last.next = node;
            last = last.next;
        }
        size++;
        return true;
    }

    public boolean add(int index, String e) {
        Node node = new Node(e);
        Node prev = head;
        if (index < 0 || index > size) {
            throw new  ArrayIndexOutOfBoundsException();
        }

        if (size == 0) {
            head = last = node;
        } else if (index == 0) {
            node.next = head;
            head.prev = node;
            head = node;
        } else if (index == size) {
            last.next = node;
            node.prev = last;
            last = node;
        } else {
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            Node next = prev.next;
            prev.next = node;
            node.prev = prev;
            node.next = next;
            next.prev = node;
        }

        size++;
        return true;
    }

    public String remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (size == 0) {
            return null;
        }
        String str = "";
        if (size == 1) {
            str = head.val;
            head = last = null;
            size--;
            return str;
        }

        if (index == 0) {
            str = head.val;
            head = head.next;
            head.prev = null;
        } else if (index == size - 1) {
            str = last.val;
            last.prev.next = null;
            last = last.prev;
            //last.prev = null;
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            str = prev.next.val;
            prev.next = prev.next.next;
            prev.next.next.prev = prev;
        }
        size--;
        return str;

    }








    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        Node cur = head;
        while (cur != null) {
            stringBuilder.append(cur.val);
            if (cur != last) {
                stringBuilder.append(",");
            }
            cur = cur.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}
