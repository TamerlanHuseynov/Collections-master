package LeetCode.MixedTasks;

import java.util.HashSet;
import java.util.Set;

public class T_1805_Number_of_Different_Integers_in_a_String {
//    https://leetcode.com/problems/number-of-different-integers-in-a-string/
    public static void main(String[] args) {
        T_1805_Number_of_Different_Integers_in_a_String obj = new T_1805_Number_of_Different_Integers_in_a_String();
        String input = "a123bc34d8ef34";
        System.out.println("Result = " + obj.numDifferentIntegers(input));
    }

    private int numDifferentIntegers(String word) {
        word = word.replaceAll("\\D+"," ").trim();
        Set<String> set = new HashSet<>();
        String[] nums = word.split(" ");
        for(String num : nums) set.add(num.replaceFirst("^0+(?!$)", ""));
        if(word.length()==0)return 0;
        return set.size();
    }
}
