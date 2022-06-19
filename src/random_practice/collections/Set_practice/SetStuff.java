package random_practice.collections.Set_practice;

import java.util.*;

public class SetStuff {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < 10; i++) {
            set.add(i);
        }

        System.out.println(set);
        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()){
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 11; i++) {
            map.put(i, i+100);
        }

        int i =Integer.MIN_VALUE;

        throw new IllegalArgumentException();


    }
}
