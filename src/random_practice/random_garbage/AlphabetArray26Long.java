package random_practice.random_garbage;

import java.util.Arrays;

public class AlphabetArray26Long {
    public static void main(String[] args) {
        String anythign = "ashjdahskjdhakudfhajksdhajkshdajkhsdaszzzzzz";
        int[] alphabet = new int[26];
        for(char c: anythign.toCharArray()){
    // a - 97 = index 0
//     b - 97 = index 1
//            ....
//     z - 97 = index 26
            alphabet[c-97]++;
        }
        System.out.print(" ");
        for (int i = 'a'; i<='z'; i++){
            System.out.print(((char)i) + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(alphabet));
    }

    public int maximum69Number (int num) {

        String pew = String.valueOf(num);
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < pew.length(); i++){

            if( pew.charAt(i) == '6' ){
                b.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(b.toString());
    }

}
