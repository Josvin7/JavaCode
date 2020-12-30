/**
 * @ClassName Test
 * @Description ${DESCRIPTION}
 * @Author
 * @Date 2020/12/22/18:46
 */


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Test {

    public ListNode reverseList(ListNode head) {
        ListNode tmp ;
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            tmp = cur.next;
            cur.next = pre;

            pre = cur;
            cur = tmp;
        }
        return pre;
    }
    /*
    *
    * */

    /*

     */

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        while (head.val == val) {
            head = head.next;
            if (head == null) {
                return head;
            }
        }
        ListNode prev = head;
        ListNode cur = prev.next;

        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        return head;

    }
    /*

     * 方法只能出现在方法的内部，不能出现在方法的外部
     *
     * 房文辉
     * Ctrl + 鼠标左键查看源码
     *
     * 方法名动词，英文，小驼峰命名规则
     *
     * java数据类型
     * 1、八种基本数据类型  2、引用数据类型
     * 1、基本数据类型：
     * 整型：byte(-2^8  2^8-1)    、int 、short、 long
     * 浮点型：float、double    10.0 默认为 double 类型
     * 字符：char
     * 布尔类型：boolean  大小没有规定
     *
     * 字面量：10 -> int     10.0  -> double    .....
     *
     *
     * 类型转换：
     * 当等号两边类型不同时，就会发生类型转化
     *
     * 有两种情况：有损失和无损失
     *
     * 关于表达式类型  ---类型提升（type promotion）
     * long  + double  -->  double
     * int  +  long  -->
     *
     *变量的作用域（scope）：
     * int a = 10;
     * 打括号内，生命周期
     *
     *
     *
     *
     * 2、引用数据类型
     *
     *
     *
     * 注释快捷键：
     * 行注释Ctrl + /
     * 块注释：Ctrl + Shift + /
     *
     *
     *
     *
     *
     *
     *
     * 错误类型：
     * 1、语法错误，语法错误
     * 2、运行时错误
     *      1）运行时异常
     *      2）结果错误
     *
     * */


    public static void main(String[] args) {
        float aa = 10; //  四个字节
        double bb = 20;  //  八个字节a
        int ans = 100_000;

        char st = '\n';  // Unicode 2个字节  ASCII 是 Unicode 子集
        int a = st;

        String sr = "asd";

        String str = String.valueOf(1111);
        sr = sr.concat(str);

        int i = Integer.parseInt(sr);
        System.out.printf("%d", 10);
        System.out.println("Test.main");
        System.out.println(i);


        // ListNode
       /* byte  a = (byte) 128;  //一个字节
        short b = 20;  //两个字节
        int c = 30;  // 四个字节
        long d = 40;  // 八个字节


        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println("HELLO WORD");
        System.out.println(a);*/

    }

}
