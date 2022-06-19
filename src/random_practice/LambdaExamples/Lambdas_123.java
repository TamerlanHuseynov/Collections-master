package random_practice.LambdaExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas_123 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(3, 1, 4));

        System.out.println(square56(nums)); // 19, 11



    }

    public static List<Integer> square56(List<Integer> nums) {

        List<Integer> collect =
                nums
                .stream()
                .map(variable -> variable * variable + 10)
                .filter(variable -> (variable % 10 != 5) && (variable % 10 != 6) )
                .collect(Collectors.toList());

        return collect;
    }

    public static List<Integer> square(List<Integer> nums) {

        List<Integer> collect =
                nums
                        .stream()
                        .map(variable -> variable * variable + 10)
                        .filter(variable -> variable % 10 != 5)
                        .filter(variable -> variable % 10 != 6)
                        .collect(Collectors.toList());

        return collect;
    }

}
