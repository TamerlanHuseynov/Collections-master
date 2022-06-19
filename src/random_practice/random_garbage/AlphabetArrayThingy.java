package random_practice.random_garbage;

import java.util.Map;
import java.util.TreeMap;

public class AlphabetArrayThingy {

    public static void main(String[] args) {

        AlphabetArrayThingy obj= new AlphabetArrayThingy();

        String input = "a1b11c4z5p0k2n3";
        System.out.println("obj.stringify(input)    = " + obj.stringify(input));
        System.out.println("obj.stringifyMap(input) = " + obj.stringifyMap(input));

    }

    private String stringify(String input) {
        //can add more guard clauses to validate input format.
        if(input == null) return null;
        StringBuilder builder = new StringBuilder();
        int[] alphabet = new int[26];
        char[] char_input = input.toCharArray();
        for(int i = 0; i < char_input.length; i++) {
            if(Character.isLetter(char_input[i])) {
                int digit_pointer = i+1;
                int how_many = 0;
                while(digit_pointer < char_input.length && Character.isDigit(char_input[digit_pointer] )) {
                        how_many = how_many * 10 + Character.getNumericValue(char_input[digit_pointer++]);
                }
                alphabet[char_input[i] - 97] += how_many;
                i = digit_pointer-1;
            }
        }
        for(int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > 0) {
                while (alphabet[i] > 0) {
                    builder.append((char) (97 + i));
                    alphabet[i]--;
                }
            }
        }
        return new String(builder);
    }

    private String stringifyMap(String input) {
        if(input == null) return null;
        Map<Character, Integer> map = new TreeMap<>();
        char[] char_input = input.toCharArray();
        for(int i = 0; i < char_input.length; i++) {
            if(Character.isLetter(char_input[i])) {
                int digit_pointer = i+1;
                int how_many = 0;
                while(digit_pointer < char_input.length && Character.isDigit(char_input[digit_pointer] )) {
                    how_many = how_many * 10 + Character.getNumericValue(char_input[digit_pointer++]);
                }
                if(!map.containsKey(char_input[i])) map.put(char_input[i], how_many);
                else map.put(char_input[i], map.get(char_input[i]) + how_many);
                i = digit_pointer-1;
            }
        }
        StringBuilder builder = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            int entry_value = entry.getValue();
            char entry_key = entry.getKey();
                while (entry_value > 0) {
                    builder.append(entry_key);
                    entry_value--;
            }
        }
        return new String(builder);
    }


    //TODO practice recursion maybe
    private String stringify_rec(String input) {
        char[] char_input = input.toCharArray();
        Map<Character, String> map = new TreeMap<>();
        StringBuilder builder = new StringBuilder();

        return null;
    }
    private int addCharacters(char[] input_chars, int index, Map<Character, String> map, StringBuilder builder) {
        if(index < input_chars.length) return 0;

        return -1;
    }


}
