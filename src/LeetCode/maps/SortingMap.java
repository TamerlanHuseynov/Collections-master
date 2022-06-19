package LeetCode.maps;

import java.util.*;

public class SortingMap {
    public static void main(String[] args) {

        Map<String, Integer> regularMap = new HashMap<>();
        regularMap.put("a",10123); regularMap.put("b",2432);
        regularMap.put("c",123); regularMap.put("d",4432);
        regularMap.put("e",5432); regularMap.put("f",656);
        regularMap.put("g",745); regularMap.put("h",814);
        regularMap.put("i",9123);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(regularMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> each : list){
            linkedMap.put(each.getKey(), each.getValue());
        }
        System.out.println(linkedMap);

    }
}
