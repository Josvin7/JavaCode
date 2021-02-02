import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName leetcode295
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/02/19:55
 */
class MedianFinder {
    Queue<Integer> small_queue = new PriorityQueue<>();
    Queue<Integer> big_queue = new PriorityQueue<>((o1, o2) -> o2 - o1);

    /** initialize your data structure here. */
    public MedianFinder() {

    }

    public void addNum(int num) {
        if (big_queue.isEmpty()) {
            big_queue.offer(num);
            return;
        }
        if (big_queue.size() == small_queue.size()) {
            if (num > big_queue.peek()) {
                small_queue.offer(num);

            } else {
                big_queue.offer(num);
            }
        } else if (big_queue.size() > small_queue.size()) {
            if (num > big_queue.peek()) {
                small_queue.offer(num);
            } else {
                // 注意先放进大根堆，在从大根堆拿出来加到小根堆
                big_queue.offer(num);
                small_queue.offer(big_queue.poll());

            }
        } else {
            if (num > big_queue.peek()) {
                // 同样先放在小根堆，在从小根堆中拿出最小的放到大根堆
                small_queue.offer(num);
                big_queue.offer(small_queue.poll());

            } else {
                big_queue.offer(num);
            }
        }
    }

    public double findMedian() {
        if (small_queue.size() > big_queue.size()) {
            return small_queue.peek();
        }
        if (small_queue.size() < big_queue.size()) {
            return big_queue.peek();
        }
        return (big_queue.peek() + small_queue.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */