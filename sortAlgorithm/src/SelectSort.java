import java.util.Arrays;

/**
 * @ClassName SelectSort
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/26/16:55
 */

// 时间复杂度：O(N^2)
// 空间复杂度：O(1)
// 稳定性：不稳定排序

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5, 5, 3, 4, 5, 6, 87653, 24, 23};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectSort(int[] array) {
        for (int bound = 0; bound < array.length; bound++) {
            // bound 位置作为擂台，将后边区间进行比较
            // 如果打擂成功，进行交换
            for (int i = bound + 1; i < array.length; i++) {
                if (array[i] < array[bound]) {
                    // 打擂成功
                    int temp = array[bound];
                    array[bound] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
