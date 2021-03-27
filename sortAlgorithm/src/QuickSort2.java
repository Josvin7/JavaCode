import java.util.Arrays;

/**
 * @ClassName QuickSort2
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/27/11:29
 */
// 时间复杂度：O(N*logN)
// 空间复杂度：O(logN)
// 稳定性：不稳定
public class QuickSort2 {
    public static void main(String[] args) {
        int[] array = {12, 23, 45, 576, 23, 12356, 34};
        quickSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void quickSort(int[] array) {
        // 辅助完成递归过程
        // 全闭区间
        quickSortHelper(array, 0, array.length - 1);
    }

    private static void quickSortHelper(int[] array, int left, int right) {
        if (left >= right) {
            // 区间中有一个或者0 个元素时，此时就不需要排序了
            return;
        }
        // 针对  【left ,right】 区间进行整理
        // index 返回值就是整理完毕后，left  和 right  的重合位置，在进行下一步递归
        int index = partition(array, left, right);
        quickSortHelper(array, left, index - 1);
        quickSortHelper(array, index + 1, right);

    }

    private static int partition(int[] array, int left, int right) {
        int i = left;
        int j = right;
        // 取最右侧元素为基准值
        int base = array[right];
        while (i < j) {
            //  从左往右找到比基准值大的元素
            while (i < j && array[i] <= base) {
                i++;
            }
            //  当上面的循环结束时，i 和 j 要莫重合，要莫 i 就指向一个大于 base 的值
            // 从右往左找比基准值小的元素
            while (i < j && array[j] >= base) {
                j--;
            }
            // 当上面的循环结束时，i 和 j 要莫重合，要莫 j 就指向一个小于 base 的值
            // 交换 i 和 j 的值
            swap(array, i, j);

        }
        //  当 i 和 j 重合的时候，最后一步要把重合位置的元素与基准值进行交换
        //
        swap(array, i, right);
        return i;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
