package recursion.recursion_practice;

public class Recursive_PowerOfTwo {
    public static void main(String[] args) {

        System.out.println(powerOf2(10));

    }

    public static int powerOf2(int n){
        if(n<0) return 0;
        else if (n==0) return 1;
        else return 2 * powerOf2(n-1);
    }
}
