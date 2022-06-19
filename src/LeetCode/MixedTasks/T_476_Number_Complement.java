package LeetCode.MixedTasks;

public class T_476_Number_Complement {
//    https://leetcode.com/problems/number-complement/
    public static void main(String[] args) {
        T_476_Number_Complement obj = new T_476_Number_Complement();
        int num = 5; // expected = 2
        System.out.printf("result = %s\n", obj.findComplement_slow(num));
        System.out.printf("result = %s\n", obj.findComplement_fast(num));
    }

    private int findComplement_slow(int num) {
        char[] binary = Integer.toBinaryString(num).toCharArray();
        for (int i = 0; i < binary.length; i++)
            binary[i] = binary[i] == '1' ? '0' : '1';
        return Integer.parseInt(new String(binary), 2);
    }

    public int findComplement_fast(int num) {
        int result = num;
        int pow = 0;
        while(result > 0) {
            if(((1 << pow) & num) > 0) num = ~(1 << (pow)) & num;
            else num = (1 << pow) | num;
            result = result >> 1;
            pow++;
        }
        return num;
    }
}
