package recursion;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        GreatestCommonDivisor obj = new GreatestCommonDivisor();
        int[][] values = {
                {15, 50},
                {27, 18},
                {27, 6},
                {100, 10},
                {117, 2},
                {121, 11}};
        for(int[] nums: values) System.out.println(obj.gcd(nums[0], nums[1]));
    }

    private int gcd(int q, int p) {
        if (p == 0) return q;
        int r = q % p;
        return gcd(p, r);
    }

}
