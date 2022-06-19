package random_practice.random_garbage;

public class Largest_String_without_3 {
    public static void main(String[] args) {
        String[] input = {"aaabbbcccdddeekl", "aaa", "aabaaa", "cccvcscccccc",
                          "pewpewpew", "ssaaammmpleee", "bbb", "111222242342444444",
                null, "xxxtxxx", "eedaaad"};
        for (int i = 0; i < input.length; i++) {
            System.out.println("Before = " + input[i]);
            System.out.println("After = " + largest_string(input[i]));
            System.out.println("--------------------------------------");
        }
    }

    public static String largest_string(String input) {
        if(input == null || input.length() <=2) return input;
        char[] chars = input.toCharArray();
        int index = 2;
        StringBuilder result = new StringBuilder()
                .append(chars[0])
                .append(chars[1]);
        for (int i = 2; i < chars.length; i++) {
            if(result.charAt(index-2) == chars[i] && result.charAt(index-1) == chars[i]) continue;
            else{
                result.append(chars[i]);
                index++;
            }
        }
        return result.toString();
    }

}
