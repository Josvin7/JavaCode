package homeWork;

import java.util.Arrays;

/**
 * @ClassName sort
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/09/12:31
 */
public class sort {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 6, 7, 32, 12};
        int len = array.length;
        int flag = 0;
        for (int i = 0; i < len; i++) {
            flag = 0;
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    flag = 1;
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
