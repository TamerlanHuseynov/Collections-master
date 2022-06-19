package random_practice.LambdaExamples.LambdaExpression;

public class JankovLambdaExamplesTwo {

    private String fourthText = "Fourth Text";
    static String thirdText = "Hey, a third text";

    public void doIt() {

        //Has to be final or effectively final to be used in lambda
        final String otherText = "hello: ";

        MyInterface myInterface = (text -> {
            return otherText + text + " " + thirdText;
        });

        //allowed to change the value of static value
        thirdText = "bla-bla-bla";
        System.out.println(myInterface.printIt("ABC"));
    }

    public static void main(String[] args) {
    JankovLambdaExamplesTwo instance = new JankovLambdaExamplesTwo();
    instance.doIt();

    }

}
