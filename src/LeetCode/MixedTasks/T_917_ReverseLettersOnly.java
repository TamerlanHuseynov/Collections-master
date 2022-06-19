package LeetCode.MixedTasks;

public class T_917_ReverseLettersOnly {
    public static void main(String[] args) {
        String input = "ab-cd";
        System.out.println(reverseOnlyLetters(input));

    }

    public static String reverseOnlyLetters(String s) {

        char[] c = s.toCharArray();
        int start = 0;
        int end = c.length-1;
        boolean f_start = false;
        boolean f_end = false;

        while(start<end){

            if(!Character.isLetter(c[start]) ) start++;
            else f_start = true;

            if(!Character.isLetter(c[end]) ) end--;
            else f_end = true;

            if(f_start && f_end){
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;

                start++;
                end--;
                f_end = false;
                f_start = false;
            }

        }


        return new String(c);
    }
}
