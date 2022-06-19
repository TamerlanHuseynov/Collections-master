package LeetCode.medium_String_tasks;

import java.util.ArrayDeque;
import java.util.Deque;

public class T_921_Minimum_Add_to_Make_Parentheses_Valid {
//    https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
    public static void main(String[] args) {
        T_921_Minimum_Add_to_Make_Parentheses_Valid obj = new T_921_Minimum_Add_to_Make_Parentheses_Valid();
        String input = "())((";
        int expected = 3;
        System.out.printf("Expected result = %s%s", expected, "\n");
        System.out.printf("Actual result = %s", obj.minAddToMakeValid(input));
    }

    private int minAddToMakeValid(String s) {
        int count = 0;
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if(c == '(') stack.push(c);
            else{
                if(stack.isEmpty()) count++;
                else stack.pop();
            }
        }
        return stack.size() + count;
    }

}
