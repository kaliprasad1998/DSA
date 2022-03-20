package org.java101;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
class ValidParentheses_Leet {
    public static void main(String[] args) {
        String input = "([}}])";
        boolean out = isValid(input);
        System.out.println(out);
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            boolean popped = false;
            char c = s.charAt(i);
            if (stack.empty() || c == '(' || c == '{' || c == '[') {
                stack.push(c);
                popped = true;
            } else {
                if (stack.peek() == '(' && c == ')') {
                    stack.pop();
                    popped = true;
                    continue;
                }
                if (stack.peek() == '{' && c == '}') {
                    stack.pop();
                    popped = true;
                    continue;
                }
                if (stack.peek() == '[' && c == ']') {
                    stack.pop();
                    popped = true;
                    continue;
                }

            }
            if (!popped) {
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}