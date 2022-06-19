package random_practice.random_garbage;

import javax.swing.text.Segment;
import java.nio.CharBuffer;

public class CastingCharSequence {
    public static void main(String[] args) {

        CharSequence sq = new String("pew");
        CharSequence sq2 = new StringBuffer("buffer");
//      CharBuffer, Segment, String, StringBuffer, StringBuilder
//        CharSequence sq3 = new CharBuffer();
        CharSequence sq4 = new Segment();
        CharSequence sq5 = new StringBuilder();

        char[] pew = ((String) sq).toCharArray();
        ((StringBuilder) sq).reverse();
        ((StringBuffer) sq).append('c');
        char c = ((Segment) sq).charAt(0);


    }
}
