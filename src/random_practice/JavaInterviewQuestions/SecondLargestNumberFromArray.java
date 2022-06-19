package random_practice.JavaInterviewQuestions;

import java.util.Arrays;

public class SecondLargestNumberFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,3,4,5,6,7,8,9,10,22,44,12,55,-2,-1,-8};
        System.out.println("Not sorted: "+Arrays.toString(arr));
        System.out.println("    sorted: "+Arrays.toString(sortByHand(arr)));
        System.out.println(secondLargestNumber(arr));
        System.out.println(Arrays.toString(removeDuplicate(arr)));

    }

    public static int secondLargestNumber(int[] arr){
        int num = -1;
        arr = sortByHand(arr);
        for (int i = arr.length -1; i >= 0 ; i--){
            if(arr[i] != arr[arr.length-1]) return arr[i];
        }
        return num;
    }

    // sorting Array manually:
    public static int[] sortByHand(int[] nums){
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
//                < for ascending inside if condition
//                > for descending
                if(nums[i]<nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static int[] removeDuplicate(int[] num){
       return Arrays.stream(num).distinct().toArray();
    }

}
