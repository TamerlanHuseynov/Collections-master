package LeetCode.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseCodeMap {
    public static void main(String[] args) {
        String[] pew = {"hello", "world"};
    uniqueMorseRepresentations(pew);
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseLetters = {".-", "-...", "-.-.", "-..", ".", "..-.",
                                 "--.", "....", "..", ".---", "-.-", ".-..",
                                 "--", "-.", "---", ".--.", "--.-", ".-.",
                                 "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Map<Character, String> morseMap = new HashMap<>();
        for (int i = 0; i < morseLetters.length; i++) {
            morseMap.put((char)(97+i), morseLetters[i]);
        }

        List<String> listOfStrings = new ArrayList<>(words.length);

        for (String each: words){
            StringBuilder builder = new StringBuilder();
            char[] arr = each.toCharArray();
            for (int i = 0; i < arr.length; i++) {
            builder.append(morseMap.get(arr[i]));
            }
            listOfStrings.add(new String(builder));
        }

        List<String> assertThis = listOfStrings.stream().distinct().collect(Collectors.toList());
        return assertThis.size();
    }
}
