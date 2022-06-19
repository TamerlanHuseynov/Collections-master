package random_practice.LambdaExamples.MapperExamples;

import java.util.Arrays;
import java.util.List;

public class MapperExamplesOne {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");
        System.out.println("Functional Style: ");
        names.stream()
                .filter(MapperExamplesOne::isNotSam)
                .forEach(System.out::println);





    }
    private static boolean isNotSam(String name){return !name.equals("Sam");}
}
