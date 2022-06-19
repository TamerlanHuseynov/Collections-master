package random_practice.sorting_algorithms;

import LeetCode.leet_code_helpers.LeetCodeUtils;

public class MergeSortAlg {
    public static void main(String[] args) {

        LeetCodeUtils obj = new LeetCodeUtils();
        MergeSortAlg obj2 = new MergeSortAlg();
        int arrayLength = 1_000_000;
        int upperBoundary = Integer.MAX_VALUE;
        int[] nums_1 = obj.generate_random_array(arrayLength , upperBoundary);
//        System.out.println("nums_1 pre-sort = " + Arrays.toString(nums_1));
        long start = System.nanoTime();
        obj2.mergeSort(nums_1);
//        System.out.println("nums_1 post-sort = " + Arrays.toString(nums_1));
        long end = System.nanoTime();
        System.out.println("Merge sort of " + arrayLength +" took = " + ((end-start) / 1_000_000_000) + "seconds");

        int[] bubble = obj.generate_random_array(arrayLength, upperBoundary);
        start = System.nanoTime();
        obj2.bubbleSort(bubble);
        end = System.nanoTime();
        System.out.println("Bubble sort of " + arrayLength +" took = " + ((end-start) / 1_000_000_000) + "seconds");

    }

    public void mergeSort(int[] input) {
        int len = input.length;
        if(len < 2) return;

        int middle = len / 2;
        int[] left = new int[middle];
        int[] right = new int[len - middle];

        System.arraycopy(input, 0, left, 0, middle);
        if (len - middle >= 0) System.arraycopy(input, middle, right, 0, len - middle);

        mergeSort(left);
        mergeSort(right);
        merge(input, left, right);
    }

    private void merge(int[] input, int[] left, int[] right) {
        int left_len = left.length;
        int right_len = right.length;
        int left_iter=0, right_iter=0, input_iter=0;

        while(left_iter < left_len && right_iter < right_len) {
            if( left[left_iter] <= right[right_iter]) input[input_iter++] = left[left_iter++];
            else input[input_iter++] = right[right_iter++];
        }
        while(left_iter < left_len) input[input_iter++] = left[left_iter++];
        while(right_iter < right_len) input[input_iter++] = right[right_iter++];
    }

    private void bubbleSort(int[] input) {
        for(int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if(input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
    }
}
