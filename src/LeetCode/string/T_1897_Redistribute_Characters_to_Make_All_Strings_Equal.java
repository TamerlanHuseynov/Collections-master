package LeetCode.string;

public class T_1897_Redistribute_Characters_to_Make_All_Strings_Equal {
    //    https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
    public static void main(String[] args) {
        T_1897_Redistribute_Characters_to_Make_All_Strings_Equal obj = new T_1897_Redistribute_Characters_to_Make_All_Strings_Equal();
        String[] input = {"abc", "aabc", "bc"}; //true
        System.out.println("Result = " + obj.makeEqual(input));
    }

    private boolean makeEqual(String[] words) {
        int[] alphabet = new int[26];
        for (String word : words) for (char c : word.toCharArray()) alphabet[c - 97]++;
        for (int i : alphabet) if (i % words.length != 0) return false;
        return true;
    }
}