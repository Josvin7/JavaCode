import java.util.Arrays;

/**
 * @ClassName Bubblesort
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/26/18:15
 */
// 时间复杂度: O(N^2)
// 空间复杂度;O(1)
//  稳定性：稳定排序



public class Bubblesort {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5, 5, 3, 4, 5, 6, 87653, 24, 23};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    flag = false;
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
            if (flag) {
                break;
            }
        }
    }
}
