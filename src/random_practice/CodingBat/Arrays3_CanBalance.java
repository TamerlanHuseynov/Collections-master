package random_practice.CodingBat;

public class Arrays3_CanBalance {
    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 1}; // true
        int[] nums2 = {2, 1, 1, 2, 1}; // false
        System.out.println(canBalance(nums));

    }


    public static boolean canBalance(int[] nums) {

        if(nums.length<2) return false;

        int leftsum = nums[0]; boolean left_flag = true;
        int rightsum = nums[nums.length-1]; boolean right_flag = true;
        int start = 1;
        int end = nums.length-2;

        while(start<=end){


            if(leftsum < rightsum){ left_flag = true; right_flag = false; }
            if(leftsum > rightsum){ left_flag = false; right_flag = true; }
            if(leftsum==rightsum){left_flag = true; right_flag = true;}

            if(left_flag) leftsum += nums[start++];
            if(right_flag) rightsum += nums[end--];



        }
        if(rightsum==leftsum) return true;

        return false;
    }

}
