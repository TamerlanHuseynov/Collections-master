package random_practice.collections.Set_practice;

import java.util.*;
import java.util.stream.Stream;

public class Set_Intro {
    public static void main(String[] args) {

        /**
         *  The Java Set interface represents an
         *  collection of
         *  -unordered  <-- no gurantee of order in which elements are kept inside the Set
         *  -unique     <-- duplicates are not allowed
         *  elements
         *
         *  List interface (ArrayList) is ordered and not unique while
         *  Set interface  unordered and unique.
         *
         *  Set is an interface, so you cannot instantiate a Set directly, you need to create an object first
         *
         */

        Set<String> set = new HashSet<>();  // <--- HashSet is the class that implements Set interface. elements are unordered

        // Methods:
        // .add()   <-- adds value to the Set and returns a boolean whether the value was added or not
        set.add("Andrew");
        set.add("Mykola");
        set.add("Gokay");
        set.add("1234");
        set.add("PewPew");
        set.add("Samed");
        set.add("Ozgur");
        set.add("Vadim");
        set.add("Nadir");
        set.add("Max");

        System.out.println("Can we have one Kibi in the set? " + set.add("Kibi"));
        System.out.println("Can we have two Kibi in the set? " + set.add("Kibi"));
//        System.out.println(set);

//         .remove(value) methods removes value from the Set<> and returns a boolean depending if element was removed or not:
        System.out.println("---------removing element-----------");
        set.remove("1234");
        System.out.println(set.remove("Nadir"));
        System.out.println(set.remove("Nadir"));


        System.out.println("---------removing a bulk of elements-----------");
//        .removeAll(values here as collection)  <-- removes all elements that are present in the set:
        set.removeAll(Arrays.asList("Nadir", "Gokay", "Andrew", "PewPew", "para-boom"));
        System.out.println(set);


        System.out.println("---------adding a bunch of elements-----------");
//        adding a bulk of elements:
        set.addAll(Arrays.asList("Something", "ExtraElement", "56789", "and more!"));
        System.out.println(set);


        System.out.println("--------- .retainAll() method example: -----------");
//         .retainAll() method deletes every element in the set, except for those, specified as params in the method:
        set.retainAll(Arrays.asList("Samed", "56789", " Vadim"));




        System.out.println("---------new stuff-----------");
//      we can pass an existing collection to Set constructor to add values to it right away:
        Set<String> anotherSet = new HashSet<>(set);

//        Iterating through Set with classic Iterator:
//         .hasNext <-- boolean that returns true or false if we have more elements
//         .next()  <-- returns current index of iterator

        Iterator<String> iterator = anotherSet.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.print(next + " ");
        }

        // <--- TreeSet orders it's elements internally
        //  <--- ordered collection, sorts itself automatically
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -10, -20));
//        set2.addAll(set);  <--- another way to add collection to current collection.
        System.out.println();
        
//        regular for each loop:
        for (Integer next : set2) {
            System.out.print(next + " ");
        }

        System.out.println();
        System.out.println("--------------------");

//        Iterating elements of Set with .stream()
        Stream<Integer> stream = set2.stream();
        stream.forEach((element) -> { System.out.print(element + " "); });

        System.out.println("---------Checking size of a Set: -----------");
        System.out.println("Size of our set is = " + set2.size());

        System.out.println("---------Checking if Set has elements: -----------");
        System.out.println("Is our set empty? " + set2.isEmpty());

        System.out.println("---------Checking if Set contains an element: -----------");
        System.out.println("Do we have 20 in there?" + set2.contains(-20));
        System.out.println("Do we have 9999 in ther? " +set2.contains(9999));

        System.out.println("--------Cleaned up our Set: ----------");
//        clearing everything from the set:
        set2.clear();
        System.out.println(set2);




    }
}
