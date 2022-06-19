package LeetCode.MixedTasks;

import java.util.ArrayList;
import java.util.List;

public class T_1002_Find_Common_Characters {
    public static void main(String[] args) {
        String[] words = {"Tatiana","Kibidas", "ads"}; // c  o
        System.out.println(commonChars(words));


    }
        //TODO FIx this one, just copyt from leet

    public static List<String> commonChars(String[] words) {

        List<String> result = new ArrayList<>();
        int[][] letters = new int[words.length][26];

        for (int word = 0; word < words.length; word++) {
            //iterate each word
            for (int letter = 0; letter < words[word].length(); letter++) {
                //iterate each character in a word and count it in the matrix:
                letters[word][words[word].charAt(letter) - 97]++;
            }
        }

        for (int letter = 0; letter < 26; letter++) {
            int min = Integer.MAX_VALUE;
            for (int word = 0; word < words.length - 1; word++) {
                int temp = Math.min(letters[word][letter], letters[word + 1][letter]);
                min = Math.min(min, temp);
            }
            while (min > 0) {
                result.add(String.valueOf((char) (letter + 97)));
                min--;
            }

        }
        return result;
    }




//        for(int word = 0; word < letters.length; word++){
////            System.out.println(Arrays.toString(letters[word]));
//
//            for (int letter = 0; letter < letters[word].length; letter++) {
//                System.out.print( (char)(letters[word][letter]+97) );
//            }
//            System.out.println();



        //        return result;




    }

