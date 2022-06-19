package random_practice.more_tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InvalidateParanthesisString {

    public static void main(String[] args) {
        String s = "{([a(c)v])(b)12[d]}";
        System.out.println("result: " + invalidate_parenthesis(s));
        System.out.println("IsValid = " + isValid(s));
    }

    public static boolean invalidate_parenthesis(String str) {
            if(str == null || str.isEmpty()) return true;
            Stack<Character> stack = new Stack<>();
            Map<Character, Character> open_map = new HashMap<Character, Character>(){{
                put('{', '}');
                put('[', ']');
                put('(', ')');
            }};
        Map<Character, Character> close_map = new HashMap<Character, Character>(){{
            put('}', '{');
            put(']', '[');
            put(')', '(');
        }};

            for(char c: str.toCharArray()){
                if(close_map.get(c) == null && open_map.get(c) == null) continue;
                else if(open_map.get(c) != null) stack.push(c);
                else if(stack.isEmpty() || stack.pop() != close_map.get(c) ) return false;
            }
            return stack.size()==0;
        }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='{' || c=='(' || c=='[') stack.push(c);
            else if(c=='}' || c==')' || c==']') {
                if(stack.isEmpty()) return false;
                char q = stack.pop();
                boolean check = true;
                if(c=='}') check = q=='{';
                else if(c==']') check = q=='[';
                else if(c==')') check = q=='(';

                if(!check) return false;
            }

        }
        return stack.size()==0;
    }


}
