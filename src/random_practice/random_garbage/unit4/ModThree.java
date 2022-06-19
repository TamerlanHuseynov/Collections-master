package random_practice.random_garbage.unit4;

public class ModThree {
    public static void main(String[] args) {
        int[] pew = {9, 7, 2, 9, 2, 2, 6};
//                   0  1  2  3  4  5  6
        int[] pew2 = {9, 7, 2, 9};

        int[] wow1 = {1,2};
        int[] wow2 = {2,1};


        System.out.println(modThree(pew2));


    }

    public static boolean modThree(int[] nums) {
        boolean result = false;

        for(int i = 0; i < nums.length-2; i++ ) {
            if ((nums[i] % 2 == 0) == (nums[i + 1] % 2 == 0) && (nums[i + 2] == 0) == (nums[i + 1] % 2 == 0)) {
                result = true;
                break;
            } else if ((nums[i] % 2 == 1) == (nums[i + 1] % 2 == 1) && (nums[i + 2] == 1) == (nums[i + 1] % 2 == 1)) {
                result = true;
                break;
            }
        }
        return result;
    }


}
