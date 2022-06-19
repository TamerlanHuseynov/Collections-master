package LeetCode.MixedTasks;

public class ReverseStringsInASentence {
    public static void main(String[] args) {
        System.out.println(reverseWordsFaster("This is a long and interesting one!"));
    }

    public static String reverseWords(String s) {
        char[] ch = s.toCharArray();
        StringBuilder full = new StringBuilder();
        StringBuilder piece = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                piece.append(ch[i]);
            } else {
                piece.reverse();
                full.append(piece).append(ch[i]);
                piece.setLength(0);
            }

        }
        return full.toString().trim();
    }

        public static String reverseWordsFaster(String s) {

            char[] c = s.toCharArray();
            int start = 0, end = 0;
            for(; end < c.length; end++){
                if(c[end] == ' '){
                    reverse(c, start, end-1);
                    start = end+1;
                }
            }
            reverse(c, start, end-1);
            return new String(c);
        }

        private static void reverse(char[] c, int start, int end){
            while(start < end){
                char tmp = c[end];
                c[end] = c[start];
                c[start] = tmp;
                start++;
                end--;
            }
        }
    }


