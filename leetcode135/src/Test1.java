/**
 * @ClassName Test1
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/24/12:12
 */
public class Test1 {
    public static int candy(int[] ratings) {
        int[] left = new int[ratings.length];
        for (int i = 0; i < ratings.length; i++) {
            if(i > 0 && ratings[i] > ratings[i-1]) {
                left[i] = left[i-1] + 1;
            }else {
                left[i] = 1;
            }
        }
        int[] right = new int[ratings.length];
        int ret = 0;
        for (int i = ratings.length - 1; i >= 0; i--) {
            if (i < ratings.length - 1 && ratings[i] > ratings[i + 1]) {
                right[i] = right[i+1] + 1;
            }
            else {
                right[i] = 1;
            }
            ret += Math.max(left[i] , right[i]);
        }
        return ret;

    }
}
