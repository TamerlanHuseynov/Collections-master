package random_practice.random_garbage;

import java.util.ArrayList;
import java.util.List;

public class CheckingOutRetainAll {
    public static void main(String[] args) {
        List<String> listOne = new ArrayList<String>(){{
            add("one");
            add("three");
            add("five");
            add("seven");
        }};
        List<String> listTwo = new ArrayList<String>(){{
            add("one");
            add("two");
            add("three");
            add("seven");
        }};

        System.out.println("listOne before retainAll() = " + listOne);
        System.out.println("listOne.retainAll(listTwo) = " + listOne.retainAll(listTwo));
        System.out.println("listOne = " + listOne);
    }
}
