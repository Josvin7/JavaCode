package com.wenhui.lession2;

import java.util.LinkedList;
        import java.util.Queue;
        import java.util.Scanner;
        import java.util.Stack;

/**
 * @ClassName pog1363
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/02/16:17
 */
public class pog1363 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            int tmp = scanner.nextInt();
            while (tmp != 0) {
                Queue<Integer> queue = new LinkedList<Integer>();
                queue.offer(tmp);
                for (int i = 1; i < n; i++) {
                    queue.offer(scanner.nextInt());
                }

                if (check_is_valid_order(queue)) {
                    System.out.println("Yes");

                } else {
                    System.out.println("No");
                }

                tmp = scanner.nextInt();
            }


            n = scanner.nextInt();
            if (n == 0) {
                System.out.println();
            }



        }


    }

    private static boolean check_is_valid_order(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<Integer>();
        //System.out.println(queue);
        int len = queue.size();
        for (int i = 1; i <= len; i++) {
            stack.push(i);
            while (!stack.isEmpty() && stack.peek() == queue.peek()) {
                stack.pop();
                queue.poll();
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }


}
