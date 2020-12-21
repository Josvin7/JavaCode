import java.util.Arrays;

/**
 * @ClassName Demo
 * @Description ${DESCRIPTION}
 * @Author Fangwenhui
 * @Date 2020/12/21/19:27
 */
public class Demo {
    public static void main(String[] args) {
        int[] array = {12, 23, 45, 67, 342, 323, 35, 46, 56, 552, 42, 43, 54, 65};
        insertSort(array);

        System.out.println(Arrays.toString(array));

    }

    private static void insertSort(int[] array) {
        int bound = 1;
        for (; bound < array.length; bound++) {
            int tmp = array[bound];
            int cur = bound-1;
            for (; cur >= 0; cur--) {
                if(array[cur] > tmp) {
                    array[cur+1] = array[cur];
                }else {
                    break;
                }
            }
            array[cur + 1] = tmp;
        }


    }
}
