/**
 * @ClassName java_21_20210122
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/22/9:05
 */



/*
* 类：是静态方法和静态属性的集合，用来构造对象的模板
*
* 变量的三种形态：
* 1、局部变量
* 2、属性、实例变量
* 3、静态属性    类变量
*
*
*
*
*
*
*
*
*
* */
/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo1
 * @Description static关键字
 * @Author by房文辉
 * @Date 2020/3/20 19:19
 */


/*
*
*
* 类加载，只加载一次
*
* 当一个类首次被使用时，对该类进行加载，执行该类的静态1初始化过程。
*
* */
class Test1{
    public  int a;//普通成员变量  0
    //count被static所修饰，所有类共享。且不属于对象，访问方式为：类名 . 属性
    public static int count;//静态成员变量 在内存的方法区当中  只有一份
}
public class java_21_20210122 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.a++;
        Test1.count++;
        System.out.println(t1.a);//1
        System.out.println(Test1.count);//1
        System.out.println("============");
        Test1 t2 = new Test1();
        t2.a++;
        Test1.count++;
        System.out.println(t2.a);
        System.out.println(Test1.count);
    }
}


