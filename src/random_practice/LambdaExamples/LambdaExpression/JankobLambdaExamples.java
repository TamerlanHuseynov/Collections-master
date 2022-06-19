package random_practice.LambdaExamples.LambdaExpression;

import java.util.Comparator;

public class JankobLambdaExamples {
    public static void main(String[] args) {

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        int comparison = stringComparator.compare("hello", "world");
        System.out.println(comparison);


        Comparator<String> stringComparatorLambda = (o1, o2) -> o1.compareTo(o2);
        int lambdaComparison = stringComparatorLambda.compare("hello", "world");
        System.out.println(lambdaComparison);



        MyFunction myFunction = (text, text2) -> {
            return text + " " + text2;
        };

        String returnValue = myFunction.apply("Hello Function Body ", "Lambda Practice");
        System.out.println(returnValue);

        String returnValue2 = myFunction.apply("text1", "text2");
        System.out.println(returnValue2);

    }


}
