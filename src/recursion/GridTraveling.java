package recursion;

import java.util.HashMap;
import java.util.Map;

public class GridTraveling {
//    How many efficient ways are there to traverse X by Y matrix?
    public static void main(String[] args) {
        GridTraveling obj = new GridTraveling();
        /*
         example[0] --> x
         example[1] --> y
         example[2] --> expected result
        */
        long[][] examples = {{1, 1, 1},
                            {2, 3, 3},
                            {3, 2, 3},
                            {18, 18, 2333606220L}};

        Map<String, Long> memo_map = new HashMap<>();
        obj.test(examples, memo_map);
    }

    private long grid_traveler(long x, long y, Map<String, Long> memo) {
        // Base cases:
        if (x <= 0 || y <= 0) return 0;
        if( x == 1 || y == 1) return 1;

        String key_one = x + "-" + y;
        String key_two = y + "-" + x;
        if (!memo.containsKey(key_one) && !memo.containsKey(key_two)) {
            memo.put(key_one, grid_traveler(x - 1, y, memo) + grid_traveler(x, y-1, memo));
        }
        return memo.get(key_one) == null ? memo.get(key_two) : memo.get(key_one);
    }

    public void test(long[][] examples, Map<String, Long> memo_map) {
        for (long[] example : examples) {
            long x = example[0];
            long y = example[1];
            long result = example[2];
            long actual = grid_traveler(x, y, memo_map);
            System.out.println("Expected result for x = "+ x + ", y = " + y + " is = " + result);
            System.out.println("actual result is = " + actual);
            System.out.println("Is result of our method correct?  = " + (actual == result ? "yes" : "no"));
            System.out.println("------------------------------------------------------------");
        }
    }
}
