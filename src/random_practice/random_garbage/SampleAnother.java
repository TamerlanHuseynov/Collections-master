package random_practice.random_garbage;

import java.util.HashMap;
import java.util.Map;

public class SampleAnother {
    public static void main(String[] args) {
        String word = "aabbbcccdddeeqjkhdkjasasasjkdhashjkaaa";
        System.out.println("printDuplicates2(word) = " + printDuplicates2(word));

    }

    public static String printDuplicates1(String str){
        // 10 characters long ==>> O(n^3)  => 10*10*10 => 1000 operation
        String result = "";
        for (int i = 0; i<str.length();i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j) &&
                        !result.contains(String.valueOf(str.charAt(i)) )) count++;
            }
            result += String.valueOf(str.charAt(i))+count+" ";
        }
        return result;
    }

    public static String printDuplicates2(String str){
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : str.toCharArray()) {
            // if input is 10 ===> 10 operation to populate the map with values
            if(map.containsKey(c)) map.put(c, map.get(c)+1);
            else map.put(c,1);

        }
        System.out.println(map);
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                b.append(str.charAt(i)).append(map.get(str.charAt(i))).append(" ");
                map.remove(str.charAt(i));
            }
        }
//        10+10 = 20
        return new String(b);
    }
}
