package random_practice.collections.Map_practice;

import random_practice.Replits.Dog;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Map_general_info {
    public static void main(String[] args) {

        Map<String, Dog> map1 = new HashMap<>();

        Dog rex = new Dog("Rex", 3, "German sheppard");
        Dog fluffy = new Dog("Fluffy", 1, "pomeranian");

        map1.put("Rex", rex);
        map1.put("Fluffy", fluffy);

        System.out.println("map1.get(\"Rex\").getAgeInHumanYears() = " + map1.get("Rex").getAgeInHumanYears());
        System.out.println("map1.get(\"Fluffy\").getAgeInHumanYears() = " + map1.get("Fluffy").getAgeInHumanYears());



        Map<String, String> hashMap = new HashMap<>();  // <-- most popular
        Map<String, String> treeMap = new TreeMap<>();  // <-- most popular


        Map<String, String> hashTable = new Hashtable<>(); // synchronized
        Map<String, String> concurrentMap = new ConcurrentHashMap<>();

        SortedMap<String, String> sortedMap = new TreeMap<>();


        Map<Character, Integer> tMap = new HashMap<>();
tMap.put('a', 2);
tMap.put('b', 3);
tMap.put('c', 4);
tMap.put('d', 5);
tMap.put('e', 5);


        Map<Character, Integer> sMap = new HashMap<>();
        tMap.put('a', 2);
        tMap.put('b', 3);
        tMap.put('c', 4);
        tMap.put('e', 1);

        System.out.println("TEST: " + tMap.get('z'));

        System.out.println("==========================");
        System.out.println("==========================");
        System.out.println("==========================");
        System.out.println("==========================");


//        for (Integer c: tMap.values()){
//            System.out.println(c);
//        }
//        Iterator it = tMap.keySet().iterator();

        for(int i='a'; i <= 'z'; i++){

        if(sMap.get(i) != tMap.get(i)){
            System.out.println("answer"+i);
        }

            }




    }
}
