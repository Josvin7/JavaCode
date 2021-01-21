/**
 * @ClassName MyData
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/21/10:08
 */
public class MyData {

    public int year;
    public int month;
    public int day;

    public MyData(int year, int month, int day) {
        if (year < 1990) {
            throw new RuntimeException("参数错误");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int from_to( MyData from) {
        return -1;
    }

    @Override
    public String toString() {
        return String.format("%-4d %-4d %-2d", year, month, day);
    }
}
