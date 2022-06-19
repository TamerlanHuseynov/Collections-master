package LeetCode.MixedTasks;

public class Sorting {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] result = new String[arr.length];
        for (String value : arr) {
            int index = Integer.parseInt(value.substring(value.length() - 1));
            result[index - 1] = value.substring(0, value.length() - 1);
        }
        StringBuilder builder = new StringBuilder();
        for (String value : result) builder.append(value).append(" ");
        return builder.toString().trim();
    }
}
