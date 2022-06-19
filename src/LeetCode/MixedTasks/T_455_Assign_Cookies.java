package LeetCode.MixedTasks;

import java.util.Arrays;

public class T_455_Assign_Cookies {
//    https://leetcode.com/problems/assign-cookies/
    public static void main(String[] args) {
        T_455_Assign_Cookies obj = new T_455_Assign_Cookies();
        int[] greed   = {1, 2, 3};
        int[] cookies = {1, 1};
        System.out.printf("Satisfied children count = %s", obj.findContentChildren_57runtime(greed, cookies));

    }

    private int findContentChildren_57runtime(int[] greed, int[] cookies) {
        if(cookies == null || cookies.length == 0 || greed == null || greed.length == 0) return 0;
        int count = 0;
        Arrays.sort(greed);
        Arrays.sort(cookies);
        int greed_pointer = 0;
        int cookie_pointer = 0;
        while(greed_pointer < greed.length && cookie_pointer < cookies.length) {
            if(greed[greed_pointer] <= cookies[cookie_pointer]) {
                greed_pointer++;
                count++;
            }
            cookie_pointer++;
        }
        return count;
    }


}
