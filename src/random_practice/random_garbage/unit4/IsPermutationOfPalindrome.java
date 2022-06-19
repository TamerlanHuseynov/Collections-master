package random_practice.random_garbage.unit4;

public class IsPermutationOfPalindrome {

/**  Write a function that can determine if a permutation of a given String is palindromic:
     input : Tact Coa
     Output: True
     Permutations: "taco cat" , "atco cta"     */
    public static void main(String[] args) {
        String input = "Tact Coa";
        String input2 = "Tact  Coa12!!";
        System.out.println("hasPalindromicPermutation = " + hasPalindromicPermutation(input));
    }

    public static boolean hasPalindromicPermutation(String input){

        if(input == null || input.isEmpty()) throw new IllegalArgumentException("WTF?");

        int[] alphabet = new int[26];
        input = input.toLowerCase().replaceAll("[^a-z]","");

        //count each occurrence of each letter and save to int[]
        for (char c : input.toCharArray()){ alphabet[c-97]++; }

        // even amount of characters means we can make a palindrome out the word
        // we can have only 1 odd character in case where length of word is odd:  leVel <--- v
        int countOdd = 0;
        for(int i=0;i<alphabet.length;i++){ if(alphabet[i]%2!=0) countOdd++; }

        if(input.length()%2==1 && countOdd==1) return true;
        else if(input.length()%2==0 && countOdd==0) return true;
        else return false;
    }

}
