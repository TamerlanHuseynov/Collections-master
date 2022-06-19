package LeetCode.medium_String_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T_763_Partition_Labels {
//    https://leetcode.com/problems/partition-labels/
    public static void main(String[] args) {
        T_763_Partition_Labels obj = new T_763_Partition_Labels();
        String input = "ababcbacadefegdehijhklij";
        System.out.println("Expected output = [9, 7, 8]");
        System.out.println("Actual output   = " + obj.partitionLabels(input));
    }

    private List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        int[] map = new int[26];

        for(int i = 0; i < chars.length; i++) map[chars[i] - 97] = i;

        for (int i = 0; i < chars.length; i++) {
            int length = 1;
            int max = map[chars[i]-97];
            while(i < chars.length && max > i) {
                max = Math.max(max, map[chars[i]-97]);
                length++;
                i++;
            }
            list.add(length);
        }
        return list;
    }
}
