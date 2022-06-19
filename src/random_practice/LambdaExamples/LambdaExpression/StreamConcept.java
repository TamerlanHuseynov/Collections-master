package random_practice.LambdaExamples.LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamConcept {
    public static void main(String[] args) {

        List<String> productList = new ArrayList<>(Arrays.asList("Phone","Book","Table","Bed","Charger","Laptop"));
        productList.forEach(System.out::println);

        List<String> myNewListOne = productList.stream()
                .filter(e -> !e.equals("Book"))
                .collect(Collectors.toList());

        myNewListOne.forEach(System.out::println);



    }
}
