import java.util.Arrays;

/**
 * @ClassName HeapSort
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/26/17:24
 */

// 时间复杂度：O(N) + O(N*logN)
// 空间复杂度：O(1)
// 稳定性：不稳定排序



public class HeapSort {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5, 5, 3, 4, 5, 6, 87653, 24, 23};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void heapSort(int[] array) {
        //  先建立堆
        createHeap(array);
        // 循环交换堆顶元素，并进行调整
        // 当只剩下一个元素就一定是有序的了
        for (int i = 0; i < array.length - 1; i++) {
            // 交换堆顶元素和堆的最后一个元素
            //  循环一次堆的元素就会减少一个
            // 最后一个元素的下标就是  array.length - 1 - i
            swap(array, 0, array.length - 1 - i);
            // 交换完之后，堆的长度就会变短
            // [0,array.length - i -1) 为待排序区间
            shiftDown(array, array.length - i - 1, 0);
        }
    }

    //O(N*logN)
    private static void shiftDown(int[] array, int heapLength, int index) {
        // 升序排序，建立的是大堆，大堆就需要找出左右子树的最大值，在和根节点比较
        int parent = index;
        int child = 2 * parent + 1;
        while (child < heapLength) {
            if (child + 1 < heapLength && array[child + 1] > array[child]) {
                child = child + 1;
            }
            // 条件结束意味着， child  就已经是左右子树比较大的值的下标
            if (array[child] > array[parent]) {
                swap(array, child, parent);
            } else {
                break;
            }
            parent = child;
            child = parent * 2 + 1;
        }
    }

    private static void createHeap(int[] array) {
        // 从最后一个非叶子节点出发向前循环，依次进行向下调整
        // (array.length - 1 - 1) / 2 得到最后一个节点的父节点
        for (int i = (array.length - 1 - 1) / 2; i >= 0; i--) {
            shiftDown(array, array.length, i);
        }
    }
}
