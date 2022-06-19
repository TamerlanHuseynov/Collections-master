package random_practice.algorithms_and_datastructures_course.arrays_revisited;

import java.util.Arrays;

public class PermutationOfEachOther {

    public static void main(String[] args) {

        PermutationOfEachOther p = new PermutationOfEachOther();

        int[] one = {1,2,3,4,5,6,7,8,9,10};
        int[] two = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(p.isPermutation(one,two));
        System.out.println(p.isPermutation2(one,two));

    }

    public boolean isPermutation(int[] one, int[] two){
        if(one.length != two.length) return false;
        Arrays.sort(one);
        Arrays.sort(two);
        return Arrays.equals(one, two);
    }

    public boolean isPermutation2(int[] one, int[] two){
        if(one.length != two.length) return false;
        int sum_one = 0;
        int sum_two = 0;
        int mul_one = 1;
        int mul_two = 1;

        for (int i = 0; i < one.length; i++) {
            sum_two += two[i];
            sum_one += one[i];
            mul_one *= one[i];
            mul_two *= two[i];
        }
        return sum_one == sum_two && mul_one == mul_two;
    }

}
