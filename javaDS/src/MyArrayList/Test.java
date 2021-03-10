package MyArrayList;

/**
 * @ClassName Test
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/08/13:39
 */
public class Test {
    public static void main(String[] args) {
        MyList myList = new MyArrayList();
        System.out.println(myList);
        myList.add(2);
        System.out.println(myList);


        MyIterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            Integer e = iterator.next();
            System.out.println(e);
        }
    }

}
