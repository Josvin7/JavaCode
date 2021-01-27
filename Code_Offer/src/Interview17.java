/**
 * @ClassName Interview17
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/26/21:08
 */
public class Interview17 {
    //输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
    // 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
    public int[] printNumbers(int n) {
        int num = (int) Math.pow(10, n);
        int[] array = new int[num-1];
        for (int i = 0; i < num-1; i++) {
            array[i] = i+1;
        }
        return array;

    }
}
