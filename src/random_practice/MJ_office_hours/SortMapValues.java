package random_practice.MJ_office_hours;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMapValues {
    public static void main(String[] args) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        map.put('A',3);
        map.put('B',2);
        map.put('C',6);
        map.put('D',-1);
        map.put('E',5);
        System.out.println(map);
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(1).getValue() = " + list.get(1).getValue());
        list.sort(Map.Entry.comparingByValue());
        System.out.println(list);

    }

}
