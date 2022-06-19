package LeetCode.MixedTasks;

public class UpperLower {
    public static void main(String[] args) {

        System.out.println("A = " + (int)'A');
        System.out.println("a = " + (int)'a');

        printUpperLower("upper");
        printUpperLower("lower");

    }

    public static void printUpperLower(String param){
        int i = 0;
        switch(param){
            case "upper": i = 65; break;
            case "lower": i = 97; break;
            default: throw new IllegalArgumentException("Wrong input in printUpperLower() function!");
        }
        for (int j = 0; j < 26; j++) {
            System.out.print( (char)(i+j));
        }
        System.out.println();
    }
}
