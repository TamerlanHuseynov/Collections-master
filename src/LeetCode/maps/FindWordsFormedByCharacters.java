package LeetCode.maps;

import java.util.HashMap;
import java.util.Map;

public class FindWordsFormedByCharacters {
    public static void main(String[] args) {
        String[] arrOne = {"cat","bt","hat","tree"};
        String charsOne = "atach";
        System.out.println(countCharacters(arrOne,charsOne));

    }

    public static int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();

        for(Character c: chars.toCharArray()){
            if(map.containsKey(c)) map.put(c, map.get(c) +1);
            else map.put(c, 1);
        }

        int count = 0;
        for(String each: words){
            if(goodString(each, map))count+=each.length();
        }
        return count;
    }

    public static boolean goodString(String str, Map<Character, Integer> map){

        Map<Character, Integer> newMap = new HashMap<>(map);

        for(Character c: str.toCharArray()){
            if(!newMap.containsKey(c) || newMap.get(c) <= 0) return false;
            else newMap.put(c, newMap.get(c)-1);
        }
        return true;
    }

}
