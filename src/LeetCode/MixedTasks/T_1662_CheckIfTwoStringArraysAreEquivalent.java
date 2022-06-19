package LeetCode.MixedTasks;

public class T_1662_CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] one = {"ab", "c"};
        String[] two = {"a", "bc"};

        System.out.println(String.valueOf(one));
        System.out.println(String.valueOf(two));

        System.out.println(arrayStringsAreEqual(one, two));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("",word1).equals(String.join("",word2));
    }




    }
