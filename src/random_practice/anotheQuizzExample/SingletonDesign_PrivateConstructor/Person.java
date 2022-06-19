package random_practice.anotheQuizzExample.SingletonDesign_PrivateConstructor;

public class Person {
    public String name = "";

    private Person(String name ){
        this.name = name;
    }

    public static Person getPerson(String name){
        Person person = new Person(name);
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
