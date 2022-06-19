package LeetCode.string;

import java.util.Arrays;

public class T_309_Decrypt_String_from_Alphabet_to_Integer_Mapping {
//    https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
    public static void main(String[] args) {
        T_309_Decrypt_String_from_Alphabet_to_Integer_Mapping obj = new T_309_Decrypt_String_from_Alphabet_to_Integer_Mapping();

        String s = "10#11#12";
        System.out.println(obj.freqAlphabets(s));
    }

    private String freqAlphabets(String s) {
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i = chars.length-1; i >= 0; i--) {
            if(chars[i] == '#') {
                builder.append( (char)(Character.getNumericValue(chars[i-2]) * 10
                                     + Character.getNumericValue(chars[i-1]) + 96));
                i -= 2;
            }else{
                builder.append( (char)(Character.getNumericValue(chars[i]) +96) );
            }
        }

      return builder.reverse().toString();
    }
}
