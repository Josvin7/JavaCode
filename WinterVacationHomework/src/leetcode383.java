/**
 * @ClassName leetcode383
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/08/12:31
 */
public class leetcode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chars = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            chars[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            chars[ransomNote.charAt(i) - 'a']--;
            if (chars[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
