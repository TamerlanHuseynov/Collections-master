package random_practice.JavaInterviewQuestions;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
        Prime number is a number which is just divisible by itself and one
        Ex: 8 --> is not a prime because it is divisible by 1,2,4,8
        Ex: 17 --> is a prime number because it is divisible by 1 and 17 only
        0 and 1 don't count as a prime number
         */
        System.out.println(isPrimeNumber(11));

    }
//  if you cannot find match between 2 and half of the target number =>
//  you don't need to check second half
    public static boolean isPrimeNumber(int num) {
        if (num < 2) return false;
        for (int i = 2; i < num/2; i++) if (num % i == 0) return false;
        return true;
    }
}
