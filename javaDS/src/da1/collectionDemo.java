package da1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName da1.collectionDemo
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/07/22:06
 */
public class collectionDemo {


    public static void main(String[] args) {
        Collection<String> collection = new ArrayList();
        collection.add("我");
        collection.add("你");
        collection.add("111");
        System.out.println(collection);
        System.out.println(collection.remove("111"));
        System.out.println(collection);
      /*  Collections.sort(collection, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.indexOf(0).compareTo(o2.indexOf(0));
            }


        });*/
    }
}
