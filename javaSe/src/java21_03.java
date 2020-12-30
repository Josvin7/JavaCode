import java.util.Scanner;

/**
 * @ClassName java21_03
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/29/14:38
 */
public class java21_03 {

  /*  public static void main(String[] args) {
        //输出 1000 - 2000 之间所有的闰年
        for (int i = 1000; i <= 2000; i++) {
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
                System.out.print(i + "是闰年  ");
            }
        }


    }*/

    //打印 1 - 100 之间所有的素数
    public static void main1(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i <= 1) {
                continue;
            }
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {//num/2   根号num
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            if (age <= 18) {
                System.out.println("少年");
            }
            if (age>=19 && age <= 28) {
                System.out.println("青年");
            }
            if (age>=29 && age <= 55) {
                System.out.println("中年");
            }
            if (age >= 56) {
                System.out.println("老年");
            }
        }


    }
}
