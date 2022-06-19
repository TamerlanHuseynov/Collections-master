package random_practice.MJ_office_hours;

import java.util.Arrays;

public class MoveZerosToEndOfArray {
    public static void main(String[] args) {
        // moves zeros to the end of array:
        int[] arr = {3, -2, 9, 0, 0, 0, 6, 4, 5, 0, 0};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(moveAllZerosToEnd(arr)));
        System.out.println(Arrays.toString(moveAllZerosToStart(arr)));
        System.out.println("swap = "+ Arrays.toString(swapTheZeros(arr)));
    }

    public static int[] moveAllZerosToEnd(int[] arr){
        int[] nums = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) nums[counter++] = arr[i];
        }
        return nums;
    }

    public static int[] moveAllZerosToStart(int[] arr){
        int[] nums = new int[arr.length];
        int counter = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) nums[counter--] = arr[i];
        }
        return nums;
    }
    public static int[] swapTheZeros(int[] arr){
        int currentZero = 0;
        int nextGoodIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                currentZero = i;
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j] != 0){nextGoodIndex = j;
                    arr[currentZero] = arr[nextGoodIndex];
                    arr[nextGoodIndex] = 0;
                    break;
                    }
                }
            }
        }
        return arr;
    }



}
