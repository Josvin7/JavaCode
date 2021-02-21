package day9;

/**
 * @ClassName leetcode67
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/21/14:46
 */
public class leetcode67 {
    public static String addBinary(String a, String b) {
        char[] charsa = a.toCharArray();
        char[] charsb = b.toCharArray();
        int i = charsa.length - 1;
        int j = charsb.length - 1;
        int flag = 0;
        while (i >= 0 && j >= 0) {
            int tmp = charsa[i] + charsa[j] - '0' - '0' + flag;

            if (tmp > 1) {
                tmp = tmp - 2;
                flag = 1;
            } else {
                flag = 0;
            }
            charsa[i] = (char) (tmp+'0');
            i--;
            j--;
        }
        int fff = 0;
        while (i >= 0 ) {
            fff = 2;
            int tmp = charsa[i] - '0' + flag;
            if (tmp > 1) {
                tmp = tmp - 2;
                flag = 1;
            } else {
                flag = 0;
            }
            charsa[i] = (char) (tmp+'0');
            //return String.valueOf(charsa);
            i--;
        }
        if (j >= 0) {
            for (int k = j + 1; k < charsb.length; k++) {
                charsb[k] = charsa[i + 1];
                i++;
            }
        }
        while (j >= 0) {
            fff = 1;
            int tmp = charsa[j] - '0' + flag;
            if (tmp > 1) {
                tmp = tmp - 2;
                flag = 1;
            } else {
                flag = 0;
            }
            charsa[j] = (char) (tmp+'0');
            /*for (int k = j + 1; k < charsb.length; k++) {
                charsb[k] = charsa[i + 1];
                i++;
            }*/
            //return String.valueOf(charsb);
            j--;
        }
        if (fff == 2) {
            if (flag == 1) {
                String str = String.valueOf(charsa);
                return 1 + str;
            } else {
                return String.valueOf(charsa);
            }
        } else if(fff ==1){
            if (flag == 1) {
                String str = String.valueOf(charsb);
                return 1 + str;
            } else {
                return String.valueOf(charsb);
            }
        }

        if (flag == 1) {
            String str = String.valueOf(charsa);
            return 1 + str;
        } else {
            return String.valueOf(charsa);
        }

    }

    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }
}
