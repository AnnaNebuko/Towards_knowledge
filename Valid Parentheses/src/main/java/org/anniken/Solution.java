package org.anniken;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() <= 1) return false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' ||
                ch == '[' ||
                ch == '{') {
                stack.push(s.charAt(i));
            }
            if (stack.isEmpty()) return false;

            if (ch == ')')
                if (stack.peek() == '(') {
                    stack.pop();
                } else return false;
            if (ch == ']')
                if (stack.peek() == '[') {
                    stack.pop();
                } else return false;
            if (ch == '}')
                if (stack.peek() == '{') {
                    stack.pop();
                } else return false;
        }
        return stack.isEmpty();
    }
}
