package LeetCode.string;

import java.util.Arrays;

public class DI_String_Match {
    public static void main(String[] args) {
        DI_String_Match pew = new DI_String_Match();

        System.out.println("IDID = " + Arrays.toString(pew.diStringMatch("IDID")));


    }
    public int[] diStringMatch(String s) {

        int[] result = new int[s.length()+1];
        result[0]=0;

        int index = 1;
        int value = 0;
        for(char letter: s.toCharArray() ){

            if(letter=='D') result[index++]= ++value;
            else result[index++] = --value;

        }
        return result;
    }
}
