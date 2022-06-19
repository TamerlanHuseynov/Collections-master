package random_practice.Replits;

public class Dog extends Animal {

    String breed;
    int humanYears;

    public Dog(String name, int age, String breed){
        setName(name);
        setAge(age);
        this.breed = breed;
    }

    public String toString(){
        return "Name: " + getName() +
                "\nBreed: " + this.breed +
                "\nAge in calendar years: " + getAge() +
                "\nAge in human years: " + getAgeInHumanYears();
    }

    public int getAgeInHumanYears(){
        if(getAge()<=2){this.humanYears = getAge() * 11; }
        else{ this.humanYears = 22 + ((getAge()-2) * 5); }
        return this.humanYears;
    }

    public boolean equals(Dog bulldog){
        return this.getName().equalsIgnoreCase(bulldog.getName()) &&
                (this.getAge() == bulldog.getAge() ||
                        this.breed.equals(bulldog.breed));
    }




}
