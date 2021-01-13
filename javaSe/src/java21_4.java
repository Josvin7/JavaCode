/**
 * @ClassName java21_4
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/13/19:49
 */

// 栈帧中放了什么？主要存放局部变量
    //














public class java21_4 {
    public static void main(String[] args) {
        int n = 10;
        a(10);
    }

    private static void a(int num) {
        if (num == 0) {
            return;
        }
        a(num-1);
    }

    private static void b() {
        c();
    }

    private static void c() {
        d();
    }

    private static void d() {
        e();
    }

    private static void e() {
    }
}
