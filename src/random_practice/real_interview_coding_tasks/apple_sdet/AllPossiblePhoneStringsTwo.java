package random_practice.real_interview_coding_tasks.apple_sdet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllPossiblePhoneStringsTwo {
    public static void main(String[] args) {
        String phone = "345";
        List<String> result = letterCombinations(phone);
        System.out.println(result.size());
        System.out.println(result);
    }


    public static ArrayList<String> letterCombinations(String phoneNumber) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> preResult = new ArrayList<>();
        result.add("");


        for(int i = 0; i < phoneNumber.length(); i++) {

            String letters = map.get(phoneNumber.charAt(i));

            if (letters.length() == 0) continue;

            for(String each : result) {

                for(int j = 0; j < letters.length(); j++)
                    preResult.add(each + letters.charAt(j));
            }

            result = preResult;
            preResult = new ArrayList<String>();
        }
        return result;
    }

    static final HashMap<Character,String> map = new HashMap<Character,String>(){{
        put('1', "");
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
        put('0', "");
    }};
}
