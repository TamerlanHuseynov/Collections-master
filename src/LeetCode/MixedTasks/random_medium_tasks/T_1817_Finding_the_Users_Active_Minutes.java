package LeetCode.MixedTasks.random_medium_tasks;

import java.util.*;

public class T_1817_Finding_the_Users_Active_Minutes {
//    https://leetcode.com/problems/finding-the-users-active-minutes/
    public static void main(String[] args) {

        T_1817_Finding_the_Users_Active_Minutes obj = new T_1817_Finding_the_Users_Active_Minutes();
        int[][] userActiveMinutes = { {0,5},{1,2},{0,2},{0,5},{1,3} }; //expected {0,2,0,0,0} for k=5
        System.out.println(Arrays.toString(obj.findingUsersActiveMinutes(userActiveMinutes, 5)));

    }

    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] answer = new int[k];
        Map<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int[] log : logs) {
            if (map.containsKey(log[0])) map.get(log[0]).add(log[1]);
            else {
                HashSet<Integer> set = new HashSet<>();
                set.add(log[1]);
                map.put(log[0], set);
            }
        }
        map.values().forEach(mins -> answer[mins.size()-1]++);
        return answer;
    }


}
