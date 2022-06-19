package LeetCode.MixedTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;

public class T_599_Minimum_Index_Sum_of_Two_Lists {
//    https://leetcode.com/problems/minimum-index-sum-of-two-lists/
    public static void main(String[] args) {
        T_599_Minimum_Index_Sum_of_Two_Lists obj = new T_599_Minimum_Index_Sum_of_Two_Lists();

        String[] input_one = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] input_two = {"KFC","Shogun","Burger King"};

        System.out.println("Answer = " + Arrays.toString(obj.findRestaurant(input_two, input_two)));

    }

    private String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> list_one_map = new HashMap<>();
        Map<String, Integer> answer_map = new HashMap<>();
        for (int i=0; i <list1.length; i++) list_one_map.put(list1[i], i);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if(list_one_map.containsKey(list2[i])){
                answer_map.put(list2[i], i+list_one_map.get(list2[i]));
                min = Math.min(i+list_one_map.get(list2[i]), min);
            }
        }
        ArrayList<String> answer = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: answer_map.entrySet()) {
            if(entry.getValue() == min) answer.add(entry.getKey());
        }
        return answer.toArray(answer.toArray(new String[answer.size()]));
    }

    public String[] findRestaurant_improved(String[] list1, String[] list2) {

        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<list1.length;i++) map.put(list1[i],i);

        int sum =0;
        int max = Integer.MAX_VALUE;
        ArrayList<String> ret = new ArrayList<>();

        for(int j=0; j<list2.length; j++) {
            if(map.containsKey(list2[j])) {
                sum = j+map.get(list2[j]);
                if(sum<max) {
                    ret.clear();
                    ret.add(list2[j]);
                    max = sum;
                }else if(sum==max) ret.add(list2[j]);
            }
        }
        return ret.toArray(new String[ret.size()]);
    }
}
