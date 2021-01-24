/**
 * @ClassName Test11
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/24/15:16
 */
import Data_Time.MyDateTime;

import java.util.concurrent.TimeUnit;

public class Test11 {
    public static void main(String[] args) throws InterruptedException {
        MyDateTime datetime = new MyDateTime(2021, 1, 31, 23, 59, 53);
        MyDateTime datetime2 = new MyDateTime(datetime);

        datetime.next();
        datetime.next();
        System.out.println(datetime);
        System.out.println(datetime2);

        /*while (true) {
            System.out.println(datetime);
            datetime.next();
            TimeUnit.SECONDS.sleep(1);
        }*/
    }
}

