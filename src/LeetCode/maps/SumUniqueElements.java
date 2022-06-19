package LeetCode.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumUniqueElements {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3,5,5,5};
        System.out.println("sum = " + sumUniqueIntegers(arr));
    }

    /**  This method sums up every element, uncluding ones that are duplicates,
         but duplicates are added only once     */
    public static int sumUniqueIntegers(int[] nums){
        return Arrays.stream(nums).distinct().sum();
    }

    public static int sumOnlyUniqueIntegers(int[] nums){
       Map<Integer, Integer> map = new HashMap<>();
       int sum = 0;
        for (int i : nums){
            if(!map.containsKey(i)) map.put(i,1);
            else map.put(i, map.get(i)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() < 2) sum+= entry.getKey();
        }
        return sum;
    }


}
