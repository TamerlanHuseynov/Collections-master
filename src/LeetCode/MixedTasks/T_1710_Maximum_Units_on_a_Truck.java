package LeetCode.MixedTasks;

import java.util.Arrays;

public class T_1710_Maximum_Units_on_a_Truck {
    // https://leetcode.com/problems/maximum-units-on-a-truck/
    public static void main(String[] args) {
        T_1710_Maximum_Units_on_a_Truck obj = new T_1710_Maximum_Units_on_a_Truck();
        // boxes[0] <-- number of boxes
        // boxes[1] <-- number of units per box
        int[][] boxes = {{1,3},{2,2},{3,1}}; // expected 8
        int truckSize = 4;

        System.out.println("Result = " + obj.maximumUnits(boxes, truckSize) );

    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int totalUnits=0;
        int boxTypeIndex = 0;

        Arrays.sort(boxTypes, (a, b) -> b[1]-a[1]);
        while(truckSize>0 && (boxTypeIndex<boxTypes.length && boxTypes[boxTypeIndex][0]>0) ) {
            boxTypes[boxTypeIndex][0]--;//take one box
            truckSize--; //reduce one box
            totalUnits+=boxTypes[boxTypeIndex][1];//add

            if(boxTypes[boxTypeIndex][0] == 0) //take next box type
                boxTypeIndex++;
        }
        return totalUnits;
    }

}
