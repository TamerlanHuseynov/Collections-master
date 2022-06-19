package random_practice.JavaInterviewQuestions;

public class isPalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome2(1221));
    }
    public static boolean isPalindrome2(int number){
        int lastDigit = 0;
        int copyNum = number;
        int reverse = 0;
        while (copyNum != 0){
            lastDigit = number%10;
            reverse = (reverse*10) + lastDigit;
            copyNum /= 10;
        }
        return reverse == number;
        }
    }

