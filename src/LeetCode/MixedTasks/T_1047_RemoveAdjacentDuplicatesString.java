package LeetCode.MixedTasks;

import java.util.Stack;

public class T_1047_RemoveAdjacentDuplicatesString {
    public static void main(String[] args) {

    }

    public static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack();

        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
                continue;
            }

            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()) { sb.append(stack.pop()); }

        return sb.toString();
    }

}
