package random_practice.random_garbage;

import java.util.Random;

public class PlusMinusPlus {

    public static void main(String[] args) {
        PlusMinusPlus obj = new PlusMinusPlus();
        String input = obj.generatePlusMinusString(10);
        System.out.println("Randomized input = " + input);
        System.out.println("solution1 result = " + obj.solution1(input));
        System.out.println("solution3 result = " + obj.solution3(input));
        String hard_core = "Plus abc-PLUS-pewPew_Minus pluMinuPlus";
        System.out.println("HardCore = " + hard_core);
        System.out.println("result   = " + obj.solution2(hard_core));
    }




    private String solution2(String input) {
        if(input == null || input.length() < 4) return input;
        StringBuilder builder = new StringBuilder();
        char[] characters = input.toCharArray();
        char[] plus = {'p', 'l', 'u', 's'};
        char[] minus = {'m', 'i', 'n', 'u', 's'};
        int len = characters.length;
        int start = 0, end = 0;
        boolean incremented;

        while (start < len) {
            incremented = false;
            while (end + start < len && end < plus.length &&
                    Character.toLowerCase(characters[end + start]) == Character.toLowerCase(plus[end])) end++;
            if (end == 4) {
                builder.append('+');
                start += 4;
                incremented = true;
            }
            end = 0;
            while (end + start < len && end < minus.length && !incremented &&
                    Character.toLowerCase(characters[end + start]) == Character.toLowerCase(minus[end])) end++;
            if (end == 5) {
                builder.append('-');
                start += 5;
                incremented = true;
            }
            end = 0;
            if (!incremented) builder.append(characters[start++]);
        }
        return new String(builder);
    }




    private String solution1(String input) {
        return input.replace("Plus", "+").replace("Minus", "-");
    }

    private String solution3(String input) {
        StringBuilder result = new StringBuilder(input.length() / 4);
        for(int i = 0; i < input.length(); i++) {
            if("plus".equalsIgnoreCase(input.substring(i, i+4))) {
                result.append('+');
                i += 3;
            }else if("minus".equalsIgnoreCase(input.substring(i, i+5))){
                result.append('-');
                i+= 4;
            }
        }
        return result.toString();
    }

    private String generatePlusMinusString(int howManyRandomWords) {
        StringBuilder builder = new StringBuilder(5 * howManyRandomWords);
        Random random = new Random();
        String[] combo_wombo = {"Plus", "Minus"};
        int counter = 0;
        while(counter <= howManyRandomWords) {
            builder.append(combo_wombo[random.nextInt(2)]);
            counter++;
        }
        return new String(builder);
    }

}
