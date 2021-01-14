import java.util.Scanner;

/**
 * @ClassName Testniuke
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/29/14:41
 */
public class Testniuke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char num = scanner.nextLine().charAt(0);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i- 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

    public boolean isUgly(int num) {
        //丑数就是只包含质因数 2, 3, 5 的正整数。

        if (num <= 0) {
            return false;
        }
        while (true) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                break;
            }
        }
        while (true) {
            if (num % 3 == 0) {
                num /= 3;
            } else {
                break;
            }
        }
        while (true) {
            if (num % 5 == 0) {
                num /= 5;
            } else {
                break;
            }
        }
        return num == 0;



    }


}
