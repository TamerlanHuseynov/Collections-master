package random_practice.Replits;

import java.util.*;

public class CountCharacters {

    public static void main(String[] args) {
        CountCharacters obj = new CountCharacters();
        String input = "aaabbc";
        System.out.printf("Result = %s", obj.countCharactersAgain(input));
//        obj.countCharacters(input);
    }

    private String countCharactersAgain(String str) {
        str = str.toLowerCase();
        StringBuilder builder = new StringBuilder();
        int[] alphabet = new int[26];

//        [9, 4, 1, 4, 1, 1, 1, 1, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 3, 2, 4]
//         a  b  c  d  e  f  g                                                        z

        // a - 97 = index 0
        // z = 122 - 97 = index 25

        for (char c : str.toCharArray() ) alphabet[c-97]++;
//        System.out.printf("Alphabet array looks like this: %s\n", Arrays.toString(alphabet));

        for(int i = 0; i < 26; i++) {
            if(alphabet[i] != 0) builder.append( (char)(97 + i) ).append(i);
        }

        return builder.toString();
    }


    private String countCharacters(String str) {
        Map<Character, Integer> map = new TreeMap<>();
        for (char c : str.toCharArray() ) {
            if(map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : map.entrySet() ) {
            result.append(entry.getKey()).append(entry.getValue());
        }
        return result.toString();
    }
}
