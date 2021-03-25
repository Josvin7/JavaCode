package leetcode;

import java.util.Stack;

/**
 * @ClassName leetcode31
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/03/25/11:13
 */
public class leetcode31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack1 = new Stack<>();
        for (int i = 0,j=0; i < popped.length; i++) {
            stack1.push(pushed[i]);
            while (j < popped.length && !stack1.isEmpty() && popped[j] == stack1.peek()) {
                stack1.pop();
                j++;
            }
        }
        return stack1.isEmpty();
    }
}
