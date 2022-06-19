package random_practice.random_garbage;
/*
 * Instructions:
 *
 * 1) Use the Java programming language.
 * 2) Please use this CoderPad editor to code your solution. Code written
 *    outside CoderPad’s editor and copy/pasted into CoderPad will not be
 *    accepted.
 * 3) Please write "production quality" code. Imagine that after you have
 *    written this code it will be submitted to one of your peers for code
 *    review. Your code should compile/execute without warnings/errors.
 * 4) Once you have completed the below Acceptance Criteria, simply close
 *    this tab and inform your point-of-contact that you are done.
 *
 * Acceptance Criteria:
 *
 * 1) Write a function that accepts an array/list of strings, counts the
 *    occurrence of each string, and then returns a data structure with
 *    each unique string and the number of times it occurred. For example,
 *    given an input that contains:
 *
 *        ["apple", "bat", "apple", "car"]
 *
 *    the function should return a data structure that has a count of 2 for
 *    "apple", 1 for "bat", and 1 for "car".
 *
 *    Notes:
 *
 *      a) Your solution should ignore differences in upper/lowercase:
 *         "Apple" should be treated as "apple"
 *      b) Your solution should trim/strip/remove all
 *         leading/trailing/inner whitespace: " app le " should be treated
 *         as "apple"
 *      c) Your solution should trim/strip/remove any non-alphanumeric
 *         characters (a-z, A-Z, 0-9): "apple!" should be treated as
 *         "apple"
 *
 * 2) Write the unit test coverage for your solution. Cover the
 *    permutations that ensure positive/negative functionality is correct.
 *    As well, cover meaningful edge cases to ensure both correct
 *    functionality and to ensure no errors with code execution.
 *    Note: For test coverage, feel free to just use assertion statements.
 *    However, if you're more comfortable using a testing library, that is
 *    acceptable too.
 * 3) At the top of your function/solution, document as a comment the big O
 *    run time of your solution.
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution_for_Tulay {
    public static void main(String[] args) {
        Solution_for_Tulay obj = new Solution_for_Tulay();
        String[]arr={"ap  pl e", "b at", "apple132", "car"};
        System.out.println(obj.solve(arr));

        //add Unit Tests. I don't have Junit installed. But you need to map expected results and actual results...
        /*

        @Test
        public void unit_test_1(String[] arr){

        1) run solve function and compare it to hand-made map with ready answer.
        2) cover edge cases: what if you pass:
            - null array
            - null as a value of an individual String
            - numeric String
            - only white spaces
            - uppercase letters
            - lowercase letters
            - mix of uppercase + lowercase + numeric
            etc....
        }
         */
    }

    //O(n) <-- linear runtime
    //Since only one pass over the given input

    //O(m) <-- space complexity since we make a Map for given input


    private Map<String, Integer> solve(String[] input) {

        //cover edge cases
        if(input==null || input.length==0) return null; // or return new HashMap<String, Integer>(); <-- requirements??

        Map<String, Integer> solution = new LinkedHashMap<>();
        for (String each : input) {
            //function will fail if you try to use String methods on null, thus below line to avoid it:
            if(each == null || each.isEmpty()) continue;
            //replaceAll("[^a-z]"); <--- if you don't want to keep numbers( 3 lines below).
            // It's not exactly clear why they want to keep numbers in there...
            String current = each.toLowerCase().replaceAll("[^a-z0-9]", "");
            if (solution.containsKey(current)) {
                solution.put(current.toLowerCase(), solution.get(current) + 1);
            } else {
                solution.put(current, 1);
            }
        }
        return solution;
    }
}
