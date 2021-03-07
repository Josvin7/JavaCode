import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName ArrayListDemo
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/07/21:41
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("我");
        list.add("你");
        list.add("呀");
        Iterable<String> iterable = list;

        // 倘若不知道有多少元素
        // 有点类似于Scanner

        Iterator<String> iterator1 = iterable.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());

        }
        // 凡是具备 Iterable 能力的对象
        /// 都可以使用 foreach 写法，进行每个元素的遍历
        for (String s : iterable) {
            System.out.println(s);
        }






        // iterable 指向的对象具备迭代能力
        //迭代能力(Iterable) 和 迭代器(iterator)

        // 1、通过iterable 得到迭代器对象(Iterator)
       // Iterator<String> iterator = iterable.iterator();
    /*    // 利用迭代器对象，进行遍历
        System.out.println(iterator.hasNext());
        String s1 = iterator.next();
        System.out.println(s1);
        System.out.println(iterator.hasNext());
        String s2 = iterator.next();
        System.out.println(s2);

        System.out.println(iterator.hasNext());
        String s3 = iterator.next();
        System.out.println(s3);
        System.out.println(iterator.hasNext());
        //String s4 = iterator.next();*/


    }
}
