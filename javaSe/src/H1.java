import java.util.Arrays;

/**
 * @ClassName H1
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/17/21:23
 */
public class H1 {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(Fibonacci(n));
        System.out.println(jiechengSum(3));
        maxTwoNum(2, 3);
        maxThreeNum(1, 2, 3);
        int[] array = {1, 2, 3, 4,5};
        odd_First( array);
        System.out.println(Arrays.toString(array));
    }

    private static void odd_First(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int tmp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = tmp;
            i++;
        }
    }

    private static int maxThreeNum(int a, int b, int c) {
        return maxTwoNum(a, maxTwoNum(b, c));
    }

    private static int maxTwoNum(int a, int b) {
        return a > b ? a : b;
    }
    private static double maxTwoNum(double a, double b) {
        return a > b ? a : b;
    }


    private static int jiechengSum(int i) {
        return 0;
    }

    private static int jiecheng(int n) {
        int ans = 1;
        for (int i = 1; i <= n ; i++) {
            ans *= i;
        }
        return ans;
    }

    private static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }


}
