package LeetCode.MixedTasks;

public class T_1021_RemoveOutermostParentheses {
    public static void main(String[] args) {

        System.out.println(removeOuterParentheses("(()())(())"));
//        expected:            ()()()


    }

    public static String removeOuterParentheses(String s) {
        if(s.equals(""))return "";
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char[] inputToCharArray = s.toCharArray();

        for(char each : inputToCharArray){
            switch(each){
                case '(': count++;
                {if(count>1){ sb.append(each);}}; break;

                case ')': {if(count>1){sb.append(each);}} count--; break;

                default: break;
            }
        }
        return sb.toString();
    }


}
