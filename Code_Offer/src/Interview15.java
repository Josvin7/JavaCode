/**
 * @ClassName Interview15
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/13/19:05
 */
public class Interview15 {
    public static int hammingWeight(int n) {
        System.out.println(n);
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(01011));
    }
}
