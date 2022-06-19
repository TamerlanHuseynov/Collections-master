package random_practice.collections.Map_practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CodingBat_firstSwap {
    public static void main(String[] args) {
/*
        firstSwap(["ab", "ac"]) → ["ac", "ab"]
        firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
        firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
*/

        String[] arr = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] arr2 = {"ax", "bx", "cx", "ay", "cy", "aaa", "abb"};
//        expected:     ["ay", "bx", "cy", "ax", "cx", "aaa", "abb"]
//        actual:       [ay, bx, cy, ax, cx, aaa, abb]
        System.out.println(Arrays.toString(firstSwap(arr2)));


    }

        public static String[] firstSwap(String[] strings) {

            String[] result=new String[strings.length];
            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < strings.length; i++) {

                char firstChar  = strings[i].charAt(0);

                if (map.containsKey(firstChar)&&map.get(firstChar)>=0){

                    int index=map.get(firstChar);
                    map.put(firstChar,-1);

                    result[i]=result[index];
                    result[index]=strings[i];
                }
                else{

                    result[i]=strings[i];
                    if (!map.containsKey(firstChar))
                        map.put(firstChar,i);
                }
            }
            return result;
        }

}
