package random_practice.LambdaExamples.MapperExamples;

import java.util.Arrays;
import java.util.List;

public class MapperExamplesTwo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");
        names.stream()
                .filter(MapperExamplesTwo::isNotSam)
                .map(User::new)
                .forEach(System.out::println);
    }

    private static boolean isNotSam(String name){return !name.equals("Sam");}

   static class User{
        public User(String name){ setName(name); }
        private String name;
        private Integer age = 30;
        public String getName() {return name;}
        public Integer getAge() {return age;}
        public void setName(String name) {this.name = name;}
        public void setAge(Integer age) {this.age = age;}

       @Override
       public String toString() {
           return "User{" +
                   "name='" + name + '\'' +
                   ", age=" + age +
                   '}';
       }

   }
}
