package day23.my_LinkedList;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/24/19:40
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            String[] strings = string.split(",");
            int[] array = new int[strings.length];
            int sum = 0;
            for (int i = 0; i < strings.length; i++) {
                array[i] = Integer.parseInt(strings[i]);
                sum += array[i];
            }
            System.out.println(Arrays.toString(array));
            int num = Helper(array,sum);
            System.out.println(num);

        }
    }

    private static int Helper(int[] array, int sum) {
        if (array.length == 0) {
            return 0;
        }
       // System.out.println(sum/2);
        if (sum == 0) {
            return 0;
        }
        if (sum % 2 != 0) {
            return 0;
        }
       // System.out.println("oo");
        boolean[] dp = new boolean[sum / 2 + 1];
        dp[0] = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = sum / 2; j >= array[i]; j--) {
                dp[j] = dp[j] || dp[j - array[i]];
            }
        }
        return dp[sum / 2] ? sum / 2 : 0;
    }
}
