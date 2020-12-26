import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName java21_02
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/26/9:15
 */




/*
 * 算术运算符：+  -  *   /  %
 * 关系运算符：==  >=  <=   !=   >   <
 * 逻辑运算符：&&  ||  ！  （布尔类型）
 *
 *  （p||q）&& r
 *   T  T  T    T
 *   T  T  F    F
 *   T  F  T    T
 *   T  F  F    F
 *   F  T  T    T
 *   F  T  F    F
 *   F  F  T    F
 *   F  F  F    F
 *
 *   !(p && Q)
 *
 *
 *
 *   短路规则
 *   a = 11;
 *   if(a++ > 10 || a-- <12)
 *   12
 *
 *      位运算（int）
 *      3 & 5   011
 *              101
 *              001
 *     = 1
 *     3 | 5                                   p | 0 = p   p | F = F
 *     = 111 = 7                               p & F = F   p & 0 = 0
 *
 *
 *     3 ^ 5（不同为1，相同为0）  :异或
 *     = 110
 *
 *
 *  移位运算符：>>(除2)     <<（乘2）
 *
 *  条件运算符：三目运算符。
 *
 *  运算符的优先级》多使用括号保证优先级。
 *  round /// 四舍五入
 *  ceil// 向上取整
 *  floor//先下取整
 *
 *    %.4s       %03d
 *    %-10s
 *
 *    illegalFormatConversionException(非法格式转换异常)
 *
 * */







class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class java21_02 {
    /*
        输入：1->2->4, 1->3->4
        输出：1->1->2->3->4->4
    *
    * */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = null ;
        if (l1.val < l2.val) {
            head = l1;
            l1 = l1.next;
        }else {
            head = l2;
            l2 = l2.next;
        }
        while (l1 != null && l2 != null) {

        }

        return head;

    }

    /*
     *   逻辑控制：
     *   1、顺序结构
     *   2、分支结构
     *   3、循环结构
     *
     *
     *
     *
     *
     *
     * */
    public static void main(String[] args) {
        int ROW = 5;
        int COL = 6;


        for (int i = 0; i < ROW ; i++) {
            for (int j = 0; j <= COL/2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*i; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
       /* Random random = new Random();
        int rnd = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int k = 3;
        while (k > 0) { //Ctrl + D结束
            int n = scanner.nextInt();
            if (n == rnd) {
                System.out.println("猜对了");
                break;
            } else if (n > rnd) {
                System.out.println("大了");
            } else {
                System.out.println("小了");
            }
            k--;
        }
        if (k <= 0) {
            System.out.println("次数已用完");
        }*/


       /* System.out.println(3 ^ 5);
        String b = " asd";
        switch ("asd") {
            case "asd":
                System.out.println("111");
                break;
                default:{
                    System.out.println("222");

                }
        }


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(10);

        System.out.println(a);*/
    }

}
