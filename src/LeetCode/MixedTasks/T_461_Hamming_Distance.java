package LeetCode.MixedTasks;

public class T_461_Hamming_Distance {
//
    public static void main(String[] args) {
        T_461_Hamming_Distance obj = new T_461_Hamming_Distance();
        int x = 4;
        int y = 1; // Expected = 2
        System.out.printf("Result = %s", obj.hammingDistance(x, y));
    }

    private int hammingDistance(int x, int y) {
        int result = 0;
        while(x != 0 || y != 0) {
            if(x % 2 != y % 2) result++;
            x /= 2;
            y /= 2;
        }
        return result;
    }

}
