package random_practice.more_tasks;

public class ReturnDuplicatedCharsFromStringAsString {
    // Cognizant interview task
    public static void main(String[] args) {
        ReturnDuplicatedCharsFromStringAsString obj = new ReturnDuplicatedCharsFromStringAsString();

        String input = "inteeRRRRvviiew";
        System.out.println("Duplicates = " + obj.returnDuplicates(input));
    }

    private String returnDuplicates(String input) {
//        StringBuilder unique_builder = new StringBuilder();
        StringBuilder duplicate_builder = new StringBuilder();
        int[] alphabet = new int[26];
        input = input.toLowerCase().replaceAll("^[a-z]", "");
        for(char c : input.toCharArray()) alphabet[c-'a']++;
        for(int i = 0; i < alphabet.length; i++){
            if(alphabet[i] > 1) duplicate_builder.append( (char)(i+97) );
//            else if(alphabet[i] == 1) unique_builder.append((char)(i+97));
        }
        return new String(duplicate_builder);
//        return new String(unique_builder);
    }
}
