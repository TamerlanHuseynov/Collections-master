package LeetCode.MixedTasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class T_1704_DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("pewwep"));
    }

    public static boolean halvesAreAlike(String s) {
        char[] ch = s.toCharArray();
        int length = ch.length;
        int count = 0;
        Set<Character> pew = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        for( int i=0, j=length-1; i<length/2 || j> length/2; i++, j--){
            if (pew.contains(ch[i])){count++;}
            if (pew.contains(ch[j])){count--;}
        }
        ;
    return count == 0;
    }
}

