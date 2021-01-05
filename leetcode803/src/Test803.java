import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Test803
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/05/10:39
 */
public class Test803 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }  else if (count >= 3) {
                list.add(Arrays.asList(i - count + 1, i));
                count = 1;
            }
        }
        return list;

    }
}
