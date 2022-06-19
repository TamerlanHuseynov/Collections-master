package LeetCode.MixedTasks;

import java.util.ArrayList;
import java.util.List;

public class T_728_SelfDiving_Numbers {
    public static void main(String[] args) {

        System.out.println(selfDividingNumbers(1,22));


    }
    public static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> nums = new ArrayList<>();

        for(int i = left; i<=right; i++){
            if(divisible(i)) nums.add(i);
        }
        return nums;
    }

    public static boolean divisible(int a){

        while(a!=0){ //22

            if(a%10==0 || a%(a % 10)!= 0) return false;
            a /= 10;

        }
        return true;
    }
/*
Merge Sort.
Heap Sort.
Insertion Sort.
Selection Sort.
Bubble Sort.
 */

}
