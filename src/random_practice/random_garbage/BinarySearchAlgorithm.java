package random_practice.random_garbage;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
    //      `Binary Search algorithm
    //       https://leetcode.com/problems/binary-search/
        String s = "SDA";
        s.toLowerCase();


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
