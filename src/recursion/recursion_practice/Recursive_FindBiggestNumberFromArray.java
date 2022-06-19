package recursion.recursion_practice;

public class Recursive_FindBiggestNumberFromArray {
    public static void main(String[] args) {

        int[] pew = new int[]{11,22,3,4,54,6,7,8,91};
        int value = findBiggestNumber(pew, 123);
        System.out.println(value);
    }

    public static int findBiggestNumber(int[] arr, int index){

        if(index > arr.length) index = arr.length;
        if(index==1) return arr[0];
        else return Math.max(arr[index-1], findBiggestNumber(arr, index-1));

    }
}
