import java.util.Scanner;

/**
 * @ClassName T0201
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/01/11:25
 */
public class T0201 {
    public static void main1(String[] args) {
        // 编译可以过，非受查（非运行时）
        int[] a = {};
        a[0] = 12;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println(num1);
        System.out.println(num2);

        in.close();
    }
}
