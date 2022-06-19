package random_practice.random_garbage;

import java.util.Arrays;

public class TwoDimentionalArrayReversal {
    public static void main(String[] args) {

        int[][] image = {{1, 2, 3, 4},   // {3,2,1}
                {6, 7,8},   // {6,5,4}
                {10, 20, 30, 40, 50, 60}};  // {9,8,7}

        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
        System.out.println("-------------------------");

        int temp = 0;
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length/2;j++){
                temp = image[i][j];
                image[i][j] = image[i][image[i].length-1-j];
                image[i][image[i].length-1-j] =temp;
            }
        }

        for (int j = 0; j <image.length; j++) {
            System.out.println(Arrays.toString(image[j]));
        }

        System.out.println("-------------------------");
        for(int i=0;i<(image.length-1)/2;i++){
            int[] tempArr=new int[image[i].length];
            tempArr = image[image.length-1];
            image[image.length-1] = image[i];
            image[i] = tempArr;
        }

        System.out.println(Arrays.toString(image[0]));
        System.out.println(Arrays.toString(image[1]));
        System.out.println(Arrays.toString(image[2]));
        }
}
