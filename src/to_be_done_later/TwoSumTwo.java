package to_be_done_later;

public class TwoSumTwo {
    public static void main(String[] args) {
        // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/


    }
    //TODO not finished
    public static int[] twoSumTwo(int[] numbers, int target) {

        int start_pointer = 0;
        int end_pointer = numbers.length-1;

        while(start_pointer <= end_pointer){

            int sum = numbers[start_pointer]+numbers[end_pointer];

            if(sum<target) start_pointer++;
            else if(sum>target) end_pointer--;
            else return new int[] {start_pointer+1, end_pointer+1};
        }
        return new int[2];
    }


}
