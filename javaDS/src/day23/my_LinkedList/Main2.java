package day23.my_LinkedList;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Main2
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/24/20:23
 */
public class Main2 {
    private static double[][] dp;
    private  static  int[] array;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int m = Integer.parseInt(str);
            String string = scanner.nextLine();
            System.out.println(string);
            String[] strings = string.split(" ");
           array = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                array[i] = Integer.parseInt(strings[i]);
            }
            System.out.println(helper2(array, m));
        }
    }

    private static double helper2(int[] array, int m) {
        int len = array.length;
        double sum = 0.0;
        dp = new double[len+1][m+1];

        for (int i = 0; i < len; i++) {
            sum += array[i];
            dp[i + 1][1] = sum / (i + 1);
        }
        help2(len, m);

        return dp[len][m];
    }

    private static double help2(int len, int m) {
        if (dp[len][m] != 0) {
            return dp[len][m];
        }
        if (len < m) {
            return 0;
        }
        double sum = 0.0;
        for (int i = len - 1; i > 0; --i) {
            sum += array[i];
            dp[len][m] = Math.max(dp[len][m], sum / (len - i) + help2(i, m - 1));
        }
        return sum;
    }
}
