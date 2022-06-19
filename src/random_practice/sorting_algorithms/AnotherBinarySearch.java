package random_practice.sorting_algorithms;

public class AnotherBinarySearch {

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = 9;

        System.out.println(search(nums, target));


    }

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length -1;

        while(left<=right){

            int middle = left + (right-left)/2;

            if(nums[middle] == target) return middle;
            else if(nums[middle] > target) right = middle-1;
            else if(nums[middle] < target) left = middle+1;
        }
        return -1;
    }



}
