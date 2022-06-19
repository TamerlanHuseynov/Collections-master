package LeetCode.medium_String_tasks;

public class LongestPalindromicSubstringMine {
    public static void main(String[] args) {
        String input = "l2eve1l";
        System.out.println(longestPalindrome(input));
    }

    public static String longestPalindrome(String s) {
        char[] inputChars = s.toCharArray();
        int[] palindromicIndexes = new int[2];

        for (int i = 0; i < inputChars.length; i++) {
            checkForPalindrome(inputChars, palindromicIndexes, i, i+1);
            checkForPalindrome(inputChars, palindromicIndexes, i, i);
        }

    return s.substring(palindromicIndexes[0], palindromicIndexes[1]);
    }

    public static void checkForPalindrome(char[] inputChars, int[] palindromicIndexes, int start, int end){
       int inputCharsLength = inputChars.length;

       while(start>=0 && end <= inputCharsLength-1){
           if(inputChars[start] != inputChars[end]){
               break;
           }
           start--;
           end++;
       }

       if(end - start > palindromicIndexes[1] - palindromicIndexes[0]){
           palindromicIndexes[0] = start+1;
           palindromicIndexes[1] = end;
       }

    }

}
