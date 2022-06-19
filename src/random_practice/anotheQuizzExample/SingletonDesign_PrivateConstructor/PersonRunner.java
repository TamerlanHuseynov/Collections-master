package random_practice.anotheQuizzExample.SingletonDesign_PrivateConstructor;

public class PersonRunner {
    public static void main(String[] args) {

//        Person person = new Person();

        Person person = Person.getPerson("Andrew");
        Person personTwo = Person.getPerson("MJ");

        System.out.println(person.name);
        System.out.println(personTwo.name);
        System.out.println(person.name);

    }
}
