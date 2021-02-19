/**
 * @ClassName leetcode905
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/19/19:39
 */
public class leetcode905 {
    public int[] sortArrayByParity(int[] A) {
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
            if (A[start] % 2 != 0) {
                start++;
            } else if (A[end] % 2 != 0) {
                end--;
            } else {
                int tmp = A[start];
                A[start] = A[end];
                A[end] = tmp;
                start++;
                end--;
            }
        }
        return A;
    }
}
