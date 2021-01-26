package bit.java.se;

import java.util.Arrays;

/**
 * @ClassName Hello
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/25/15:34
 */

/*
* 包
* 1、如何声明一个类属于某个包
* 1、需要开头通过 package 声明
* 2、需要将java文件放到对应的文件夹
*
*
* 尽量每一个类都属于某个包
*
* 规范：每个组织的包名，是你的域名的反写
* javase.wenhui.com
*
* com.wenhui.javase.类
*
* 例如：com.qq.music.类
* com.wemxin.music.类
*
*
* com.wenhuifang.javase.learn_package.Demo1
*
*
*
*
* 2、如何在一个类中使用其他类
*
*  1、两个类属于同一个包，直接使用
*  2、否则，必须import 包名
*
*
* */
public class Hello {
    public static void main1(String[] args) {

        String str = "我是中国人！";
        int index = 0;
        System.out.println(str.charAt(0) == '我');
        char[] chars = str.toCharArray();
        System.out.println(chars);
        System.out.println("hello");
    }

    public static void main3(String[] args) {
        String s = "123.45.6543.2";
        System.out.println(Arrays.toString(s.split(".")));

        //reg
        // 输出为【】因为. 在正则表达式中有特殊用途，需要转义
        System.out.println(Arrays.toString(s.split("\\.")));
    }

    public static void main(String[] args) {
        String[] aray = {"woshi1", "qsq"};
        // 和 spilt 相反

        System.out.println(String.join("+",aray));
    }
}
