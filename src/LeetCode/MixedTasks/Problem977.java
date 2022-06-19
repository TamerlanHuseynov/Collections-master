package LeetCode.MixedTasks;

import java.util.Arrays;

public class Problem977 {
    public static void main(String[] args) {

        int[] nums = new int[]{-4,-1,0,3,10};
        //    [0,1,9,16,100]
        System.out.println(Arrays.toString(doIt(nums)));
    }

    public static int[] doIt(int[] nums){
        int[] ints = Arrays.stream(nums).map(x -> x * x).sorted().toArray();

        return ints;
    }

}
