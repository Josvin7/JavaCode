import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @ClassName Test
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/30/8:18
 */
public class Test {

    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int len = stones.length;
        while (len-- >=0) {
            stones[len-1] = stones[len-1] - stones[len - 2];
            stones[len-2] = 0;
            Arrays.sort(stones);
        }
        return stones[stones.length - 1];
    }

    public int lastStoneWeight1(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int stone : stones
                ) {
            priorityQueue.offer(stone);
        }


        while (priorityQueue.size() > 1) {
            int a = priorityQueue.poll();
            int b = priorityQueue.poll();
            if (a - b > 0) {
                priorityQueue.offer(a - b);
            }
        }
        return priorityQueue.isEmpty()?0:priorityQueue.poll();


    }


}
