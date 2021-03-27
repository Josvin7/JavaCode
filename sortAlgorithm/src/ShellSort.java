import java.util.Arrays;

/**
 * @ClassName ShellSort
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/26/12:04
 */
// 时间复杂度：极限形况；O(N^1.3),按照size,size/2  ... 设定 gap  时间复杂度为:O(N^2)
// 空间复杂度：O(1)
// 稳定性;  不稳定（分组会打乱相对顺序）

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {12, 23, 45, 576, 23, 12356, 34};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void shellSort(int[] array) {
        int gap = array.length / 2;
        while (gap > 1) {
            // 循环进入分组插入排序
            insertSortGap(array, gap);
            gap = gap / 2;
        }
        insertSortGap(array, 1);
    }

    private static void insertSortGap(int[] array, int gap) {
        // 通过 bound 来划分两个区间
        // 有序区间 ：[0,bound）
        // 无序区间 ：[bound,size）

        for (int bound = gap; bound < array.length; bound++) {
            // 处理 bound 位置元素，将bound 元素插入前边的有序区间
            int tmp = array[bound];
            // 从后往前遍历，插入到合适位置
            int cur = bound - gap;// 找到同组中的上一个元素
            for (; cur >= 0; cur -= gap) {
                // 如果这里写作大于等于就会变成不稳定排序
                if (array[cur] > tmp) {
                    array[cur + gap] = array[cur];
                } else {
                    // 说明已经找到合适位置
                    break;
                }
            }
            array[cur + gap] = tmp;
        }

    }
}
