import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Test1
 * @Description ${DESCRIPTION}
 * @Author Fangwenhui
 * @Date 2020/12/18/18:00
 */
public class Test1 {
    public static void main(String[] args) {
        String str = "aab";

        // char ans = (char)(str).chars().reduce(0, (a, b) -> a ^ b);
       char ans = (char)(str.chars().reduce((a, b) -> a ^ b).getAsInt());
        System.out.println(ans);

    }
}
// 结果为：120