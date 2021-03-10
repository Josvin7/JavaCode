package MyArrayList;

/**
 * @ClassName MyArrayListIterator
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/09/13:23
 */
public class MyArrayListIterator implements MyIterator {

    private MyArrayList arrayList;
    private int index;

    public MyArrayListIterator(MyArrayList arrayList) {
        this.arrayList = arrayList;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < arrayList.size();
    }

    @Override
    public Integer next() {
        Integer e = arrayList.get(index);
        index++;
        return e;
    }
}
