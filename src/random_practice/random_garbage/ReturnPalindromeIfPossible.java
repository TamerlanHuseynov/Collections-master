package random_practice.random_garbage;

import java.util.Random;

public class ReturnPalindromeIfPossible {
    public static void main(String[] args) {
        String[] input = {"?ab??a", "bab??a", "?a", "?", null, "", "?b?m?b?"};
        String[] expected = {"aabbaa", "NO", "aa", "*", "NO", "NO", "*b*m*b*"}; //last one could return "zaz" or "dad" etc...
        System.out.println(expected[0] + " = " + checkPalindrome(input[0]));
        System.out.println(expected[1] + " = " + checkPalindrome(input[1]));
        System.out.println(expected[2] + " = " + checkPalindrome(input[2]));
        System.out.println(expected[3] + " = " + checkPalindrome(input[3]));
        System.out.println(expected[4] + " = " + checkPalindrome(input[4]));
        System.out.println(expected[5] + " = " + checkPalindrome(input[5]));
        System.out.println(expected[6] + " = " + checkPalindrome(input[6]));
    }

    public static String checkPalindrome(String input){

        if(input==null || input.isEmpty()) return "NO";
        else if(input.equals("?")) return String.valueOf(randomizeCharacter());
        else if(input.length() == 1) return input;

        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while(start<end){
            if(chars[start] == '?' && chars[end] != '?') chars[start] = chars[end];
            else if(chars[start] != '?' && chars[end] == '?') chars[end] = chars[start];
            else if(chars[start] == '?' && chars[end] == '?'){chars[start] = randomizeCharacter(); chars[end] = chars[start];}
            else if(chars[start] != chars[end]) return "NO";
            start++;
            end--;
        }
        if (chars.length % 2 == 1 && chars[chars.length / 2 + 1] == '?') chars[chars.length / 2 + 1] = randomizeCharacter();

    return new String(chars);
    }
    private static char randomizeCharacter(){
        Random random = new Random();
        return (char)(random.nextInt(26)+97);
    }

}
