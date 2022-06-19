package LeetCode.MixedTasks;

public class Pangram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
    public static boolean checkIfPangram(String sentence) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        boolean result = true;
        for ( int i = 0; i < alphabet.length; i++){
            if (!sentence.contains(alphabet[i]+"")){result = false; break;}
        }
        return result;
    }

    public boolean checkIfPangramFasterOne(String sentence) {
        boolean isPanagram= false;
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        if(sentence.length()>=26){
            for(int i=0;i<alphabets.length();i++){
                if(sentence.indexOf(alphabets.charAt(i))==-1){
                    isPanagram=false;
                    break;
                }else{
                    isPanagram=true;
                }
            }
        }
        return isPanagram;
    }



}
