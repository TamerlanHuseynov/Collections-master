package random_practice.algorithms_and_datastructures_course.arrays_revisited;

import java.util.Arrays;

public class TwoDimensionalArray {
    int[][] arr = null;

    public TwoDimensionalArray(int rows, int columns){
        this.arr = new int[rows][columns];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[0].length; column++) {
                arr[row][column] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValue(int row, int column, int value){
        try{
            if(arr[row][column] == Integer.MIN_VALUE){
                arr[row][column] = value;
                System.out.println("The value is successfully inserted");
            }
            else System.out.println("Cell is already occupied");

        }catch(ArrayIndexOutOfBoundsException e){}
        System.out.println("Invalid index for insertion!");
    }


    public static void main(String[] args) {

        TwoDimensionalArray sda = new TwoDimensionalArray(3,3);
        sda.insertValue(0,0,100);
        System.out.println(Arrays.deepToString(sda.arr));


    }
}