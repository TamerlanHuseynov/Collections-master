package LeetCode.MixedTasks;

import java.util.HashMap;
import java.util.Map;

public class T_953_Verifying_an_Alien_Dictionary {
//    https://leetcode.com/problems/verifying-an-alien-dictionary/
    public static void main(String[] args) {
        T_953_Verifying_an_Alien_Dictionary obj = new T_953_Verifying_an_Alien_Dictionary();
        String[] words = {"hello","leetcode"};
        String alphabet = "hlabcdefgijkmnopqrstuvwxyz";
        // ^ expected - true
        System.out.println("Result = " + obj.isAlienSorted(words, alphabet));

    }

    private boolean isAlienSorted(String[] words, String order) {
    if(words.length <= 1) return true;
    Map<Character, Integer> map = new HashMap<>();
    int pos = 0;
        for(char c: order.toCharArray()) map.put(c, pos++);
        for(int i = 1; i < words.length; i++)
            if(!isAlienSorted(words[i-1], words[i], map) ) return false;
        return true;
}

    private boolean isAlienSorted(String word1, String word2, Map<Character, Integer> map) {
        int w1_pointer = 0, w2_pointer = 0;
        while(w1_pointer < word1.length() && w2_pointer < word2.length() ) {
            int char1_pos = map.get(word1.charAt(w1_pointer++));
            int char2_pos = map.get(word2.charAt(w2_pointer++));
            if(char1_pos == char2_pos) continue;
            else return char1_pos < char2_pos;
        }
        return word1.length() <= word2.length();
    }

}
