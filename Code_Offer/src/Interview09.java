import java.util.Stack;

/**
 * @ClassName Interview09
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/11/15:59
 */
public class Interview09 {
    class CQueue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        public CQueue() {
            stack1 = new Stack<Integer>();// 负责入栈
            stack2 = new Stack<Integer>();// 负责出栈
        }

        // 尾插
        public void appendTail(int value) {
            stack1.add(value);// 直接入栈
        }

        // 头删
        public int deleteHead() {
            // stack2 不为空直接出栈，并返回
            if (!stack2.isEmpty()) {
                return stack2.pop();
            }
            // stack2为空，从stack1 往2 中压栈（全部）
            if(stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            // 如果 2 还是空直接返回 -1 ，否则 stack2 出栈即可
            return stack2.isEmpty() ? -1 : stack2.pop();
        }
    }
}
