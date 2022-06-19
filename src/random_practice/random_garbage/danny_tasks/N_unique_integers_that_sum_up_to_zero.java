package random_practice.random_garbage.danny_tasks;

import java.util.Arrays;

public class N_unique_integers_that_sum_up_to_zero {

    public static void main(String[] args) {
        N_unique_integers_that_sum_up_to_zero obj = new N_unique_integers_that_sum_up_to_zero();
        System.out.println(Arrays.toString(obj.getThem(4)));

    }

    private int[] getThem(int n) {
        if(n == 0) return new int[]{};
        if(n == 1) return new int[]{0};
        int[] result = new int[n];
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            result[i] = i;
            sum += i;
        }
        result[n-1] = - sum;
        return result;
    }
}
