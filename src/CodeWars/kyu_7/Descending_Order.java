package CodeWars.kyu_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Descending_Order {
//    https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java
    public static void main(String[] args) {
        Descending_Order obj = new Descending_Order();
        int num = 1256790;
        System.out.println(obj.sortDesc(num));
        System.out.println(obj.sortDesc2(num));

    }

    private int sortDesc(final int num) {
        List<Integer> list = new LinkedList<>();
        int temp = num;
        while(temp != 0) {
            list.add( temp % 10);
            temp /= 10;
        }
        list.sort(Collections.reverseOrder());
        for(Integer i : list) {
            temp = temp * 10 + i;
        }
        return temp;
    }

    private int sortDesc2(final int num) {
        String[] temp = String.valueOf(num).split("");
        Arrays.sort(temp, Collections.reverseOrder());
        return Integer.parseInt(String.join("", temp));
    }

}
