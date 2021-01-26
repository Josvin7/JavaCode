/**
 * @ClassName Interview16
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/26/13:35
 */
public class Interview16 {
//    输入: 2.00000, 10
//    输出: 1024.00000
 public double myPow(double x, int n) {
    if (n == 0) {
        return 1;
    }

    double ans = 1.0 ;
     long tmp = n;
    if (n < 0) {
        x = 1 / x;
        tmp = -tmp;
    }
    while (tmp > 0) {
        if ((tmp & 1) == 1) {
            ans *= x;
        }
        tmp = tmp >>> 1;
        x *= x;

    }
    return ans;

 }
}
