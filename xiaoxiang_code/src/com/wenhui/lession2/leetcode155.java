package com.wenhui.lession2;

import java.util.Stack;

/**
 * @ClassName leetcode155
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/02/14:41
 */


class MinStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack = new Stack<>();


    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        //Stack<Integer> stack2 = new Stack<>();

        if (stack1.isEmpty()) {
            stack1.push(x);
            return;
        }
        if (stack1.peek() > x) {
            stack1.push(x);
        } else {
            stack1.push(stack1.peek());
        }


    }

    public void pop() {
        stack.pop();
        stack1.pop();
    }

    public int top() {
        return  stack.peek();

    }

    public int getMin() {
        return stack1.peek();

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
