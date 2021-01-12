/**
 * @ClassName Test
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/11/20:07
 */
public class Test {
    public int mySqrt(int x) {
        for (int i = 0; i < x / 2; i++) {
            if (x > i * i) {
                return i-1;
            }
        }
        return 0;

    }
}
