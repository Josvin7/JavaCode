package com.bit.src1;

/**
 * @ClassName TestDemo2
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/28/9:42
 */
/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo2
 * @Description
 * @Author by
 * @Date 2020/4/4 18:32
 */
class Shape {
    public void Draw() {
    }
}
class Cycle extends Shape {
    @Override
    public void Draw() {
        System.out.println("这是一个○！");
    }
}
class Rect extends Shape{
    @Override
    public void Draw() {
        System.out.println("这是一个矩形！");
    }
}
class Flower extends Shape {
    @Override
    public void Draw() {
        System.out.println("花一朵蕐");
    }
}
public class TestDemo2 {
    public static void drawFun(Shape shape) {
        shape.Draw();
    }
    public static void main(String[] args) {
        Shape[] shapes = {new Cycle(),new Rect(),new Flower()};
        for (Shape shape:shapes) {
            shape.Draw();
            System.out.println("=========");
            drawFun(shape);
            System.out.println("================");
        }
    }
    public static void main1(String[] args) {
        Shape shape1 = new Rect();
        shape1.Draw();
        Shape shape2 = new Cycle();
        shape2.Draw();
        System.out.println("=================");
        drawFun(shape1);
        drawFun(shape2);
    }

    public static void swapArray(int[] array1, int[] array2) {
        int len = array1.length;
        for (int i = 0; i < len; i++) {
            int tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }
    }

    public int sum(int[] array) {
        int len = array.length;
        int sun = 0;
        for (int num : array
                ) {
            sun += num;
        }
        return sun;
    }
}

/*
* 引用类型和对象不同时，能执行谁看的是引用类型，执行那个看的是对象
* */