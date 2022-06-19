package LeetCode.MixedTasks;

import java.util.*;

public class T_1122_RelativeSortArray {
    public static void main(String[] args) {

        //            0 1 2 3 4 5 6 7 8 9 10
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19}; //11
        int[] arr2 = {2,1,4,3,9,6};            //6  ===> 5

        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)) + " <---actual");
        System.out.println("[2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19] <---expected");

    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        if(arr1.length <= arr2.length) return arr1;

        Set<Integer> set = new LinkedHashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i < arr2.length; i++){ set.add(arr2[i]); }

        for(int i = 0; i < arr1.length; i++){

            if(!set.contains(arr1[i])) list.add(arr1[i]);
            else set.remove(arr1[i]);

        }

        Collections.sort(list);

        int l = 0;
        int a2 = 0;

        for(int i = 0; i < arr1.length; i++){

            if(l < list.size() && a2<arr2.length) {

                if (list.get(l) <= arr2[a2]) arr1[i] = list.get(l++);
                else arr1[i] = arr2[a2++];

            }else if( l < list.size() ) arr1[i] = list.get(l++);
            else arr1[i] = arr2[a2++];
        }








//        for(int i = 0; i < arr2.length;i++){ arr1[i] = arr2[i]; index++; }
//        for(int i = 0; i < list.size(); i++){arr1[index++] = list.get(i);}

        return arr1;
    }

}
