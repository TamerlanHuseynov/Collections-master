package random_practice.algorithms_and_datastructures_course.arrays_revisited;

public class MissingNumberArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,9,10};
        System.out.println(find_missing_element(arr));
    }

    public static int find_missing_element(int[] arr){
        int sum_of_elements = 0;
        for (int i = 0; i < arr.length; i++) {
            sum_of_elements += arr[i];
        }
        int l = arr.length+1;
        int expected_sum = l * (l + 1) / 2;
        return expected_sum-sum_of_elements;
    }

}
