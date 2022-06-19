package LeetCode.leet_code_helpers;

import java.util.Arrays;
import java.util.Random;

public class LeetCodeUtils {
    public static void main(String[] args) {
        LeetCodeUtils obj = new LeetCodeUtils();
        String input = "[[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"p\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"R\",\".\",\".\",\".\",\"p\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\"p\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"],[\".\",\".\",\".\",\".\",\".\",\".\",\".\",\".\"]]\n" +
                "Output: 3";


        System.out.println(obj.replacer(input));

    }

    private String replacer(String input){
        return input.replace("[", "{").replace("]", "}").replace("\"", "'");
    }

    public int[] generate_random_array(int arr_length, int upperBound) {
        int[] numbers = new int[arr_length];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(upperBound);
        }
        return numbers;
    }

    public void print_Arrays(int[]... ints) {
        int i = 1;
        for(int[] arr: ints)
            System.out.println("Array number " + i++ + " = " + Arrays.toString(arr));
    }

    public int[][] grid_generator(int rows, int columns) {
        Random random = new Random();
        int[][] arr = new int[rows][columns];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                arr[r][c] = random.nextInt(101);
            }
        }
        return arr;
    }


}
