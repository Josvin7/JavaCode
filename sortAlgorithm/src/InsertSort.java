import java.util.Arrays;

/**
 * @ClassName InsertSort
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/26/11:07
 */

// 时间复杂度O(N^2)
// 空间复杂度;O(1)
// 稳定性：稳定排序（如果排序数组中有两个元素的值是相等的，如果排序后两个相等的元素的相对顺序是一样的，这样的排序称为稳定排序。否则就是不稳定的。）

public class InsertSort {
    // 升序排序
    public static void insertSort(int[] array) {
        // 通过 bound 来划分两个区间
        // 有序区间 ：[0,bound）
        // 无序区间 ：[bound,size）
        for (int bound = 1; bound < array.length; bound++) {
            // 处理 bound 位置元素，将bound 元素插入前边的有序区间
            int tmp = array[bound];
            // 从后往前遍历，插入到合适位置
            int cur = bound - 1;
            for (; cur >= 0; cur--) {
                // 如果这里写作大于等于就会变成不稳定排序
                if (array[cur] > tmp) {
                    array[cur + 1] = array[cur];
                } else {
                    // 说明已经找到合适位置
                    break;
                }
            }
            array[cur + 1] = tmp;
        }

    }

    public static void main(String[] args) {
        int[] array = {12, 34, 45, 56, 5, 7, 686, 34};
        insertSort(array);
        System.out.println(Arrays.toString(array));

    }
}
