package LeetCode.string;

public class T_2129_Capitalize_the_Title {
//    https://leetcode.com/problems/capitalize-the-title/
    public static void main(String[] args) {
        T_2129_Capitalize_the_Title obj = new T_2129_Capitalize_the_Title();
        String title1 = "capiTalIze tHe titLe";
        String title2 = "First leTTeR of EACH Word";

        System.out.printf("Result = %s%n", obj.capitalizeTitle(title1));
        System.out.printf("Result = %s%n", obj.capitalizeWell(title1));
        System.out.printf("Result = %s%n", obj.capitalizeWell(title2));
    }

    private String capitalizeWell(String title) {
        int start = 0, end = 0;
        char[] tit = title.toCharArray();
        while(end <= tit.length) {
            if(end == tit.length || tit[end] == ' ') {
                helper(tit, start, end);
                start = ++end;
            } else end++;
        }
        return new String(tit);
    }

    private void helper(char[] arr, int start, int end) {
        if(end - start <= 2) {
            for(int i = start; i < end; i++) arr[i] = Character.toLowerCase(arr[i]);
        }else {
            arr[start] = Character.toUpperCase(arr[start++]);
            for (int i = start; i < end; i++) {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
    }


    // SLOW version
    private String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        for(int i = 0; i < arr.length; i++) arr[i] = capitalizeWord(arr[i]);
        return String.join(" ", arr);
    }

    private String capitalizeWord(String word) {
        if(word.length() <= 2) return word.toLowerCase();
        else return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
    }

}
