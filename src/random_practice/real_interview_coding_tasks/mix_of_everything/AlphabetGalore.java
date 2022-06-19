package random_practice.real_interview_coding_tasks.mix_of_everything;

public class AlphabetGalore {
    public static void main(String[] args) {
        /*
        Question :
      - From a given String, find out all the vowels, consonants and empty space and print their counts
      - Store the vowels and consonants into a HashMap<AlphabetType,List>
      - Finally from the individual Lists, get the duplicated alphabets occurrence count for both vowels and consonants
      - Capitalization of alphabets shouldn't matter for any of the solutions
      - String testData = "How many vowels in this String "
         */
//        Map<AlphabetType, List<Character>> pew = HashMap<>();

        String p = "123  AS   DAS  Da sda sd ";

        System.out.println(p + " <-- original");

        p = p.replaceAll("[^a-zA-Z]", "").toLowerCase();

        System.out.println(p + " <-- result");





    }

}
