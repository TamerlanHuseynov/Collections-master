package LeetCode.string;

public class T_2047_Number_of_Valid_Words_in_a_Sentence {
//    https://leetcode.com/problems/number-of-valid-words-in-a-sentence/
    public static void main(String[] args) {
        T_2047_Number_of_Valid_Words_in_a_Sentence obj = new T_2047_Number_of_Valid_Words_in_a_Sentence();


        String sentence = "cat and  dog";
        String sentence2 = "a--b";
        System.out.println("Result = " + obj.countValidWords(sentence2));

        System.out.println("-----------");
        String[] arr = sentence2.split(" ");
        for (String s : arr) {
            if(s == null || s.isEmpty()) continue;
            System.out.println(s);
        }

    }

    public int countValidWords(String sentence) {
        int count = 0;
        String[] words = sentence.split(" ");
        for(String word: words) if(isWord(word)){
            count++;
            System.out.println("Word " + count + " is = " + word);
        }
        return count;
    }

    private boolean isWord(String w) {
        if(w.isEmpty() || w.equals(" ")) return false;
        int count_hyphen = 0;
        int count_upper = 0;
        char[] word = w.trim().toCharArray();

        for(int i = 0; i < word.length; i++) {



            if(!Character.isDigit(word[i]) && !Character.isLetter(word[i]) && word[i] != '-' && i != word.length-1 ) return false;


            if(Character.isUpperCase(word[i]) ) count_upper++;


            if(word[i] == '-'){
                if(i==0) return false;
                else if(i==word.length -1) return false;
                else if(!Character.isLetter(word[i-1]) || !Character.isLetter(word[i+1]) ) return false;
                else count_hyphen++;
            }


            if(Character.isDigit(word[i]) ) return false;

        }
        return count_hyphen <= 1 && count_upper == 0;
    }

}
