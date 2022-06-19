package recursion;

public class Reverse_a_String {
    public static void main(String[] args) {
        String str = "Hello recursive reversal!";
        System.out.println(str);
        System.out.println(reverse_recursively(str));
    }

    public static String reverse_recursively(String str) {
        if(str.isEmpty()) return str;
        else return reverse_recursively(str.substring(1)) + str.charAt(0);
    }

}
