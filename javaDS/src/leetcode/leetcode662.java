package leetcode;

/**
 * @ClassName leetcode662
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/25/16:41
 */


public class leetcode662 {
    private int[] array;
    private int firstIndex;
    private int lastIndex;
    private int size;


    public leetcode662(int k) {
        array = new int[k];
        size = k;
        firstIndex = 0;
        lastIndex = 0;

    }

    public boolean enQueue(int value) {
        if (size <= 0) {
            return false;
        }
        if (lastIndex == -1) {
            lastIndex++;
        }
        array[lastIndex] = value;
        lastIndex += 1;
        size--;
        if (lastIndex == array.length) {
            if (size == 0) {
                lastIndex = -1;
            } else {
                lastIndex = 0;
            }
        }
        return true;
    }

    public boolean deQueue() {
        if (size == array.length) {
            return false;
        }
        firstIndex = firstIndex + 1;
        size++;
        if (firstIndex == array.length) {
            firstIndex = 0;
        }
        return true;
    }

    public int Front() {

        if (size == array.length) {
            return -1;
        }
        return array[firstIndex];
    }

    public int Rear() {
        if (size == array.length) {
            return -1;
        }
        if (lastIndex == -1 && size == 0) {
            return array[array.length - 1];
        }
        if (lastIndex == 0 && size > 0) {
            return array[array.length - 1];
        }
        return array[lastIndex - 1];
    }

    public boolean isEmpty() {
        if (size == array.length) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (size == 0) {
            return true;
        }
        return false;
    }
}
