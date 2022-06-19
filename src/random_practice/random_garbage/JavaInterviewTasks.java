package random_practice.random_garbage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaInterviewTasks {
    public static void main(String[] args) {
        System.out.println(duplicateRemover("AABBBCCCDDDEEEFFFGGHHIIIJJKKLL"));
        System.out.println(reverseString("A B C D E F G"));
        System.out.println(sortAlphaNumeric("DC501GCCCA098911"));
        System.out.println(removeMoreThan100(new ArrayList<>(Arrays.asList(10,19,29,150,200,300))));
        System.out.println(sumOfDigits("DC501GCCCA098911"));
//        //TODO fix it!!!
//        System.out.println("SummOfFullDigits: " + sumOfFullDigits("DC501GCCCA098911"));
        char[] word = {'C', 'A', 'T'};
        permutation(word);
    }

    public static String duplicateRemover(String str){
        return Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
    }
    public static String reverseString(String str){
        return new String(new StringBuilder(str).reverse());
    }
    /** Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100. */
    public static List<Integer> removeMoreThan100(List<Integer> list){
        return list.stream().filter(x -> x < 100).collect(Collectors.toList());
    }
    /**
     * Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
     * sort the individual string and append them back together
     * Ex: Input:  "DC501GCCCA098911"
     * OutPut: "C  D  0  1  5  A  C  C  C  G  0   1   1   8   9    9"
     *          0  1  2  3  4  5  6  7  8  9  10  11  12  13  14   15   */
    public static String sortAlphaNumeric(String str){
        StringBuilder result = new StringBuilder(str.length());
        int start = 0;
        for(int i = 0; i < str.length(); i++) {
            char startChar = str.charAt(start);
            char currentChar = str.charAt(i);
            if((Character.isLetter(startChar) != Character.isLetter(currentChar)) || i == str.length()-1){
                if(i==str.length()-1) i++;
                char[] arr = str.substring(start,i).toCharArray();
                Arrays.sort(arr);
                result.append(arr);
                start = i;
            }
        }
        return new String(result);
    }
/** Write a method that can return the sum of the digits in a string */
    public static int sumOfDigits(String str){
//       int ASCIIsum = 0;
       int digitsOnly = 0;
        for(Character each: str.toCharArray()){
//            ASCIIsum+= (int)each;
            if(Character.isDigit(each)) digitsOnly += Character.getNumericValue(each);
       }
        return digitsOnly;
    }

    //TODO fix this one!!!
    public static int sumOfFullDigits(String str){
        int sum = 0;
        str = str.replaceAll("[^0-9]", " ");
        String[] arr = str.split(" ");
        for(String each: arr){
            sum+= Integer.parseInt(each);
        }
        return sum;
    }

    // Binyam Scrub Solution:
    public static void permutation(char[] word) {
        for (int i = 0; i < word.length; i++) {
            String letter1 = word[i] + "";
            String  letter2 = word[i] + "";

            for (int j = 0, k = word.length - 1; j < word.length; j++, k--) {
                if (word[i] != word[j]) {
                    letter1 += "" + word[j];
                }
                if (word[i] != word[k]) {
                    letter2 += "" + word[k];
                }
            }
            System.out.println(letter1);
            System.out.println(letter2);
        }
    }




    }
