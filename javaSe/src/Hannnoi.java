/**
 * @ClassName Hannnoi
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/13/20:18
 */
public class Hannnoi {
    public static void main(String[] args) {
        HannnoiHelper(3,0,1);
    }

    private static void HannnoiHelper(int num, int src, int dec) {
        if (num == 1) {
            System.out.printf("%d->%d\n", src, dec);
            return;
        }
        int mid = 3 - src - dec;
        HannnoiHelper(num - 1, src, mid);
        System.out.printf("%d->%d\n", src, dec);
        HannnoiHelper(num - 1, mid, dec);
    }

}
