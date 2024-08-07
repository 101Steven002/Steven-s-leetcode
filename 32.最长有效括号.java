/*
 * @lc app=leetcode.cn id=32 lang=java
 *
 * [32] 最长有效括号
 */

// @lc code=start

//顺序栈结构

// class Stack {
//     private char[] data;
//     private int top;
//     public Stack(int maxSize) {
//         data = new int[maxSize];
//         top = -1;
//     }
//     public boolean isEmpty() {
//         return top == -1;
//     }
//     public boolean isFull() {
//         return top == data.length - 1;
//     }
//     public void push(int value) {
//         if (!isFull()) {
//             data[++top] = value;
//         } else {
//             System.out.println("Stack is full, can't push!");
//         }
//     }
//     public int pop() {
//         if (!isEmpty()) {
//             return data[top--];
//         } else {
//             System.out.println("Stack is empty, can't pop!");
//             return -1;
//         }
//     }
//     public char peek() {
//         if (!isEmpty()) {
//             return data[top];
//         } else {
//             System.out.println("Stack is empty, can't peek!");
//             return -1;
//         }
//     }
//     public int size() {
//         return top + 1;
//     }
//     public void clear() {
//         top = -1;
//     }
//     public void display() {
//         for (int i = top; i >= 0; i--) {
//             System.out.print(data[i] + " ");
//         }
//         System.out.println();
//     }
// }

class Solution {
    public int longestValidParentheses(String s) {
        int maxLen = 0;
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if (c == '(')
            {
                stack.push(i);
            }
            else if (c == ')')
            {
                if (!stack.isEmpty())
                {
                    stack.pop();
                    maxLen += 2;
                }
            }
        }
        return maxLen;
    }
}
// @lc code=end

