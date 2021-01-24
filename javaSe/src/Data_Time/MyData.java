package Data_Time;

/**
 * @ClassName MyData
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/24/14:58
 */

/**
 * 构造方法：
 * MyDate(MyDate date);
 * MyDate(int year, int month, int day);
 *
 * 对方方法:
 * public void next();      //  让日期往后走一天
 * public void previous();  // 让日期往前走一天
 *
 * public String toString();    // 返回日期的字符串表示形式 年-月-日
 */

public class MyData {
    private int year;
    private int month;
    private int day;

    public MyData(MyData date) {
        this.year = date.year;
        this.month = date.month;
        this.day = date.day;
    }

    public MyData(int year, int month, int day) {
        check(year, month, day);
        // 代码可以运行到这个位置，说明方法内部没有抛异常
        // 所以参数是合法的

        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%d-%02d-%02d", year, month, day);
    }

    // 日期向后走一天
    public void next() {
        day++;
        if (day <= getDayOfMonth(year, month)) {
            return;
        }

        month++;
        day = 1;
        if (month <= 12) {
            return;
        }

        year++;
        month = 1;
    }

    // 日期向前走一天
    public void previous() {
        day--;
        if (day >= 1) {
            return;
        }

        month--;
        if (month >= 1) {
            day = getDayOfMonth(year, month);   // 必须先对 month--，再计算有多少天
            return;
        }

        year--;
        month = 12;
        day = getDayOfMonth(year, month);
    }

    private static void check(int year, int month, int day) {
        if (month < 1 || month > 12) {
            throw new RuntimeException("month 的有效范围是 [1, 12]");
        }

        int days = getDayOfMonth(year, month);
        if (day < 1 || day > days) {
            throw new RuntimeException("day 的有效范围是 [1, " + days + "]");
        }
    }

    private static final int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int getDayOfMonth(int year, int month) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return DAYS[month - 1];
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
