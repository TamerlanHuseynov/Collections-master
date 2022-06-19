package random_practice.random_garbage.unit4;


public class DoesWordContainsAllTheLettersTwo {
        public static void main(String[] args) {

            String[] strArr = {"aabc", "abcdb", "gggh", "klsrtabcabc",
                    "78787*79789", "aaffdfddddddddddddd"};

            char[] credentials = {'a', 'b', 'b', 'c'};
            //   output = "abcdb", "klsrtabcabc"

            pew(strArr, credentials);

        }

        public static void pew(String[] words, char[] alpha){

            int[] alphabet = new int[26];
            for (char c : alpha) alphabet[c-97]++;

            for (String word : words) {

                int[] letters = new int[26];

                for (char c : word.toCharArray()) {
                    if(c < 'a' || c > 'z' ) continue;
                    letters[c-97]++;
                }

                boolean flag = true;
                for(int i=0; i<26; i++){

                    if(alphabet[i] <= letters[i]) continue;
                    else{
                        flag = false;
                        break;
                    }

                }
                if(flag) System.out.println(word);
            }

        }


}
