package random_practice.random_garbage;

import java.util.*;

public class SetPewPew {
    public static void main(String[] args) {

        Map<String ,Integer> map = new HashMap<>();
        map.put("pew",1);
        map.put("pads",1);
        map.put("pdsaad",1);
        map.put("pdsaa",1);

        int[] pew = {1,2,3,4,5,6,7};
        int i = Arrays.binarySearch(pew, 3);
        System.out.println(i );

        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        int count = 0;
        while(it.hasNext()){
//            Map.Entry<String, Integer> each = it.next();
            if(it.next().getValue()==1){
                count++;
                it.remove();
            }
        }
        System.out.println("map = " + map + ". Count = " + count);
    }
}
