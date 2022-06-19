package LeetCode.priority_q;

import java.util.PriorityQueue;
import java.util.Queue;

public class T_1046_Last_Stone_Weight {
//    https://leetcode.com/problems/last-stone-weight/
    public static void main(String[] args) {
        T_1046_Last_Stone_Weight obj = new T_1046_Last_Stone_Weight();


    }
    //TODO I went to bed, oh well...
    public int lastStoneWeight(int[] stones) {
        int current = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for(int stone: stones) queue.add(stone);

        while(!queue.isEmpty()) {
            int heavier = queue.peek();
            queue.remove();
            int lighter = queue.peek();
            queue.remove();


        }


        return -1;
    }

}
