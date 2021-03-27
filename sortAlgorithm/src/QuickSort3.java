import java.util.Arrays;
import java.util.Stack;

/**
 * @ClassName QuickSort3
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/27/14:45
 */
public class QuickSort3 {

    public static void main(String[] args) {
        int[] array = {12, 23, 45, 576, 23, 12356, 34};
        quickSortByLoop(array);
        System.out.println(Arrays.toString(array));

    }
    public static void quickSortByLoop(int[] array) {
        // 借助栈，模拟实现递归过程
        // stack 用来存放数组下标，通过下标来表示接下来要处理的区间是啥
        Stack<Integer> stack = new Stack<>();
        // 初始情况下，先把右侧边界下标入栈，再把左侧边界下标入栈，左右边界仍然构成前闭区间后闭区间
        stack.push(array.length - 1);
        stack.push(0);

        while (!stack.isEmpty()) {
            // 这个取元素的顺序要和push 的顺序正好相反
            int left = stack.pop();
            int right = stack.pop();
            if (left >= right) {
                // 区间只有一个或者没有元素，就不需要进行整理
                continue;
            }
            // 通过 partition 把区间整理成以基准值为中心，左侧小于等于基准值，右侧大于等于基准值
            //
            int index = partition(array, left, right);
            // 准备处理下一个区间
            // 【index+1，right】 基准值右侧区间
            stack.push(right);
            stack.push(index + 1);


            //  【left, index-1】 基准值左侧区间
            stack.push(index - 1);
            stack.push(left);
            //


        }
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
