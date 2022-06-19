package random_practice.JavaInterviewQuestions;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
    String word = "asdadakjsdadbhshdabsj";
        System.out.println("frequency: " + frequency(word));
    }

    public static String frequency(String sentence){
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if(!map.containsKey(c)) map.put(c,1);
            else map.put(c, map.get(c) +1);
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> each : map.entrySet() ){
            result.append(each.getKey()).append(each.getValue());
        }
        return new String(result);
    }

}
