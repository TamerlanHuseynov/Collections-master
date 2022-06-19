package random_practice.Replits;

import java.util.Scanner;

    class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            Dog dog = new Dog("joe", 2, "pomeranian");
            Dog dog2 = new Dog("joe", 2, "pomeranian");
            System.out.println(dog);
            System.out.println(dog.equals(dog2));

        }
    }
