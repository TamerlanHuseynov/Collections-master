package random_practice.random_garbage;

public class HackeRank_CountWords_in_String {
    public static void main(String[] args) {

        String input = "b? Dl )B 4(V! A. MK, YtG ](f 1m )CNxuNUR {PG?"; //5 <-- expected answer
        // word - is a letter with no numbers in it. only '-' allowed in the middle and 1 special punctuation char at the end

        String input2 = "jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878  dwa WE DE 7475 dsfh ds  RAMU 748 dj."; //21
        System.out.println("expected 5!! Actual = " + countLetters(input));
        System.out.println("expected 21!! Actual = " + countLetters(input2));

    }

    public static int countLetters(String str){

        int count = 0;
        String[] list = str.split(" ");

        for(String s: list){
            boolean word = false;
            char[] chars = s.toCharArray();
            for(int i = 0; i<chars.length; i++){
                char c = chars[i];
                if(Character.isLetter(c)) word = true;
                else if(Character.isDigit(c)){ word = false; break;}
                else if(!Character.isLetter(c) && c !='-' && i != chars.length-1){
                    if(!Character.isLetter(c)){ word = false; break;}
                }
            }
            if(word) count++;
        }
    return count;
    }

}
