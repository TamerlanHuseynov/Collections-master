package random_practice.more_tasks;

import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        /*
        String -- sum of digits in a string
        */
        System.out.println("result = " + (3 + 14 + 14 + 1 + 451 + 521 + 5 + 1));
        String str = "3h14kjl14h1i451hj521l5h1l";
        System.out.println(sumAll(str));

        String strTwo = "zcvbcnbcvsgdnghturo";
        System.out.println("replace with x: " + replaceEverySecondDuplicatesWithX(strTwo));

        int[] arr = {1, 5, 2, 526, 6, 3, 7432, 543, 252356, 653};
        System.out.println("sorted ascending: " + Arrays.toString(sortAsc(arr)));

        System.out.println("first unique = " + firstUnique("aabbccddeekkllmmn"));

    }

    public static int sumAll(String str) {

        int result = 0;
        char[] c = str.toCharArray();
        String temp = "";

        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) temp += "" + c[i];
            else {
                if (temp.length() < 1) continue;
                result += Integer.parseInt(temp);
                temp = "";
            }
        }
        return result;
    }


    public static int sumAllRegex(String str) {
        int result = 0;
        String strResult = str.replaceAll("[^0-9]", " ");
        strResult.split(" ");
        //TODO


        return result;
    }

    public static String replaceEverySecondDuplicatesWithX(String strTwo) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = strTwo.toCharArray();
        for (Character each : arr) {
            if (map.containsKey(each)) map.put(each, map.get(each) + 1);
            else map.put(each, 1);
        }
        for (int i = 0; i < arr.length; i++) {
            int current = map.get(arr[i]);
            if (current > 0) {
                result.append(arr[i]);
                map.put(arr[i], -1);
            } else result.append('x');
        }
        return new String(result);
    }

    public static int[] sortAsc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * write a method that returns 1st unique character in a string
     */
    public static String firstUnique(String str) {
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String result = "";
        for (String e : list) {
            if (Collections.frequency(list, e) < 2) {
                result = e;
                break;
            }
        }
        if (result.length() < 1) result = "No uniques";
        return result;
    }

    /*
     Array -- N unique integers that sum up to 0
     Write a function:
     that, given an integer N (1 < N < 100)
     returns an array containing N unique integers that sum up to 0.
     The function can return any such array.
     For example, given N=4, the function could return [1,0, -3,2] or [-2,1, -4,5].
     The answer [1,-1,1,3] would be incorrect (because value 1 occurs twice).
     For N = 3 one of the possible answers is [-1,0,1]
     (but there are many more correct answers). */
    public static int[] solution(int n) {
        int[] result = new int[n];
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            result[i] = i;
            sum += i;
        }
        result[n - 1] = -sum;
        return result;
    }

    /*
    Numbers -- Armstrong numbers
    Write a method that can check if a number is Armstrong.
    Armstrong is a number where sum of each digit == number^3 */
    public boolean isArmstrong(int num) {
        String temp = String.valueOf(num);
        int resultInt = 0;
        String[] numArr = temp.split("");

        for (int i = 0; i < numArr.length; i++) {
            int x = Integer.parseInt(numArr[i]);
            resultInt += (Math.pow(x, numArr.length));
        }
        return resultInt != num;
    }


}