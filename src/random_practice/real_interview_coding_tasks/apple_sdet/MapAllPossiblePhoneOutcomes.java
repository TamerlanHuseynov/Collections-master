package random_practice.real_interview_coding_tasks.apple_sdet;

import java.util.ArrayList;
import java.util.List;

public class MapAllPossiblePhoneOutcomes {
    public static void main(String[] args) {
        /**
         given a 3-digit number from 2 to 9 as a String
         Print all words represent of this number
         EX:
         234 => "ADH" , "CFI" , ...
         985 => "ZUK" , ...

         AGM -> AGN -> AGO         |      000 -> 001 -> 002
         AHM -> AHN -> AHO         |      010 -> 011 -> 012
         AIM -> AIN -> AIO         |      020 -> 021 -> 022
         ------------------
         BGM -> BGN -> BGO         |      100 -> 101 -> 102
         BHM -> BHN -> BHO         |      110 -> 111 -> 112
         BIM -> BIN -> BIO         |      120 -> 021 -> 022
         ------------------
         CGM -> CGN -> CGO         |      200 -> 201 -> 202
         CHM -> CHN -> CHO         |      210 -> 211 -> 212
         CIM -> CIN -> CIO         |      220 -> 221 -> 222         */

        String given = "246";
        System.out.println(printAllOutcomes(given));
    }
    public static List<String> printAllOutcomes(String given){
        List<String> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        result.add("");

        for(int i=0; i<given.length(); i++){

            char[] currentLetters = getOptions(Character.getNumericValue(given.charAt(i)));
            if(currentLetters.length == 0) continue;

            for (String each : result) {

                for (int j = 0; j < currentLetters.length; j++) {
                    temp.add(each+currentLetters[j]);
                }

            }
            result = temp;
            temp = new ArrayList<>();
        }
        return result;
    }

    public static char[] getOptions(int num){
        switch(num){
            case 2: return new char[]{'A', 'B', 'C'};
            case 3: return new char[]{'D', 'E', 'F'};
            case 4: return new char[]{'G', 'H', 'I'};
            case 5: return new char[]{'J', 'K', 'L'};
            case 6: return new char[]{'M', 'N', 'O'};
            case 7: return new char[]{'P', 'Q', 'R', 'S'};
            case 8: return new char[]{'T', 'U', 'V'};
            case 9: return new char[]{'W', 'Z', 'Y', 'Z'};
            default: return new char[0];
        }
    }

}
