package random_practice.CodingBat;

public class String3_WithoutString {
    public static void main(String[] args) {

        String[] base = {"Hello there", "Hello there","This is a FISH" };
        String[] remove = {"llo", "e", "IS"};
        String[] expected = {"He there","Hllo thr", "Th a FH"};

        System.out.println(expected[2] + " = " + withoutString(base[2], remove[2]));
//        System.out.println("Hllo thr = " + withoutString(base[1], remove[1]));


    }

    public static String withoutString(String base, String remove) {

        if( base.length() < remove.length() || base.length() == 0) return base;
        StringBuilder b = new StringBuilder();

        // ab xx xxab  l=8
        // 01 23 4567   xx l=2

        int i;

        for(i =0; i < base.length()- remove.length(); i++ ){

            if(base.substring(i, i+remove.length()).equalsIgnoreCase(remove)){
                i+=remove.length()-1;
            }else b.append(base.charAt(i));


        }

        if(i!= base.length()-1){
            for (i = i; i < base.length(); i++) { b.append(base.charAt(i)); }
        }


//        String substring = base.substring((base.length()+1 - remove.length()));
//        if(!substring.equalsIgnoreCase(remove) ) b.append(substring);

        return new String(b);
    }


}
