package LeetCode.string;

public class T_944_Delete_Columns_to_Make_Sorted {
    public static void main(String[] args) {

        String[] input = {"abce",
                          "bcef",
                          "caeg"};

        System.out.println("how many deleted = " + deleteColumns(input));

    }

    public static int deleteColumns(String[] strs) {
        if(strs.length == 0) return 0;
        int nextChar=0;
        int count=0;
        for(int character=0;character<strs[1].length();character++){
            for(int string=0;string<strs.length;string++){
                int prevChar = strs[string].charAt(character);
                if(string+1<strs.length) nextChar = strs[string+1].charAt(character);
                if(prevChar > nextChar){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

}
