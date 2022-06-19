package LeetCode.string;

public class T_521_Longest_Uncommon_Subsequence_I {
//    https://leetcode.com/problems/longest-uncommon-subsequence-i/
    public static void main(String[] args) {
        T_521_Longest_Uncommon_Subsequence_I obj = new T_521_Longest_Uncommon_Subsequence_I();
        String a = "aba";
        String b = "cdc";
        System.out.println("Result = " + obj.findLUSlength(a, b));
    }

    private int findLUSlength(String a, String b) {
        int a_len = a.length();
        int b_len = b.length();
        if(a.equals(b)) return -1;
        if(a_len > b_len) return a_len;
        else return b_len;
    }
}
