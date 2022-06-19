package random_practice.collections.iterate_through_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortList {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(30);
        nums.add(50);
        nums.add(40);
        nums.add(20);

        System.out.println(nums);
//        ascending order:
        Collections.sort(nums);
        System.out.println(nums);

//        descending order:
        Collections.reverse(nums);
        System.out.println(nums);

    }
}
