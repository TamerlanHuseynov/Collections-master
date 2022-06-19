package LeetCode.MixedTasks;

public class T_2062_Count_Vowel_Substrings_of_a_String {

    public static void main(String[] args) {
        T_2062_Count_Vowel_Substrings_of_a_String obj = new T_2062_Count_Vowel_Substrings_of_a_String();
        String input = "cuaieuouac"; // Expected = 7
        System.out.printf("Result = %s\nExpected = %s", obj.countVowelSubstrings(input), 7);

    }

    public int countVowelSubstrings(String word) {
        int len  = word.length(), count = 0;
        for(int p = 0; p < len; p++){
            if(isVowel(word.charAt(p))){
                int a = 0, e = 0, i = 0,o = 0,u = 0;
                for(int j = p; j < len && isVowel(word.charAt(j)); j++){
                    switch(word.charAt(j)){
                        case 'a' : a++; break;
                        case 'e' : e++; break;
                        case 'i' : i++; break;
                        case 'o' : o++; break;
                        case 'u' : u++; break;
                    }
                    if(a != 0 && e != 0 && i != 0 && o != 0 && u != 0) count++;
                }
            }
        }
        return count;
    }
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
