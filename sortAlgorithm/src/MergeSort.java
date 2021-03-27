import java.util.Arrays;

/**
 * @ClassName MergeSort
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/27/17:20
 */
// 时间复杂度;O(N*logN)
// 空间复杂度;O(N) + O(logN)
// 稳定性;稳定

public class MergeSort {
    // [low,mid) 有序区间
    // [mid,high) 有序区间
    // 把这两个有序区间合并为一个有序区间
    public static void merge(int[] array, int low, int mid, int high) {
        int[] output = new int[high - low];
        int outputIndex = 0;  //记录当前 output 数组中被放入了多少个元素
        int cur1 = low;
        int cur2 = mid;
        while (cur1 < mid && cur2 < high) {
            // 这里写作 <= 才能保证稳定性
            if (array[cur1] <= array[cur2]) {
                output[outputIndex] = array[cur1];
                outputIndex++;
                cur1++;
            } else {
                output[outputIndex] = array[cur2];
                outputIndex++;
                cur2++;
            }
        }
        // 当循环结束，有一个先到达，一个后到达
        // 后边的直接加入
        while (cur1 < mid) {
            output[outputIndex] = array[cur1];
            outputIndex++;
            cur1++;
        }
        while (cur2 < high) {
            output[outputIndex] = array[cur2];
            outputIndex++;
            cur2++;
        }
        // 把 output 中的元素搬运回去
        for (int i = 0; i < high - low; i++) {
            array[low + i] = output[i];
        }
    }


    public static void mergeSort(int[] array) {
        mergeSortHelper(array, 0, array.length);
    }

    // [low,high) 两者差值小于等于1 区间就只有一个或者0个元素
    private static void mergeSortHelper(int[] array, int low, int high) {
        if (high - low <= 1) {
            return;
        }
        int mid = (low + high) / 2;
        //这个方法执行完就认为low ，mid  已经排序ok
        mergeSortHelper(array, low, mid);
        //这个方法执行完就认为mid ，high  已经排序ok
        mergeSortHelper(array, mid, high);

        // 当把左右区间已经归并完了，说明在左右区间已经是有序的了
        /// 接下来就可以针对两个区间进行合并了
        merge(array, low, mid, high);
    }

    public static void main(String[] args) {
        int[] array = {12, 23, 45, 576, 23, 12356, 34};
        mergeSort(array);
        System.out.println(Arrays.toString(array));

    }


    public static void mergeSortByLoop(int[] array) {
        // 引入一个 gap 变量进行分组
        //  当gap 为 1 的时候，[0][1]进行合并，[2][3]进行合并, [4][5]进行合并...
        //  当gap 为 2 的时候，[0,1] 和 [2,3]进行合并，[4,5]和 [6，7]进行合并...
        //  当gap 为 4 的时候，[0，1，2，3]和 [4，5，6，7]进行合并...
        for (int gap = 1; gap < array.length; gap *= 2) {
            // 接下来进行具体的分组合并
            // 下边的循环执行一次，就完成了一次相邻两个组的合并
            for (int i = 0; i < array.length; i += 2 * gap) {
                // 当前相邻组
                // [beg,mid)
                // [mid,end)
                int beg = i;
                int mid = i + gap;
                int end = i + 2 * gap;
                // 防止下标越界
                if (mid > array.length) {
                    mid = array.length;
                }
                if (end > array.length) {
                    end = array.length;
                }
                merge(array, beg, mid, end);
            }
        }

    }
}
