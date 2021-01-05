/**
 * @ClassName Test
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/04/10:15
 */
public class Test {
    // F(0) = 0，F(1) = 1
    // F(n) = F(n - 1) + F(n - 2)，其中 n > 1
    public int fib(int n) {
        int f0 = 0;
        int f1 = 1;
        int f2 = 0;
        for (int i = 1; i < n; i++) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
        return f2;
    }
}
