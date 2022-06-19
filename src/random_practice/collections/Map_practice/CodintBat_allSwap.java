package random_practice.collections.Map_practice;

import java.util.HashMap;
import java.util.Map;

public class CodintBat_allSwap {
    public static void main(String[] args) {
        String[] arr1 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
//        expected:      "ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"

        String[] arr2 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
//        expected:      "ay", "by", "ax", "bx", "aj", "ai", "by", "bx"

    }

    public String[] allSwap(String[] strings) {

        Map<Character, Integer> map = new HashMap<>();
        String[] result = new String[strings.length];

        for(int i=0;i<strings.length;i++){

            char firstChar = strings[i].charAt(0);

            if(map.containsKey(firstChar) && map.get(firstChar) >= 0 ){

                int index = map.get(firstChar);
                map.put(firstChar, -1);

                result[i] = result[index];
                result[index] = strings[i];

            }else{

                result[i] = strings[i];

                if(!map.containsKey(firstChar) ){

                    map.put(firstChar, i);

                }

            }

        }
        return result;
    }


}
