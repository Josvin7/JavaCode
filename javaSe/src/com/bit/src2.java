package com.bit;

/**
 * @ClassName src2
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/01/20:20
 */
/*

class Base {

    Base() {

        System.out.print("Base");

    }

}

public class src2 extends Base {

    public static void main( String[] args ) {

        new src2();

        //调用父类无参的构造方法

        new Base();

    }
}
*/
class X{
    Y y=new Y();
    public X(){
        System.out.print("X");
    }
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
public class src2 extends X{
    Y y=new Y();
    public src2(){
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new src2();
    }
}