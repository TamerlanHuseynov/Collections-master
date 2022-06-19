package random_practice.random_garbage;

import java.util.HashMap;
import java.util.Map;

public class DoesWordConsistOfAllLetters {
    public static void main(String[] args) {

        String[] strArr = {"aabc", "abcdb", "gggh", "klsrtabcabc",
                "78787*79789", "aaffdfddddddddddddd"};

        char[] credentials = {'a', 'b', 'b', 'c'};
        //   output = "abcdb", "klsrtabcabc"

        Map<Character, Integer> cred = new HashMap<>();

        for (char c : credentials) {
            if(cred.containsKey(c)) cred.put(c, cred.get(c)+1);
            else cred.put(c, 1);
        }

        for (String s : strArr) { if(pew(s, cred )) System.out.println(s); }

    }

    public static boolean pew(String word, Map<Character, Integer> credentials){

        Map<Character, Integer> wordMap = new HashMap<>();

        for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                if(wordMap.containsKey(c)) wordMap.put(c, wordMap.get(c)+1);
                else wordMap.put(c, 1);
            }

            for(Map.Entry<Character, Integer> entry: credentials.entrySet()){
            //check if all are contained in there...
                Character key = entry.getKey();
                Integer value = entry.getValue();

                if(!(wordMap.containsKey(key) && wordMap.get(key) >= value)) return false;
            }

        return true;
    }




}
