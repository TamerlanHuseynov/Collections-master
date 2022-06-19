package random_practice.algorithms_and_datastructures_course.arrays_revisited;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum pew = new TwoSum();
        int[] arr = {2,6,3,9,11}; //9
        System.out.println(Arrays.toString(pew.twoSum_two(arr, 9)));
        /*
        - Does input contain only positive or negative values?
        - What if the same pair repeats twice, should we return it every time?
        - If the reverse of the pair is acceptable e.g. can we print both (4,1) and (1,4) if the target == 5?
        - Do we need to print only distinct pairs? Is (3,3) a valid pair for given target of 6?
        - How big is the input array?
         */

    }
    // O(n^n)
    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j+1 < nums.length; j++) {
                if(nums[i] + nums[j] == target) return new int[]{i,j};
            }
        }
        throw new IllegalArgumentException("No solution possible");
    }

    // O(n) M(n)
    public int[] twoSum_two(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) return new int[]{map.get(target - nums[i]), i};
            else map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution possible");
    }


}
