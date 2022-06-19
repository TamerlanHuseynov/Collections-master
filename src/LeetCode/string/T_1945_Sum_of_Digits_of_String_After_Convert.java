package LeetCode.string;

public class T_1945_Sum_of_Digits_of_String_After_Convert {
//    https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
    public static void main(String[] args) {
        T_1945_Sum_of_Digits_of_String_After_Convert obj = new T_1945_Sum_of_Digits_of_String_After_Convert();
        String input1 = "iiii";
        int k1 = 1;
        System.out.println("Expected 36 and was = " + obj.getLucky(input1, k1));
        System.out.println("--------------------------");
        System.out.println();

        String input2 = "leetcode"; // 12-5-5-20-3-15-4-4
        int k2 = 2;
        System.out.println("Expected 6 and was = " + obj.getLucky(input2, k2));
        System.out.println("--------------------------");
        System.out.println();
    }

    public int getLucky(String s, int k) {
        int num = convertString(s);
        k -= 1;
        while(k > 0) {
            num = convertNum(num);
            k--;
        }
        return num;
    }

    private int convertString(String input) {
        StringBuilder builder = new StringBuilder(input.length()+1);
        for(char c: input.toCharArray()) builder.append( c-96 );
        String result = builder.toString();
        int num = 0;
        for(char c: result.toCharArray()) num += Character.getNumericValue(c);
        return num;
    }

    private int convertNum(int num) {
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
