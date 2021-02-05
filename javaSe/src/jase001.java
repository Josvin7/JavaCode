

import java.util.Scanner;

/**
 * @ClassName jase001
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/05/10:12
 */
public class jase001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            Boolean[] booleans = new Boolean[100];
            for (int i = 0; i < 100 ; i++) {
                booleans[i] = false;
            }
            String ans = "";
            char[] chars = str.toCharArray();
            System.out.println(chars.length);
            for (int i = 0; i < chars.length; i++) {
                //System.out.println();
                if (!booleans[chars[i]-'A']) {
                    ans += chars[i];

                }
                booleans[chars[i] - 'A'] = true;
            }
            System.out.println(ans);
        }

    }
}
