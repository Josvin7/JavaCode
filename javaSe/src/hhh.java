/**
 * @ClassName hhh
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/22/10:37
 */
class mmm {
    public static int a = initStatic();

    {
        System.out.println("A");
    }

    public mmm() {
        this("Hello");
        System.out.println("B");
    }

    public mmm(String s) {
        System.out.println("C");
    }

    public int b = init();

    public static int initStatic() {
        System.out.println("D");
        return 0;
    }

    public int init() {
        System.out.println("E");
        return 0;
    }

    static {
        System.out.println("F");
    }
}
//
public class hhh {
    public static void main(String[] args) {
        System.out.println("1");
        new mmm();
        System.out.println("2");
        new mmm();
        System.out.println("3");
    }
}

