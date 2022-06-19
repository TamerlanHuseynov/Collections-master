package LeetCode.MixedTasks;

public class ParanthesisGame {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
//        expected:            ()()()
    }
    public static String removeOuterParentheses(String s) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        char[] sArr = s.toCharArray();

        for (int i = 0; i < sArr.length; i++) {

            switch(sArr[i]){
                case '(': count++; if(count > 1){builder.append(sArr[i]);}  break;

                case ')': if (count > 1){builder.append(sArr[i]);} count--; break;
            }
        }

        return builder.toString();
    }

}
