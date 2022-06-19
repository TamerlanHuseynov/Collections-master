package random_practice.random_garbage.danny_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_permutation_combinations {

    public static void main(String[] args) {
        Array_permutation_combinations obj = new Array_permutation_combinations();

        char[] input = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        System.out.printf("All permuation of %s is:\n", Arrays.toString(input));
//        List<List<Character>> all_permutations = obj.getAllPermutations(input);
//        int count = 1;
//        for(List<Character> permutation : all_permutations) {
//            System.out.printf("Permutation n%s = %s\n", count++, permutation);
//        }
        obj.getAllPermutationsPrinted(input, 0);
    }

    private void getAllPermutationsPrinted(char[] input, int index) {
        if (index == input.length) return;
        if (index == input.length - 1) System.out.println(Arrays.toString(input));
        for (int i = index; i < input.length; i++) {
            swap(input, i, index);
            getAllPermutationsPrinted(input, index + 1);
            swap(input, i, index);
        }
    }
    private void swap(char[] input, int start, int end) {
        char temp = input[start];
        input[start] = input[end];
        input[end] = temp;
    }


    private List<List<Character>> getAllPermutations(char[] input) {
        List<List<Character>> answer = new ArrayList<>();
        List<Character> depth_search = new ArrayList<>();
        boolean[] used = new boolean[input.length];
        recursive_permutation(input, depth_search, answer, used);
        return answer;
    }

    private void recursive_permutation(char[] input, List<Character> depth_search, List<List<Character>> answer, boolean[] used) {
        if(depth_search.size() == input.length) {
            answer.add(new ArrayList<>(depth_search));
            return;
        }
        for (int i = 0; i < input.length; i++) {
            if (!used[i]) {
                used[i] = true;
                depth_search.add(input[i]);
                recursive_permutation(input, depth_search, answer, used);
                depth_search.remove(depth_search.size() - 1);
                used[i] = false;
            }
        }
    }

}
