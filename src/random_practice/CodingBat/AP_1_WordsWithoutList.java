package random_practice.CodingBat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AP_1_WordsWithoutList {
    public static void main(String[] args) {

        String[] pew = {"a", "bb", "b", "ccc"};

        System.out.println(wordsWithoutList(pew, 1));


    }

    public static List wordsWithoutList(String[] words, int len) {

        return Arrays.stream(words).filter(x->x.length() != len).collect(Collectors.toList());
    }


}
