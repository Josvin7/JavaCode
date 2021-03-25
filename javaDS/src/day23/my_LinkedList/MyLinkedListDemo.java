package day23.my_LinkedList;

/**
 * @ClassName MyLinkedListDemo
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/23/21:15
 */
public class MyLinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList1.add("A");
        myLinkedList1.add("B");
        System.out.println(myLinkedList1);
        myLinkedList1.add(1, "w");
        myLinkedList1.add(0, "Q");
       myLinkedList1.add(4, "E");
        System.out.println(myLinkedList1);

        myLinkedList1.remove("E");
        System.out.println(myLinkedList1);
        myLinkedList1.add(1, "w");
        myLinkedList1.add(0, "Q");
        System.out.println(myLinkedList1);

        myLinkedList1.remove("Q");

        System.out.println(myLinkedList1.size);
    }


}
