package LeetCode.MixedTasks;

public class ReversingStringgg {
    public static void main(String[] args) {
        String pew = "This is a string I will be reversing";
        System.out.println(reverseWords(pew));



    }

    public static String reverseWords(String s) {
        if(s == null || s.length() == 0) return s;
        char[] carray = s.toCharArray();
        int start = 0;
        for(int i=0; i< carray.length; i++) {
            if (carray[i] == ' ') {
                reverse(carray, start, i-1);
                start = i+1;
            }
        }
        if (start < carray.length-1) {
            reverse(carray, start, carray.length-1);
        }
        return new String(carray);
    }

    private static void reverse(char[] array, int start, int end) {
        while(start < end) {
            char tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;
            start++;
            end--;
        }
    }
}