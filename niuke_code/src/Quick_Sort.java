import java.util.Arrays;

/**
 * @ClassName Quick_Sort
 * @Description ${DESCRIPTION}
 * @Author Fangwenhui
 * @Date 2020/12/21/20:04
 */
public class Quick_Sort {
    public static void main(String[] args) {
        int[] array = {12, 23, 45, 67, 342, 323, 35, 46, 56, 552, 42, 43, 54, 65};
        quick_Sort(array,0,array.length-1);

        System.out.println(Arrays.toString(array));
    }
    public static  void Quick_Sort(int arr[], int begin, int end){
        if(begin > end)
            return;
        int tmp = arr[begin];
        int i = begin;
        int j = end;
        while(i != j){
            // j 哨兵先动
            while(arr[j] >= tmp && j > i)
                j--;
            while(arr[i] <= tmp && j > i)
                i++;
            if(j > i){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[begin] = arr[i];
        arr[i] = tmp;
        Quick_Sort(arr, begin, i-1);
        Quick_Sort(arr, i+1, end);
    }

    private static void quick_Sort(int[] array, int begin, int end) {
        if (begin > end) {
            return;
        }
        int tmp = array[begin];
        int i = begin;
        int j = end;
        while(i != j) {

            while (array[j] >= tmp && j > i) {
                j--;
            }
            while (array[i] <= tmp && i < j) {
                i++;
            }
            // 然后交换 i  j  对应位置的元素
            if (j > i) {
                int tmp2 = array[i];
                array[i] = array[j];
                array[j] = tmp2;
            }

        }
        /// i == j
        array[begin] = array[i];
        array[i] = tmp;
        quick_Sort(array, begin, i - 1);
        quick_Sort(array,i+1, end);


    }



}
