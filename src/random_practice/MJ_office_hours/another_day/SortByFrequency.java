package random_practice.MJ_office_hours.another_day;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortByFrequency {
    /*
    //finish this task. it's almost done:

        tomorrow ==> ooorrtmw  <--- after we deal with O and R we follow the regular order

     */
    public static void main(String[] args) {

    }

    //terrible solution!
    public static String sortByFrequency(String str){

        List<Character> list = new ArrayList<>();

        for (char c : str.toCharArray()) {
            list.add(c);
        }

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {
                if(Collections.frequency(list, list.get(i)) < Collections.frequency(list, list.get(j))){
                    char temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }

        }
        // join method doesn't work with character
        return null;
    }
}
