package LeetCode.maps;

import java.util.HashMap;
import java.util.Map;

public class T_2085_Count_Common_Words_With_One_Occurrence {
    public static void main(String[] args) {
        T_2085_Count_Common_Words_With_One_Occurrence obj = new T_2085_Count_Common_Words_With_One_Occurrence();
        String[] words_1 = {"leetcode","is","amazing","as","is"};
        String[] words_2 = {"amazing","leetcode","is"};

        System.out.println(obj.countWords(words_1, words_2));

    }

    private int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map_one = new HashMap<>();
        Map<String, Integer> map_two = new HashMap<>();

        for(String word1: words1){
            if(map_one.containsKey(word1)) map_one.put(word1, map_one.get(word1)+1);
            else map_one.put(word1, 1);
        }

        for(String word2: words2){
            if(map_two.containsKey(word2)) map_two.put(word2, map_two.get(word2)+1);
            else map_two.put(word2, 1);
        }

        int count = 0;
        for(Map.Entry<String, Integer> entry: map_one.entrySet()) {

            if(entry.getValue() == 1){
                if(map_two.get(entry.getKey()) != null && map_two.get(entry.getKey()) == 1) count++;
            }
        }
        return count;
    }

}
