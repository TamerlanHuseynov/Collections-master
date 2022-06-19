package random_practice.algorithms_and_datastructures_course.complexity_practice;

import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        int[] arr = {12, 2, 54, 2, 34, 13, 43, 3, 1, 65, 23};
        find_sum_product_of_array(arr);
        System.out.println("--------------");
//        print_pairs(arr);
        System.out.println("--------------");
//        print_pairs_no_duplicates(arr);
        System.out.println("--------------");
        System.out.println("reversed array = " + Arrays.toString(reverse_array(arr)));
        System.out.println("--------------");
        System.out.println("Fibonacci = " + find_fib(10));
        System.out.println("power of 2 = " + powerOf2(16));

    }

    // O(n)
    public static void find_sum_product_of_array(int[] arr){
        int sum = 0;
        int multi = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            multi *= arr[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Mul = " + multi);
    }

    //Print pairs from a given array O(n^2)
    public static void print_pairs(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }
    }

    // O(n^2) still.
    public static void print_pairs_no_duplicates(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }
    }

    // O(a.length * b.length)
    public static void printUnorderedPairs(int[] a, int[]b){

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] < b[j]) System.out.println(a[i] +", "+b[j]);

            }
        }
    }

    // O(a.length * b.length) as well
    public static void print_unordered_pairs_again(int[] a, int[]b){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < 1_000_000; k++) { // <--- constant
                    System.out.println(a[i] +", "+b[j]);
                }
            }
        }
    }

    // O(n)
    public static int[] reverse_array(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int temp;
        while(start<end){
          temp = arr[end];
          arr[end] = arr[start];
          arr[start] = temp;
          end--;
          start++;
        }
       return arr;
    }

    // o(2^n)
    public static int find_fib(int n){
        if(n <= 0) return 0;
        else if(n == 1) return 1;
        else return find_fib(n-1) + find_fib(n-2);
    }

    // O(log n) this one is broken...
    static int powerOf2(int n){
        if(n <1) return 0;
        else if(n==1) return 1;
        else{
            int prev = powerOf2(n/2);
            int curr = prev*2;
            return curr;
        }
    }

}
