package LeetCode.MixedTasks;

import java.util.Arrays;
import java.util.Stack;

public class T_1475_Prices_Discount {
    public static void main(String[] args) {

        int[] one = {8,4,6,2,3}; // 4,2,4,2,3
        int[] two = {10,1,1,6}; // 9,0,1,6
        System.out.println(Arrays.toString(finalPricesStack(one)));
        System.out.println(Arrays.toString(finalPricesStack(two)));

    }

    public static int[] finalPrices(int[] prices) {

        for (int i = 0; i < prices.length; i++) {

            if (i == prices.length - 1) break;

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }

        }
        return prices;
    }

    public static int[] finalPricesStack(int[] prices) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                prices[stack.pop()] -= prices[i];

            }
            stack.push(i);
        }
        return prices;
    }

}