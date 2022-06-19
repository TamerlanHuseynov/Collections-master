package recursion.recursion_practice;

public class Recursive_GreatestCommonDivisor {
    public static void main(String[] args) {
        int value = find_GCD(8, 12);
        System.out.println("result = " + value);
    }

    /*
        Euclidean algorithm:
        48/18 = 2 remained 12
        18/12 = 1 remainder 6
        12/6 = 2 remainder 0
         */

    public static int find_GCD(int n, int m){
        if(n < 0 || m < 0) return -1;
        if(m == 0) return n;
        return find_GCD(m, m % n);
    }

}
