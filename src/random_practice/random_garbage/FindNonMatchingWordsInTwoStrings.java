package random_practice.random_garbage;

import java.util.*;

public class FindNonMatchingWordsInTwoStrings {
    public static void main(String[] args) {

    /*
    Input: A = "this apple is sweet", B = "this apple is sour"
    Output: ["sweet","sour"]
     */
        String a = "this apple is sweet";
        String b = "this apple is sour";
        System.out.println("Result = " + findNonMatching(a,b));


    }

    public static List<String> findNonMatching(String a, String b) {

        //handle edge cases

        List<String> ans = new ArrayList<>();
        Set<String> setA = new HashSet<>();
        Set<String> setB = new HashSet<>();

        setA.addAll(Arrays.asList(a.split(" ")));

        setB.addAll(Arrays.asList(b.split(" ")));

        for (String s : a.split(" ")) {
            if (!setB.contains(s)) ans.add(s);
        }

        for (String s : b.split(" ")) {
            if (!setA.contains(s)) ans.add(s);
        }

        return ans;
    }



}
