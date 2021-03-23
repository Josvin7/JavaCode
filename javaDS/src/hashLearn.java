import java.util.HashMap;
import java.util.Scanner;

/**
 * @ClassName hashLearn
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/18/16:00
 */
public class hashLearn {



    // Zhang San
    // Zhan Ai
    static int calcSimilarity(String name1, String name2) {
        String[] name1Array = name1.split(" ");
        String[] name2Array = name2.split(" ");
        int ans = 0;
        int len = Math.min(name1Array.length, name2Array.length);
        for (int i = 0; i < len; i++) {
            ans += calcSimilarityHelper(name1Array[i],name2Array[i]);
        }
        if (name1Array.length > name2Array.length) {
            for (int i = len; i < name1Array.length; i++) {
                ans += countHelper(name1Array[i]);
            }
        } else if(name1Array.length < name2Array.length){
            for (int i = len; i < name2Array.length; i++) {
                ans += countHelper(name2Array[i]);
            }
        }
        return ans;
    }

    private static int countHelper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += s.charAt(i);
        }
        return count;
    }

    private static int calcSimilarityHelper(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 1; i <= str1.length(); i++) {
            dp[i][0] = dp[i - 1][0] + str1.charAt(i - 1);
        }
        for (int j = 1; j <= str2.length(); j++) {
            dp[0][j] = dp[0][j-1] + str2.charAt(j - 1);
        }
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                int tmp = 0;
                if (str1.charAt(i - 1) != str2.charAt(j - 1)) {
                    tmp = str1.charAt(i-1) + str2.charAt(j-1);
                }
                dp[i][j] = Math.min(dp[i-1][j]+str1.charAt(i-1),dp[i][j-1]+str2.charAt(j-1));
                dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + tmp);
            }
        }
        return dp[str1.length()][str2.length()];
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String name1 = in.nextLine();
            String name2 = in.nextLine();

            int sum = calcSimilarityHelper(name1, name2);
            System.out.println(sum);
        }
    }
}
