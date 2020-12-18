import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName TestList
 * @Description ${DESCRIPTION}
 * @Author Fangwenhui
 * @Date 2020/12/18/11:31
 */
public class TestList {
    public static void main(String[] args) {
        //实例化一个List
        List<String> list = new ArrayList<>();
        //新增元素
        list.add("C 语言");
        list.add("C++");
        list.add("Java");
        list.add("CSS");
        list.add("PHP");
        list.add("Python");
        list.add("Go");
        //打印
        System.out.println(list);
        //使用下标访问
        //如果当前是List 是ArrayList，get/set 按照下标访问的方式，是比较高效的（复杂度为O（1））
        //LinkedList按照下标访问比较低效，时间复杂度为O（n）
        System.out.println("--------------------------");
        System.out.println(list.get(0));
        list.set(1,"We");
        System.out.println(list);
        //截取部分内容
        System.out.println(list.subList(1,3));
        //重新构造一个List （浅拷贝）
        List<String> arrayList = new ArrayList<>(list);
        List<String> linkedList = new LinkedList<>(list);
        System.out.println("----------------------");
        System.out.println(arrayList);
        System.out.println(linkedList);
        //基于现有的 List 的引用进行强制类型转换（向下转型）
        ArrayList<String> arrayList1 = (ArrayList<String>)list;
        LinkedList<String> linkedList1 = (LinkedList<String>)list;
        System.out.println("----------------------");
        System.out.println(arrayList1);
        System.out.println(linkedList1);
    }
}
