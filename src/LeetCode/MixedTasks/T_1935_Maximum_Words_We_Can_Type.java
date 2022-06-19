package LeetCode.MixedTasks;

import java.util.HashSet;
import java.util.Set;

public class T_1935_Maximum_Words_We_Can_Type {
    public static void main(String[] args) {

        System.out.println(canBeTypedWords("hello world", "ad"));




    }
    public static int canBeTypedWords(String text, String brokenLetters) {
        if (text == null || text.isEmpty()) return 0;
        int count = 0;
        String[] words = text.split(" ");

        Set<Character> set = new HashSet<>();
        for(char c : brokenLetters.toCharArray()){
            set.add(c);
        }


        for (String word : words){
            boolean flag = true;
            for(char c : word.toCharArray()) {

                if (set.contains(c)) {
                    flag = false;
                    break;
                }
            }

        if(flag) count++;
        }
        return count;
    }



}
