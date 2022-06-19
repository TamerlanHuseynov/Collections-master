package random_practice.random_garbage;


public class Palindrome_with_1_skip {
    public static void main(String[] args) {
        Palindrome_with_1_skip obj = new Palindrome_with_1_skip();
        String[] inputs = {"r rv", "annma", "rdacecar", "levtrel", "anncda", "pewpew"};

        for (String input : inputs) {
            System.out.print(input + " --> ");
            System.out.println(obj.palindrome_skp_1_char(input.toCharArray()));
        }
        long l = System.currentTimeMillis();
    }

    private boolean palindrome_skp_1_char(char[] input) {
        if (input == null || input.length <= 2) return true;
        boolean skipped = false;
        int start = 0, end = input.length - 1;
        while (start < end) {
            if (input[start] != input[end]) {
                if (skipped) return false;
                skipped = true;
                if (input[start+1] == input[end]) start++;
                else if(input[start] == input[end-1]) end--;
                else return false;
            }
            else {
                start++;
                end--;
            }
        }
        return true;
    }

}
