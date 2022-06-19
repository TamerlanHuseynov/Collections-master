package LeetCode.maps;

import java.util.HashMap;
import java.util.Map;

public class CountMaxBallsInBox {
    public static void main(String[] args) {
        System.out.println("result = " + countBalls(5, 15));

    }
    public static int countBalls(int lowLimit, int highLimit) {

        Map<Integer, Integer> map = new HashMap<>();
        //   box        countOfBalls

//        int totalBallCount = highLimit-lowLimit+1;

        for(int i=lowLimit; i<=highLimit;i++){
            //gotta figure out the box/key number:
            int temp = i;
            int boxNumber = 0;
            while(temp!=0){
                boxNumber += temp%10;
                temp /= 10;
            }
            if(map.containsKey(boxNumber))
                map.put(boxNumber, map.get(boxNumber) +1);
            else map.put(boxNumber, 1);
        }
        int max = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(max < entry.getValue()) max = entry.getValue();
        }
        return max;
    }
}
