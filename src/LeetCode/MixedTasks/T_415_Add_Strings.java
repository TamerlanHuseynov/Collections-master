package LeetCode.MixedTasks;

import java.math.BigDecimal;
import java.util.Stack;

public class T_415_Add_Strings {
//    https://leetcode.com/problems/add-strings/
    public static void main(String[] args) {
        T_415_Add_Strings obj = new T_415_Add_Strings();
        String one = "123";
        String two = "345"; // Expected 468

        String three = "456";
        String four = "77"; // Expected = 533

        String five = "98";
        String six = "9"; // Expected 107

        System.out.printf("Result = %s", obj.addStringsManually(three, four));
    }

    private String addStrings(String num1, String num2) {
        return new BigDecimal(num1).add(new BigDecimal(num2)).toString();
    }

    private String addStringsManually(String num1, String num2) {
        StringBuilder builder = new StringBuilder();
        int remainder = 0;
        int num1_len = num1.length();
        int num2_len = num2.length();
        int num1_pointer = num1_len - 1;
        int num2_pointer = num2_len - 1;

        while(num1_pointer >-1 && num2_pointer > -1){
            int sum = (Character.getNumericValue(num1.charAt(num1_pointer)))
                    + (Character.getNumericValue(num2.charAt(num2_pointer))) +
                    remainder;
            remainder = sum / 10;
            builder.append(sum % 10);
            num1_pointer--;
            num2_pointer--;
        }
        while(num1_pointer > -1) {
            int sum = (Character.getNumericValue(num1.charAt(num1_pointer--))) + remainder;
            remainder = sum / 10;
            builder.append(sum % 10);
        }
        while(num2_pointer > -1) {
            int sum = (Character.getNumericValue(num2.charAt(num2_pointer--))) + remainder;
            remainder = sum / 10;
            builder.append(sum % 10);
        }
        if(remainder > 0) builder.append(remainder);
        return builder.reverse().toString();
    }

    private String sumNumsByHand(String num1, String num2) {
        int remainder = 0;
        // keep num1 shorter one
        if(num1.length() > num2.length()) {
            String tmp = num2;
            num2 = num1;
            num1 = tmp;
        }
        StringBuilder builder = new StringBuilder();
        int number_one = num1.length()-1;
        int number_two = num2.length()-1;
        for(int i = 0; i < num2.length(); i++) {
            int num1Num = i >= num1.length() ? 0 : num1.charAt(number_one-i) - '0';
            int num2Num = num2.charAt(number_two-i) - '0';
            int sum = num1Num + num2Num + remainder;
            remainder = sum / 10;
            int cur = sum % 10;
            builder.append((char)(cur+'0'));
        }
        if(remainder > 0) builder.append((char)(remainder+'0'));
        return builder.reverse().toString();
    }

    private String sumUpStringsWithStack(String num1, String num2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for(char number_one : num1.toCharArray()) stack1.push(Character.getNumericValue(number_one));
        for(char number_two : num2.toCharArray()) stack2.push(Character.getNumericValue(number_two));
        StringBuilder sb = new StringBuilder();
        int remainder = 0;
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            int sum = stack1.pop() + stack2.pop() + remainder;
            sb.append(sum % 10);
            remainder = sum / 10;
        }
        while (!stack1.isEmpty()) {
            int sum = stack1.pop() + remainder;
            sb.append(sum % 10);
            remainder = sum / 10;
        }
        while (!stack2.isEmpty()) {
            int sum = stack2.pop() + remainder;
            sb.append(sum % 10);
            remainder = sum / 10;
        }
        if (remainder > 0)
            sb.append(remainder);
        return sb.reverse().toString();
    }

    public String recursive_wrapper_addStrings(String num1, String num2) {
        return recursiveAddString(num1, num1.length() - 1, num2, num2.length() - 1, new StringBuilder(), false);
    }

    public String recursiveAddString(String num1, int pointer1, String num2, int pointer2, StringBuilder builder, boolean remainder) {
        if(pointer1 < 0 && pointer2 < 0) {
            if (remainder) builder.append(1);
            builder.reverse();
            return builder.toString();
        }
        int sum = 0;
        if (0 <= pointer1) sum += num1.charAt(pointer1)-'0';
        if (0 <= pointer2) sum += num2.charAt(pointer2)-'0';
        if (remainder) sum++;
        builder.append(sum % 10);
        pointer1--;
        pointer2--;
        return recursiveAddString(num1, pointer1, num2, pointer2, builder, sum / 10 == 1);
    }

    public String addStringsAgain(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        for (int i = num1.length() - 1, j = num2.length() - 1, carry = 0; i >= 0 || j >= 0 || carry != 0; i--, j--) {
            int sum = carry;
            if (i >= 0) sum += Character.digit(num1.charAt(i), 10);
            if (j >= 0) sum += Character.digit(num2.charAt(j), 10);
            carry = sum / 10;
            result.append(sum % 10);
        }
        return result.reverse().toString();
    }
}
