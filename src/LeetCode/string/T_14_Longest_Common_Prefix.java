package LeetCode.string;

public class T_14_Longest_Common_Prefix {
    public static void main(String[] args) {
        T_14_Longest_Common_Prefix obj = new T_14_Longest_Common_Prefix();

        String[][] input = new String[][]{{"flower", "flight", "flow"},
                                          {"cir", "car"},
                                          {"boogie", "boogie", "boogie"}};
//        System.out.println(obj.common_longer_prefix(input[1]));
        System.out.println(obj.common_longer_prefix2(input[2]));

    }

    private String common_longer_prefix(String[] input) {
        if(input.length == 0 || input[0].length() == 0) return "";
        StringBuilder result = new StringBuilder();
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < input.length; i++) {
            minLen = Math.min(minLen, input[i].length());
        }
        for (int i = 0; i < minLen; i++) {
            boolean add = true;
            char current = input[0].charAt(i);
            for (int input_index = 0; input_index < input.length; input_index++) {
                if(current != input[input_index].charAt(i)) add = false;
            }
            if(add) result.append(current);
            else break;
        }
        return result.toString();
    }

    // Recursive implementation:
    private String common_longer_prefix2(String[] input) {
        return recursive_implementation(input, 0, input.length-1);
    }

    private String recursive_implementation(String[] input, int start, int end) {
        if(start == end) return input[start];
        int middle = (start+end) / 2;
        String result_1 = recursive_implementation(input, start, middle);
        String result_2 = recursive_implementation(input, middle+1, end);
        return helper(result_1, result_2);
    }

    private String helper(String one, String two) {
        int length = Math.min(one.length(), two.length());
        for (int i = 0; i < length; i++) {
            if(one.charAt(i) != two.charAt(i)) return one.substring(0, i);
        }
        return one.substring(0, length);
    }

}