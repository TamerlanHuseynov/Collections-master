package LeetCode.string;

public class T_2042_Check_if_Numbers_Are_Ascending_in_a_Sentence {
    public static void main(String[] args) {

        String abc = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersAscending(abc));

    }

    static boolean areNumbersAscending(String s) {
        int prev = Integer.MIN_VALUE;
        int curr = Integer.MIN_VALUE;
        for(String str: s.split(" ") ){
            if(Character.isDigit(str.charAt(0)) ){
                curr = Integer.parseInt(str);
                if (curr<=prev) return false;
            }
            prev = curr;
        }
        return true;
    }

}
