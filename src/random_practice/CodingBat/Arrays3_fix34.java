package random_practice.CodingBat;

import java.util.Arrays;

public class Arrays3_fix34 {
    public static void main(String[] args) {
        int[] nums = {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5}; //→ [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4}
//                    k  !  4  5  k  r  k


        System.out.println(Arrays.toString(fix34(nums)));

    }

    public static int[] fix34(int[] nums) {//0

        boolean remember =false;
        int rememberToo = 0;

        for(int i = 0; i < nums.length-1; i++){ //1

            if(nums[i]==3 && nums[i+1]!=4){//2

                if(remember){
                    int temp = nums[rememberToo];
                    nums[rememberToo] = nums[i+1];
                    nums[i+1] = temp;
                    continue;}

                for(int j=i+1; j<nums.length; j++){//3

                    if(nums[j]==4){
                        int temp = nums[i+1];
                        nums[i+1] = nums[j];
                        nums[j] = temp;
                        break;
                    } //4

                }//3

            }//2
            if(nums[i]==4 && nums[i-1]!=3) {remember=true; rememberToo=i; }

        }//1

        return nums;
    }//0

}
