/**
 * @ClassName MyDataTest
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/21/10:10
 */
public class MyDataTest {


    public static void main(String[] args) {
        MyData from = new MyData(1111, 2, 23);
        MyData to = new MyData(2021, 3, 23);
        System.out.printf("%s-%s  ：%d",from,to, to.from_to(from));
        System.out.printf("%s-%s  ：%d",from.toString(),to.toString(), to.from_to(from));

        //
    }

}
