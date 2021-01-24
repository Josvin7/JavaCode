class Range {
    // 属性，区间的上限下标 + 区间的下限下标
    // 这里选用左闭右闭
    private final long[] array;
    private int lowIndex;
    private int highIndex;
    // 区间 array[lowIndex, highIndex]

    public Range(long[] array) {
        this.array = array;
        this.lowIndex = 0;
        this.highIndex = array.length - 1;
    }

    public int size() {
        return highIndex - lowIndex + 1;
    }

    public long getMiddleValue() {
        return array[getMiddleIndex()];
    }

    public int getMiddleIndex() {
        return (lowIndex + highIndex) / 2;
    }

    public void discardRightPart() {
        highIndex = getMiddleIndex() - 1;
    }

    public void discardLeftPart() {
        lowIndex = getMiddleIndex() + 1;
    }
}

public class BinarySearch {
    // 二分查找，不需要一个 BinarySearch 对象
    // 所以，可以用 static，可以不用
    public static int binarySearch(long[] array, long target) {
        Range range = new Range(array); // 把数组抽象成区间对象

        while (range.size() > 0) {
            long middleValue = range.getMiddleValue();

            if (target == middleValue) {
                return range.getMiddleIndex();
            } else if (target < middleValue) {
                range.discardRightPart();
            } else {
                range.discardLeftPart();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        long[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(binarySearch(array, 1));
    }
}
