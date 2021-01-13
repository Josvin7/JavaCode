/**
 * @ClassName Interview11
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/12/16:49
 */
public class Interview11 {
    public int minArray111(int[] numbers) {
        int len = numbers.length;
        for (int i = 0; i < len - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return numbers[i + 1];
            }
        }
        return numbers[0];

    }
    public int minArray(int[] numbers) {
        // 1  3  5
        int len = numbers.length;
        int left = 0;
        int right = len - 1;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (numbers[mid] > numbers[right]) {
                left = mid+1;
            } else if (numbers[mid] < numbers[right]) {
                right = mid;
            } else {
                right--;// 因为当出现相同的元素是就不能判断最小值在他的左边还是右边所以需要，--（暴力遍历结合）
            }
        }
        return numbers[right];

    }
}
