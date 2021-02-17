/**
 * @ClassName leetcode88
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/17/22:40
 */
public class leetcode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        int[] ans = new int[nums1.length];
        int i = 0;
        int j = 0;
        int k = 0;
        for (; i < m && j < n; ) {
            if (nums1[i] <= nums2[j]) {
                ans[k++] = nums1[i++];
            } else {
                ans[k++] = nums2[j++];
            }
        }
        while (i < m) {
            ans[k++] = nums1[i++];
        }
        while (j < n) {
            ans[k++] = nums2[j++];
        }
        for (int l = 0; l < nums1.length; l++) {
            nums1[l] = ans[l];
        }
    }
}
