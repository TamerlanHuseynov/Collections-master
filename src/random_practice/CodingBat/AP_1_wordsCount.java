package random_practice.CodingBat;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AP_1_wordsCount {
    public static void main(String[] args) {

        String[][] words = {{"a", "bb", "b", "ccc"}, //1
                            {"a", "bb", "b", "ccc"}, // 3
                            {"a", "bb", "b", "ccc"}, //4
                            {"xx", "yyy", "x", "yy", "z"}}; //1

        System.out.println(wordsCount(words[0], 1)); // -->2




    }

    private synchronized static int wordsCount(String[] words, int len) {

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i<words.length; i++){

            if(map.containsKey(words[i]) ) map.put(words[i], map.get(words[i])+1 );
            else map.put(words[i], 1 );
        }

        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        int count = 0;

        while(it.hasNext()){

            if(it.next().getValue()==len){

                count++;
                it.remove();
            }

        }
        return count;
    }

}
