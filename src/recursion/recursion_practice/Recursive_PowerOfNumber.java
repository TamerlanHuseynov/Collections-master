package recursion.recursion_practice;

public class Recursive_PowerOfNumber {
    public static void main(String[] args) {
        int value = find_power_of(10, 4);
        System.out.println(value);
    }
    public static int find_power_of(int n, int power){
        if(power <= 0) return 1;
        else return n*find_power_of(n, power-1);
    }
}
