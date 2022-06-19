package LeetCode.MixedTasks;

import java.util.Arrays;

public class T_1299_Replace_Elements_with_Greatest_Element_on_Right_Side {

    public static void main(String[] args) {
        T_1299_Replace_Elements_with_Greatest_Element_on_Right_Side obj =
                new T_1299_Replace_Elements_with_Greatest_Element_on_Right_Side();
        int[] input = {17, 18, 5, 4, 6, 1};
        // Expected = [18, 6, 6, 6, 1, -1]
        System.out.printf("Input    = %s\nExpected = %s\nActual   = %s", Arrays.toString(input), "[18, 6, 6, 6, 1, -1]",
                Arrays.toString(obj.replaceElements(input)));

    }

    private int[] replaceElements(int[] arr) {
        int[] huge_tracker =  findMax(arr, 0);

        for(int i = 0; i < arr.length; i++) {
            if(i == huge_tracker[1]) huge_tracker = findMax(arr, i + 1);
            arr[i] = huge_tracker[0];
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    private int[] findMax(int[] arr, int index) {
        int[] element = new int[2];
        element[0] = Integer.MIN_VALUE;
        element[1] = index;
        for(int i = index; i < arr.length; i++)
            if(arr[i] >= element[0]) {
                element[0] = arr[i];
                element[1] = i;
            }
        return element;
    }

    // work backwards keeping record of the max value > current index
    public int[] replaceElements_better(int[] arr) {
        if (arr.length <= 1) return new int[]{-1};
        int len = arr.length - 1;
        int curMax = Math.max(arr[len], arr[len - 1]);
        int[] result = new int[arr.length];
        result[len - 1] = arr[len];
        result[len] = -1;
        for (int i = len - 2; i >= 0; i--) {
            result[i] = curMax;
            curMax = Math.max(curMax, arr[i]);
        }
        return result;
    }

}
