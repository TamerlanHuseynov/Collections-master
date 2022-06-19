package LeetCode.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T_748_Shortest_Completing_Word {
    public static void main(String[] args) {

        String plate = "1s3 PSt"; // ss p t
        String[] words = {"steps"};
                //,"steps", "stripe", "stepple"};

        System.out.println(shortestCompletingWord(plate, words));

    }


    public static String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                Character pew = Character.toLowerCase(c);
                if (map.containsKey(pew)) map.put(pew, map.get(pew) + 1);
                else map.put(pew, 1);
            }
        }
        for (String word : words) {
            Map<Character, Integer> mapZ = new HashMap<>(map);
            for (char c : word.toCharArray()) {
                if (mapZ.containsKey(c)) {
                    if (mapZ.get(c) > 0) mapZ.put(c, mapZ.get(c) - 1);
                    if (mapZ.get(c) < 1) mapZ.remove(c);
                }
                if (mapZ.isEmpty()) list.add(word);
            }
        }
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < list.get(index).length()) index = i;
        }
        return list.get(index);
    }

    public static String shortestCompletingWordFaster(String licensePlate, String[] words) {
        int[] alphabet = new int[26];
        for(char c: licensePlate.toCharArray()){
            if(Character.isLetter(c)){
                if(Character.isLowerCase(c) ) alphabet[c-97]++;
                else alphabet[Character.toLowerCase(c)-97]++;
            }
        }
        int min = Integer.MAX_VALUE;
        String result = "";
        for(String s: words){
            if(matches(s, alphabet)){
                if(min > s.length()){
                    min = s.length();
                    result = s;
                }
            }
        }
        return result;
    }

    private static boolean matches(String s, int[] arr){
        int[] word = new int[26];
        for(char c: s.toCharArray()){word[c-97]++;}
        for(int i=0; i < 26; i++){
            if(arr[i] > word[i]) return false;
        }
        return true;
    }

}


