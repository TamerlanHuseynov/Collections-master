package LeetCode.MixedTasks;

public class T_459_Repeated_Substring_Pattern {
//    https://leetcode.com/problems/repeated-substring-pattern/
    public static void main(String[] args) {
        T_459_Repeated_Substring_Pattern obj = new T_459_Repeated_Substring_Pattern();
        String input = "babbabbabbabbab"; // true
        System.out.printf("Result = %s", obj.repeatedSubstringPattern(input));
    }

    private boolean repeatedSubstringPattern(String s) {
        if(s == null) return false;
        int len = s.length();
        for(int i = len / 2 -1; i >= 0; i--) {
            if(len % (i +1) == 0 && s.charAt(i) == s.charAt(len-1))
                if ("".equals(s.replace(s.substring(0, i + 1), ""))) return true;
        }
        return false;
    }

}
