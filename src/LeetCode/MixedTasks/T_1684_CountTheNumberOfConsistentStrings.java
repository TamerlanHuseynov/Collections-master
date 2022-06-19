package LeetCode.MixedTasks;

import java.util.HashSet;
import java.util.Set;

public class T_1684_CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings("ab", words));
//        expected 2
    }



    public int countConsistentStringsVersionOne(String allowed, String[] words) {

        int count = 0;
        int goodLetters = 0;

        for ( int i = 0; i < words.length; i++){

            for (int j = 0; j < words[i].length(); j++){
                if(allowed.indexOf(words[i].charAt(j))  == -1){
                    break;
                }else{
                    goodLetters++;
                }
            }
            if(goodLetters == words[i].length()){count++;}
            goodLetters = 0;
        }
        return count;
    }




    public static int countConsistentStrings(String allowed, String[] words) {
        boolean flag = true;
        int count = 0;
        Set<Character> hs = new HashSet<>();
        for (Character c : allowed.toCharArray()) hs.add(c);

        for (String word: words) {
            flag = true;
            for(char c: word.toCharArray()){
                if(!hs.contains(c)){
                    flag = false;
                    break;
                }
            }
        if(flag){count++;}
        }
        return count;
    }

    public int countConsistentStringsFASTESTONE(String allowed, String[] words) {

        final boolean[] allowedAsciiCodes = new boolean[26];

        for (char character : allowed.toCharArray()) {
            allowedAsciiCodes[(int) character - 97] = true;
        }

        int consistentWordsCount = 0;

        for (String word : words) {
            boolean isConsistent = true;

            for (char letter : word.toCharArray()) {
                if (!allowedAsciiCodes[letter - 97]) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent)
                consistentWordsCount++;
        }

        return consistentWordsCount;
    }


}
