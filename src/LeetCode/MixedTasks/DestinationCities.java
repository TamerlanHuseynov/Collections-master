package LeetCode.MixedTasks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DestinationCities {
    public static void main(String[] args) {
        String s = "nightgrouppewpewdasdasdasdadaasdadads";
        int [] array = new int[26];
        System.out.println(array[3]);
        for (int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            array[currentChar - 'a'] += 1;
        }
        System.out.println(Arrays.toString(array));


        String word = "AAABBBCCCDEF";
        String[] arr = word.split("");
        String result = Arrays.stream(arr)
                               .filter(e -> Collections.frequency(Arrays.asList(arr), e) < 2)
                                .collect(Collectors.joining());
        System.out.println(result);


        String input = "Techie Delight";
        // Convert `String` to `IntStream`
        IntStream intStream = input.codePoints();
        intStream.forEach(System.out::println);


        Character[] chars = { 'T', 'e', 'c', 'h', 'i', 'e' };
        // Convert `Character[]` to `IntStream`
        IntStream intStreamTwo = Stream.of(chars)
                .flatMapToInt(IntStream::of);
        intStreamTwo.forEach(System.out::println);


        int[] nums = {1,1,1,2,2,2,3,3,3};
        int sum = Arrays.stream(nums)
                        .distinct()
                        .sum();
        System.out.println(sum);

    }

    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();

        for(List<String> each : paths){
            map.put(each.get(0), each.get(1));
        }
        String destination = paths.get(0).get(0);
        for (int i = 0; i < paths.size(); i++){
            if(map.get(destination) == null )break;
            destination = map.get(destination);
            }
        return destination;
    }

    public static boolean goodBadString(String s){
        if(s == null || s.isEmpty()) return true;
        Map<Character, Integer> map = new HashMap<>();
        for(char each: s.toCharArray()){
            if(!map.containsKey(each)) map.put(each, 1);
            else map.put(each, map.get(each) +1);
        }
        int count = map.get(s.charAt(0));
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() != count) return false;
        }
//        for (Character each : map.keySet()) {if(map.get(each) != count) return false;}
//        for (Integer each : map.values()) {if(each != count) return false;}
        return true;
    }


}
