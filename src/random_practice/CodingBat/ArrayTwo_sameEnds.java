package random_practice.CodingBat;

import java.util.Arrays;

public class ArrayTwo_sameEnds {
    public static void main(String[] args) {

        int[] pew = {5, 6, 45, 99, 13, 5, 6};
        System.out.println(sameEnds(pew,2));


    }
    public static boolean sameEnds(int[] nums, int len) {
        int length = nums.length;

        int[] st = new int[len];
        int[] en = new int[len];

        int start = 0;

        while(len!=0){
            st[start]=nums[start];
            en[start++]=nums[length-len--];

        }


        return Arrays.equals(st, en);
    }

}
