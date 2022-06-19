package LeetCode.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Kth_Distinct_Element {
    public static void main(String[] args) {
        Kth_Distinct_Element pew = new Kth_Distinct_Element();

        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;

        System.out.println("Kth Distinct = " + pew.kthDistinct(arr, k));

    }

    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) +1);
            else map.put(arr[i], 1);
        }

        int count = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet() ) {

            if(entry.getValue() == 1) count++;
            if(count==k) return entry.getKey();
        }
        return "";
    }
}
