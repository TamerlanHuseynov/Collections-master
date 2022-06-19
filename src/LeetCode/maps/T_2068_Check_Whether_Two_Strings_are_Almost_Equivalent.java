package LeetCode.maps;

public class T_2068_Check_Whether_Two_Strings_are_Almost_Equivalent {
//    https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/
    public static void main(String[] args) {
        T_2068_Check_Whether_Two_Strings_are_Almost_Equivalent obj =
                new T_2068_Check_Whether_Two_Strings_are_Almost_Equivalent();
        String str1 = "aaaa"; //Expected false
        String str2 = "bccb";
        System.out.println("Result = " + obj.checkAlmostEquivalent(str1, str2));
    }

    private boolean checkAlmostEquivalent(String word1, String word2) {
        int[] w1 = new int[26];
        int[] w2 = new int[26];
        for(char c: word1.toCharArray()) w1[c-'a']++;
        for(char c: word2.toCharArray()) w2[c-'a']++;
        for(int i = 0; i < 26; i++) if(Math.abs(w1[i] - w2[i]) > 3) return false;
        return true;
    }
}
