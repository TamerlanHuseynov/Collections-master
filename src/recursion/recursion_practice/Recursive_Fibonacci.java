package recursion.recursion_practice;

import java.util.HashMap;
import java.util.Map;

public class Recursive_Fibonacci {
    public static void main(String[] args) {

        System.out.println(find_Fibonacci_recursively(10));
        System.out.println(fib_recursive(10));
    }

    private static int fib_recursive(int num) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(){{
            put(0, 0);
            put(1, 1);
        }};
        if(num < 0) return -fib(map, Math.abs(num));
        return fib(map, num);
    }
    private static int fib(Map<Integer, Integer> map, int num) {
        if(map.containsKey(num)) return map.get(num);
        else {
            map.put(num, fib(map, num-2) + fib(map, num-1));
            return map.get(num);
        }
    }


    public static int find_Fibonacci_recursively(int n){
        if (n == 0) return 0;
        else if(n == 1) return 1;
        else if (n < 0) return -1;
        else return find_Fibonacci_recursively(n-2) + find_Fibonacci_recursively(n-1);
    }

}
