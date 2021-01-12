/**
 * @ClassName Interview10_1
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/11/16:39
 */
public class Interview10_1 {
    public int fib(int n) {
//        F(0) = 0,   F(1) = 1
//        F(N) = F(N - 1) + F(N - 2)
        if (n < 2) {
            return n;
        }
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;
        for (int i = 2; i < n; i++) {
            f2 = (f0 + f1)%1000000007;
            f0 = f1;
            f1 = f2;
        }
        return f2;

    }
}
