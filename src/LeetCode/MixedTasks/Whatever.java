package LeetCode.MixedTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Whatever {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
//        expected = ["sweet","sour"]

    }
        public static String[] uncommonFromSentences(String s1, String s2) {
            String[] a1 = s1.split(" ");
            String[] a2 = s2.split(" ");
            Arrays.sort(a1);
            Arrays.sort(a2);
            List<String> result = new ArrayList<>();
            String pew = "";
            for (int i=0;i<a1.length;i++){
                if(Arrays.binarySearch(a2, a1[i]) == -1){
                    result.add(a1[i]);
                }
            }
            for (int i=0;i<a2.length;i++){
                if(Arrays.binarySearch(a1, a2[i]) == -1){
                    result.add(a2[i]);
                }
//
            }
            pew = String.join(" ", result);
            return pew.split(" ");
        }




}
