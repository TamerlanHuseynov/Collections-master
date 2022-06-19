package LeetCode.string;

import java.util.*;

public class T_819_Most_Common_Word {
//    https://leetcode.com/problems/most-common-word/
    public static void main(String[] args) {
        T_819_Most_Common_Word obj = new T_819_Most_Common_Word();
        String paragraph1 = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String paragraph2 = "a, a, a, a, b,b,b,c, c"; // "a" (expected answer is "b")

        System.out.println("result = " +obj.mostCommonWord(paragraph2, new String[]{"a"}));

    }

    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>();
        Collections.addAll(ban, banned);
        ban.add(" ");
        ban.add("");

        String[] par = paragraph.replaceAll("[^a-z A-Z]", " ").toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        String answer = "";
        for (String p : par) {

            if (!ban.contains(p)) {
                if (map.containsKey(p)) map.put(p, map.get(p) + 1);
                else map.put(p, 1);

                if (max < map.get(p)) {
                    max = map.get(p);
                    answer = p;
                }
            }

        }
    return answer;
    }

    public String mostCommonWord2(String paragraph, String[] banned) {
        String[] par = paragraph.replaceAll("[^a-z A-Z]", " ").toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String p : par) {
                if (map.containsKey(p)) map.put(p, map.get(p) + 1);
                else map.put(p, 1);
        }
        map.remove("");
        map.remove(" ");
        for(String b: banned) map.remove(b);
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
