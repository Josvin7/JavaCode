import java.util.*;

/**
 * @ClassName leetcode414
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/19/23:02
 */
public class leetcode414 {
    public static int thirdMax(int[] nums) {
        //当父节点的键值总是小于或等于任何一个子节点的键值时为最小堆
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if (queue.size() < 3) {
                if (!queue.contains(nums[i])) {
                    queue.offer(nums[i]);
                }
            } else if (!queue.contains(nums[i]) && nums[i] > queue.peek()) {
                queue.offer(nums[i]);
                queue.poll();
            }
        }
        if (queue.size() == 2) {
            queue.poll();
            return queue.poll();
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int[] ints = {4, 1, 4,5,6};
        System.out.println(thirdMax(ints));
    }
}
