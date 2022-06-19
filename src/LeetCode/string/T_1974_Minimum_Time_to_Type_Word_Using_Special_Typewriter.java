package LeetCode.string;

public class T_1974_Minimum_Time_to_Type_Word_Using_Special_Typewriter {
//    https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/
    public static void main(String[] args) {
        T_1974_Minimum_Time_to_Type_Word_Using_Special_Typewriter obj =
                new T_1974_Minimum_Time_to_Type_Word_Using_Special_Typewriter();

        String word = "bza";
        // b z a
        // 2 3 2 = 7
        System.out.println("Result = " + obj.minTimeToType(word));
    }

    private int minTimeToType(String word) {
        int sum = 0;
        char prev = 'a';
        for(char c : word.toCharArray()) {
            int temp = prev - c;
            if(temp < 0 ) temp = -temp;
            if(temp > 13) temp = 26 - temp;
            prev = c;
            sum += temp +1;
        }
        return sum;
    }
}
