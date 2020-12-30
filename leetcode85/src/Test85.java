/**
 * @ClassName Test85
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/26/16:54
 */
public class Test85 {

    public static int largestRectangleArea(int[] heights) {
        //    [2,1,5,6,2,3]
        if (heights.length < 1) {
            return 0;
        }
        int len = heights.length;
        int high = heights[0];

        int maxarea = 0;
        for (int i = 0; i < len; i++) {
            if (heights[i] > high) {
                high = heights[i]; //最高的高度
                //System.out.println(high);
            }
            int high_tmp = heights[i];

            int maxlen = 0;
            int tmp = 0;
            for (int j = 0; j < len; j++) {
                if (heights[j] >= high_tmp) {
                    tmp++;
                }else {
                    maxlen = Math.max(maxlen, tmp);// 更新最大长度
                    tmp = 0;
                }
            }
            maxlen = Math.max(maxlen,tmp);//一定注意这里，因为上边循环退出，可能是最后一个高度高于i，也有可能不是。当是最后一个最高时刚好结束了循环，那么就没有去更新maxlen。
            maxarea = Math.max(maxarea, maxlen * high_tmp);// 更新最大面积
        }
        return maxarea;

    }
    public int maximalRectangle(char[][] matrix) {
        return 0;

    }

    public static void main(String[] args) {
        int[] array = {0,0,0,0,0,0,0,0,2147483647};
        System.out.println(largestRectangleArea(array));
    }
}
