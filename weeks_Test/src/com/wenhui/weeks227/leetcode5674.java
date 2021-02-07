package com.wenhui.weeks227;

/**
 * @ClassName leetcode5674
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/07/13:12
 */
public class leetcode5674 {
    public String largestMerge(String word1, String word2) {
        String ans = "";
        int i = 0, j = 0;
        int flag = 0;
        for (; i < word1.length() && j < word2.length(); i++,j++) {
            String tmp = "";
            while (i < word1.length() && j < word2.length() && word1.charAt(i) == word2.charAt(j)) {
                tmp = tmp + word1.charAt(flag);
                flag++;
            }
            while (i<word1.length() && word1.charAt(i) > word2.charAt(j)) {
                ans += word1.charAt(i);
                i++;
            }

            if (i == word1.length()) {
                break;
            }
            while (j < word2.length() && word1.charAt(i) < word2.charAt(j)) {
                ans += word2.charAt(j);
                j++;
            }
        }
        if (i >= word1.length()) {
            ans += word2.substring(j, word2.length());
        }
        if (j >= word2.length()) {
            ans += word1.substring(i, word1.length());
        }
        return ans;
    }

}
