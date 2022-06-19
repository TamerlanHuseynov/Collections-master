package CodeWars.kyu_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_the_odd {
//    https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java
    public static void main(String[] args) {
        Sort_the_odd obj = new Sort_the_odd();
        int[] array = new int[]{2, 3, 1, 4, 0, 6, 10, 7, 1};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(obj.sortArray(array)));
    }

    private int[] sortArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for(int i : array) if(i % 2 == 1) list.add(i);
        Collections.sort(list);
        int index = 0;
        for(int i = 0; i < array.length; i++) if(array[i] % 2 == 1) array[i] = list.get(index++);
        return array;
    }

}
