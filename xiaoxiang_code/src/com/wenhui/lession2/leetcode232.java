package com.wenhui.lession2;

import java.util.Stack;

/**
 * @ClassName leetcode232
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/01/23:37
 */
public class leetcode232 {
}
class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();

    }

    /** Get the front element. */
    public int peek() {
        if (!stack2.isEmpty()) {
            return stack2.peek();
        } else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (stack2.isEmpty() && stack1.isEmpty()) {
            return true;
        }
        return false;
    }
}
