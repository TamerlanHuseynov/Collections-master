package recursion.recursion_practice;

public class Recursive_ConvertNumberToBinary {
    public static void main(String[] args) {

        int value = convertToBinary(13);
        System.out.println(value);
    }

    public static int convertToBinary(int num){
        if (num == 0) return 0;
        else return num % 2 + convertToBinary(num / 2) * 10;
    }
}
