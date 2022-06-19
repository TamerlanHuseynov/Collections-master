package recursion.recursion_practice;

public class Recursive_FindSumOfDigitsOfANumber {
    public static void main(String[] args) {

        int value = find_sum_of_digits(1234);
        System.out.println("result = " + value);
    }

    public static int find_sum_of_digits(int n){
        if(n <= 0) return 0;
        else return n%10 + find_sum_of_digits(n/10);
    }

}
