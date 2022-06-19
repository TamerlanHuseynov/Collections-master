package LeetCode.MixedTasks;

public class das {
    public static void main(String[] args) {
        System.out.println(isSumEqual("acb", "cba","cdb"));



    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int first, second, target;
        char[] c1 = firstWord.toCharArray();
        char[] c2 = secondWord.toCharArray();
        char[] t = targetWord.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<c1.length;i++){
            builder.append((int)(c1[i]-97));
        }
        first = Integer.parseInt(builder.toString());
        builder.setLength(0);
        System.out.println(first);

        for(int i=0;i<c2.length;i++){
            builder.append((int)(c2[i]-97));
        }
        second = Integer.parseInt(builder.toString());
        builder.setLength(0);
        System.out.println(second);

        for(int i=0;i<t.length;i++){
            builder.append((int)(t[i]-97));
        }
        target = Integer.parseInt(builder.toString());
        builder.setLength(0);
        System.out.println(target);

        return (first+second) == target;
    }



}
