package random_practice.collections.iterate_through_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateCollections {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("C", "Java", "Python", "JavaScript", "Ruby"));


        // Traditional for loop:
        for (int i = 0; i < list.size(); i++) {            System.out.println(list.get(i));        }
        System.out.println("============");

//        Enhanced for loop:
        for (String each : list){            System.out.println(each);        }

        System.out.println("============");
//       Basic loop with iterator:
        for(Iterator<String> iterator = list.iterator(); iterator.hasNext();){
            String each = (String) iterator.next();
            System.out.println(each);
        }

        System.out.println("============");
//        Iterator with a while loop
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            String each = (String) iter.next();
            System.out.println(each);
        }

        System.out.println("============" + " After Java 8 " + "============");
//         stream with lambda:
        list.stream().forEach(each -> System.out.println(each));

        System.out.println("============");
//        for each + lambda
        list.forEach(each -> System.out.println(each));

        System.out.println("============");

        list.forEach(System.out::println);

    }
}
