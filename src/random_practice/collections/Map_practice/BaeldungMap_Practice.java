package random_practice.collections.Map_practice;

import java.util.HashMap;
import java.util.Map;

public class BaeldungMap_Practice {
    public static void main(String[] args) {

    Product ebike = new Product("E-Bike", "A bike with a battery");
    Product roadBike = new Product("RoadBike", "A bike for competition");

    Map<String, Product> productsByName  = new HashMap<>();

    productsByName.put(ebike.getName(), ebike);
    productsByName.put(roadBike.getName(), roadBike);

    Product newEbike = productsByName.get("E-Bike");

    if("A bike with a battery".equals(newEbike.getDescription())){
        System.out.println("Bikes match!");
    }else{
        System.out.println("Bikes don't match!");
    }

    Product anotherEBike = new Product("E-Bike", "A bike with a better battery");
    productsByName.put(anotherEBike.getName(), anotherEBike);

    if("A bike with a better battery".equals(productsByName.get("E-Bike").getDescription()) ){
        System.out.println("they match!");
    }else{
        System.out.println("they don't match!");
    }
        System.out.println("newEbike.hashCode() = " + newEbike.hashCode());
        System.out.println("productsByName.hashCode() = " + productsByName.hashCode());


    }
}
