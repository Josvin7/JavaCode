package MyArrayList;

import java.util.Arrays;

/**
 * @ClassName MyArrayList
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/08/12:42
 */
public class MyArrayList implements MyList {
    private Integer[] array;
    private int size;

    public MyArrayList() {
        array = new Integer[16];
        size = 0;
    }

    //  供内部进行容量控制
    // 一旦执行后，可以保证容量肯定够用
    private void ensureCapacity() {

        if (size < array.length) {
            return;
        }
        // 进行扩容
        Integer[] newArray = new Integer[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }
        this.array = newArray;
    }

    @Override
    public boolean add(Integer e) {
        // TODO   需要考虑扩容的情况
        ensureCapacity();
        array[size] = e;// 尾插
        size++;

        return true;
    }

    @Override
    public void add(int index, Integer e) {
        //判断合法性
        if (index < 0 || index > size()) {
            //下标不合法，抛出异常
            throw new ArrayIndexOutOfBoundsException("index:" + index + ",Size:" + size);
        }
        //  进行插入操作
        /// 1、将[index,size)所有元素向后移动一格
        for (int from = size - 1; from >= index; from--) {
            array[from + 1] = array[from];
        }
        // 2、把元素放到 index 位置
        array[index] = e;
        // 3、size 增大1
        size++;


    }

    @Override
    public Integer remove(int index) {
        Integer ans = array[index];
        //判断合法性
        if (index < 0 || index >= size()) {
            //下标不合法，抛出异常
            throw new ArrayIndexOutOfBoundsException("index:" + index + ",Size:" + size);
        }
        // 把index+1位置开始。后边的元素向前移动一格
        for (int from = index+1; from < size; from++) {
            array[from -1] = array[from];
        }
        // 由于这里是引用类型。需要将size-1位置置为null
        array[size - 1] = null;// 基本类型不需要考虑
        //size-1
        size--;
        return ans;
    }

    @Override
    public boolean remove(Integer e) {
        int i = indexOf(e);
        if (i < 0) {
            return false;
        }
        remove(i);
        return true;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size()) {
            //下标不合法，抛出异常
            throw new ArrayIndexOutOfBoundsException("index:" + index + ",Size:" + size);
        }
        return array[index];
    }

    @Override
    public Integer set(int index, Integer e) {
        if (index < 0 || index >= size()) {
            //下标不合法，抛出异常
            throw new ArrayIndexOutOfBoundsException("index:" + index + ",Size:" + size);
        }
        Integer ans = array[index];
        array[index] = e;
        return ans;
    }

    @Override
    public boolean contains(Integer e) {
        return indexOf(e) >= 0;
    }

    @Override
    public int indexOf(Integer e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer e) {
        for (int i = size - 1; i >= 0; i--) {
            if (e.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        Arrays.fill(array, null);
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public MyIterator iterator() {
        return new MyArrayListIterator(this);
    }

    @Override
    public String toString() {
       /* return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';*/
        Integer[] toshow = Arrays.copyOf(array, size);
        return Arrays.toString(toshow);
    }


}
