package random_practice.algorithms_and_datastructures_course.arrays_revisited;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    public static void main(String[] args) {
        IsUnique q = new IsUnique();
        System.out.println(q.isUnique(new int[]{1, 123, 3, 4, 5, 6,}));
        System.out.println(q.isUnique2(new int[]{1,1, 123, 3, 4, 5, 6,}));
    }


    public boolean isUnique(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]) return false;
            }
        }
        return true;
    }

    public boolean isUnique2(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int j : arr){
            if(set.contains(j)) return false;
            else set.add(j);
        }
        return true;
    }

}
