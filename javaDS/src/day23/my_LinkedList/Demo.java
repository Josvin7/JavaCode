package day23.my_LinkedList;

import java.util.Scanner;

/**
 * @ClassName Demo
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/24/18:50
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            int ans = Helper(string);
            System.out.println(ans);
        }
    }

    private static int Helper(String string) {
        int ans = 0;
        for (int i = 0; i < string.length(); ) {
            int count = 0;
            char ch = string.charAt(i);
           // System.out.println(num);
            while (i < string.length() && (ch == string.charAt(i) )) {
                count++;
                i++;
            }
            System.out.println(count+"--");

            int tmp = Sum(count);
            ans += tmp;
        }
        return ans;
    }

    private static int Sum(int count) {
        int sum = 0;
        while (count > 0) {
            sum += count;
            count--;
        }
        return sum;
    }
}
