package random_practice.real_interview_coding_tasks.apple_sdet;

import java.util.*;

public class Mj_solution {
        public static void main(String[] args) {
            System.out.println(T9("897"));
        }

        public static List<String>  T9(String num){ // 9

            ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A", "B", "C"));
            ArrayList<String> list3 = new ArrayList<>(Arrays.asList("D", "E", "F"));
            ArrayList<String> list4 = new ArrayList<>(Arrays.asList("G", "H", "I"));
            ArrayList<String> list5 = new ArrayList<>(Arrays.asList("J", "K", "L"));
            ArrayList<String> list6 = new ArrayList<>(Arrays.asList("M", "N", "O"));
            ArrayList<String> list7 = new ArrayList<>(Arrays.asList("P", "Q", "R", "S"));
            ArrayList<String> list8 = new ArrayList<>(Arrays.asList("T", "U", "V"));
            ArrayList<String> list9 = new ArrayList<>(Arrays.asList("W", "X", "Y", "Z"));

            List<List<String>> numbers =
                    new ArrayList<>(Arrays.asList(list2, list3, list4, list5, list6, list7, list8, list9));

            System.out.println(numbers.get(0).get(1));

            System.out.println("numbers = " + numbers);

            String result = "";
            List<String> all = new ArrayList<>();

            for (int i = 0; i < numbers.get(Character.getNumericValue(num.charAt(0))-2).size(); i++) {

                for (int j = 0; j < numbers.get(Character.getNumericValue(num.charAt(1))-2).size(); j++) {

                    for (int k = 0; k < numbers.get(Character.getNumericValue(num.charAt(2))-2).size(); k++) {
                        result = numbers.get(Character.getNumericValue(num.charAt(0))-2).get(i)
                                + numbers.get(Character.getNumericValue(num.charAt(1))-2).get(j)
                                + numbers.get(Character.getNumericValue(num.charAt(2))-2).get(k);

                        all.add(result);
                    }
                }
            }

            System.out.println("all.size() = " + all.size());

            return all;
        }
    }
