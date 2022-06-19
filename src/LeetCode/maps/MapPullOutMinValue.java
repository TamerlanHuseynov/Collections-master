package LeetCode.maps;

import java.util.*;

public class MapPullOutMinValue {
    public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<>();
    map.put("a",10);
    map.put("b",2);
    map.put("c",3);
    map.put("d",4);
    map.put("e",5);
    map.put("f",6);
    map.put("g",7);
    map.put("h",8);
    map.put("i",9);
    System.out.println("MinValue = "+minValue(map));
    }

    public static int minValue(Map<String,Integer> map){
        SortedSet<Integer> sm = new TreeSet<>(map.values());
        return sm.first( );
    }

}
