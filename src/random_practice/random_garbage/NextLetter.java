package random_practice.random_garbage;

public class NextLetter {
    /*
    2.  Create a function NextLetter which takes a string parameter and modifies it using
    the following algorithm: Replace every letter in the string with the letter next but
    one in the alphabet (c becomes e, z becomes b,  A becomes C).
    Ignore numbers and symbols. Then capitalize every vowel in this new string (a, e, i, o, u)
    and finally return this modified string. The string will not be empty and not include spaces.
    Examples:
    Input    Output
    £7eBm    £7gDO
    Znb0y    Bpd0A

    3. Create a function StarredLetters which takes a string and determine if
    it satisfies our requirements by returning either “true” or “false”.
    For the string to be true each letter must be surrounded by a * symbol.
    The string will not be empty and will have at least one letter.
    Examples
    Input    Output
    a%=3=*    true <--- How is this "surrounded" ?!?!?! Requirements not clear.
    %3b%3    false
     */
    public static void main(String[] args) {
        NextLetter obj = new NextLetter();

        obj.validate_nextLetter(new String[]{"£7eBm", "Znb0y"},
                                new String[]{"£7gDO", "Bpd0A"});

        String[] starLetter_input = {"a%=3=*", "%3b%3 "};


    }

    // Methods for 2nd task:
    private String nextLetter(String input) {
        if(input == null || input.length() == 0) return input;
        char[] input_array = input.toCharArray();
        for(int i = 0; i < input_array.length; i++) {
            if(Character.isLetter(input_array[i])) {
                boolean isUpperCase = Character.isUpperCase(input_array[i]);
                input_array[i] = (char)(input_array[i] + 2);
                if(isUpperCase && input_array[i] >= 'Y') input_array[i] = (char)(input_array[i]-26);
                else if(!isUpperCase && input_array[i] >= 'y') input_array[i] = (char)(input_array[i]-26);
                if(isLowerCaseVowel(input_array[i])) input_array[i] = (char)(input_array[i] - 32);
            }
        }
        return new String(input_array);
    }

    private boolean isLowerCaseVowel (char c) {
        return c=='a' || c=='o' || c=='u' || c=='i' || c=='e';
    }

    private void validate_nextLetter(String[] nextLetter_input, String[] nextLetter_expected) {
        for (int i=0;i<nextLetter_input.length;i++) {
            String nextLetter_result =  nextLetter(nextLetter_input[i]);
            System.out.printf("actual = %s, expected = %s, test case pass = %s\n",
                    nextLetter_result,
                    nextLetter_expected[i],
                    nextLetter_expected[i].equals(nextLetter_result));
        }
    }

    // Below are methods related to 3rd task:
    private void no_clue(String input) {
        System.out.println("REQUIREMENTS ARE NOT CLEAR");
    }

}
