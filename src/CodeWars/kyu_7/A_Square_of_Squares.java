package CodeWars.kyu_7;

public class A_Square_of_Squares {
//    https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java
    public static void main(String[] args) {
        A_Square_of_Squares obj = new A_Square_of_Squares();

        int[] arr = {1, 3, 4, 9, 100, 17};
        for (int i : arr) {
            System.out.println("i = " + i + " >>> " + Math.sqrt(i) + " result = " + obj.isSquare(i));
        }


    }

    private boolean isSquare(int n) {
        if(n < 0) return false;
        double sqrt = Math.sqrt(n);
        int squared = (int)sqrt * (int)sqrt;
        return n == squared;
    }

    private boolean isSquare2(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

}
