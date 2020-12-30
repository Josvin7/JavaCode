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
}
