package recursion.recursion_practice;

import java.util.HashMap;
import java.util.Map;

public class Recursive_Factorial {
    public static void main(String[] args) {

        int value = find_factorial_recursively(6);
        System.out.println("final result = " + value);
        System.out.println("dynamic progr = " + find_factorial_dynamicProgramming(6));

    }

    public static int find_factorial_recursively(int n){
        if( n < 0) return -1;
        if (n <= 1) return 1;
        return n * find_factorial_recursively(n-1);
    }

    public static int find_factorial_dynamicProgramming (int n) {
        if( n < 0) return -1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 1);
        return fact(map, n);
    }

    private static int fact(Map<Integer, Integer> map, int n) {
        if(map.containsKey(n)) return map.get(n);
        else {
            map.put(n, find_factorial_recursively(n-1) * n);
            return map.get(n);
        }
    }
}
