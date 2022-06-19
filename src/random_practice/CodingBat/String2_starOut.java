package random_practice.CodingBat;

public class String2_starOut {
    public static void main(String[] args) {

        String[] input = {"ab*cd", "ab**cd", "sm*eilly"};
//                          "ad       ad        silly
        System.out.println(starOut(input[0]) + " <> ad");
        System.out.println(starOut(input[1]) + " <> ad");
        System.out.println(starOut(input[2]) + " <> silly");



    }
    public static String starOut(String str) {

        if(str == null || str.length() < 2 ) return str;

        StringBuilder b = new StringBuilder();

        for(int i=0;i<str.length();i++){
            // sm*eilly
            // silly
            if( i + 1 < str.length() && str.charAt(i+1) == '*') continue;

            else if( str.charAt(i) == '*') continue;

            else if( i >= 1 && str.charAt(i-1) == '*' ) continue;


            else{b.append(str.charAt(i));}

        }
        return new String(b);
    }

}
