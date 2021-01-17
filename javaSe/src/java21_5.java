import java.util.Arrays;

/**
 * @ClassName java21_5
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/17/14:35
 */
public class java21_5 {
    /*
     * java中的数据类型
     * （基本数据类型，引用类型）
     * 变量形态
     * （局部变量，静态属性，属性）
     * JVM 运行时内存区域
     * 栈---
     * 栈帧==方法
     * 栈帧中保存的局部变量
     *
     * */

    /*
     * java 中常见的一些类、方法
     * sout
     * Scanner
     * Random
     *
     *
     * */

    /*
     * 数组（Arrays）-- 一种数据类型   引用类型
     * 1、理解神魔是数组
     * 2、语法规则
     * 3、引用类型
     * 4、形参改变对实参之间的影响规则 ****
     * 5、数组的常见方法 和类 （java.util.Arrays）
     *
     *
     * */

    //数组是一组元素的集合

    public static void main(String[] args) {
        int[] array = new int[23];

        /*
        * int[] 初始 0
        * 每种变量都有默认值（局部变量没有默认值）
        * boolean  false
        * char     0x0000 对应的字符
        * 引用类型   null
        *
        * */
        //

        System.out.println(Arrays.toString(array));
        int[] a = {1, 2, 3, 4};// 初始化而不是赋值
       // 错误示例： a= {1, 2, 3, 4};  不能整体赋值
        System.out.println(Arrays.toString(a));


        int[] b = new int[]{1, 2, 3, 4};
        int len = a.length;

        //全部便利
        for (int aa: b
             ) {
            System.out.println(aa);
        }


        for (int i = 0; i < len
                ; i++) {
            //范围便利
        }


        /*
        * 1、数组元素的线性集合
        * 2、特点： 长度固定/下标访问范围[0，a.length）
        * 3、作为一种数据类型，可以出现在任何需要类型的位置
        *  元素类型：int  。。。。
        *
        * 4、初始化语法
        * 5、未赋初值，具有默认值
        * 6、操作
        *   1、获取长度
        *   2、下标操作
        *   3、注意访问越界
        *
        *
        * 7、打印：Arrays.toString()
        * 8、遍历：for  for each
        *
        *
        *
        * */



        sseeee();
        // 数组越界异常
    }

    private static void sseeee() {
        int[] array = new int[123];
        Arrays.fill(array, 100);
    }

    /*
     * 关于数组的初始化
     * int[] a = {1, 2, 3, 4};
     * 1、定义int 类型的数组
     * 2、为其进行初始化操作 -- 包含四个元素
     * 3、
     *
     *
     *
     * */
    public static int indexOf(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }


}
