package recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci_recursive {
    public static void main(String[] args) {
        System.out.println(fib(10));
        int[] fib_array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
//                            1  2  3  4  5  6   7   8   9  10  11   12   13   14   15

    }
    public static int fib(int n){
        Map<Integer, Integer> memo = new HashMap<>();
        return fib_actual(n, memo);
    }

    public static int fib_actual(int n, Map<Integer, Integer> memo){
        if(n<=2) return 1;
        else{
            if(memo.get(n) == null) memo.put(n, fib_actual(n-1, memo)+ fib_actual(n-2, memo));
            return memo.get(n);
        }
    }

}
