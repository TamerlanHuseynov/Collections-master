package random_practice.CodingBat;

import java.util.*;

public class Arrays3_fix45 {
    public static void main(String[] args) {

        int[] nums = {5, 4, 9, 4, 9, 5}; //→ [9, 4, 5, 4, 5, 9};
        System.out.println(Arrays.toString(fix45(nums)));
    }

    public static int[] fix45(int[] nums) {

        ArrayDeque<Integer> que = new ArrayDeque<>();

        if(nums[0]==5)que.add(0);

        for(int i=1; i<nums.length; i++){
            if(nums[i]==5 && nums[i-1]!=4)que.add(i);
        }

        for (int i = 0; i < nums.length-1; i++) {

            if(nums[i] == 4 && nums[i+1]!=5){
                int temp = nums[i+1];
                nums[i+1] = nums[que.getFirst()];
                nums[que.getFirst()] = temp;
                que.removeFirst();

            }
        }

        return nums;
    }
}
