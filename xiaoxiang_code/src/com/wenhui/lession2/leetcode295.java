package com.wenhui.lession2;

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
    //Lambda表达式，实现大根堆
    Queue<Integer> big_queue = new PriorityQueue<>((o1, o2) -> o2 - o1);

    /** initialize your data structure here. */
    public MedianFinder() {

    }

    public void addNum(int num) {
        if (big_queue.isEmpty()) {
            big_queue.offer(num);
            return;
        }
        // 情况一：两个堆大小相同【两个堆都能加元素，只要符合加入条件】
        if (big_queue.size() == small_queue.size()) {
            // 为保证大小堆大小的平衡需要进行调整
            //两个大小相同，如果num大于大堆堆顶元素，则添加到小堆（为什莫要添加到小堆的，小堆堆顶元素是最小的，小堆保存数据流中大的部分，这样小堆元素永远都大于大堆任何元素）
            if (num > big_queue.peek()) {
                small_queue.offer(num);

            // 否则添加到大堆
            } else {
                big_queue.offer(num);
            }
        // 情况二：大堆元素大小大于小堆【只能往小堆加元素，加入中需要进行判断调整并满足加入条件】
        } else if (big_queue.size() > small_queue.size()) {
            // 大堆元素多，为了保证大小的平衡性，一定是给小堆中添加元素，但是就不一定是num元素
            // 倘若num元素大于大堆的堆顶元素，这样也刚好符合向小堆添加元素的条件
            if (num > big_queue.peek()) {
                small_queue.offer(num);
            // 否则，需要进行调整，加到小堆中的元素一定是大堆中最大的元素（这时我们将num添加到大堆中，在从大堆中拿出堆顶加到小堆中）
            } else {
                // 注意先放进大根堆，在从大根堆拿出来加到小根堆
                big_queue.offer(num);
                small_queue.offer(big_queue.poll());

            }
        // 情况三：小堆元素大小大于大堆元素大小【只能往大堆加元素，加入中需要进行判断调整并满足加入条件】
        } else {
            // 小堆元素多，则需要将大堆中添加元素才能保证两个堆大小的平衡
            // num大于大堆堆顶，本应该是要添加到小堆，但是要保证大小的平衡，则先加到小堆，在从小堆中拿出堆顶元素加入到大堆
            if (num > big_queue.peek()) {
                // 同样先放在小根堆，在从小根堆中拿出最小的放到大根堆
                small_queue.offer(num);
                big_queue.offer(small_queue.poll());

            // num小于大堆堆顶我们应该往大堆添加，也正好符合大条件，之家加入即可
            } else {
                big_queue.offer(num);
            }
        }
    }

    public double findMedian() {

        //两个堆大小相同，则两个堆顶就是数据流中间的两个数，取平均值就是结果；
        if (small_queue.size() > big_queue.size()) {
            return small_queue.peek();
        }
        //如果`big_queue`大小大于`small_queue`大小，直接返回`big_queue`堆顶元素即可；
        if (small_queue.size() < big_queue.size()) {
            return big_queue.peek();
        }
        //两个堆大小相同，则两个堆顶就是数据流中间的两个数，取平均值就是结果；
        return (big_queue.peek() + small_queue.peek())/2.0;
    }
}

/**
 * Your com.wenhui.lession2.MedianFinder object will be instantiated and called as such:
 * com.wenhui.lession2.MedianFinder obj = new com.wenhui.lession2.MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */