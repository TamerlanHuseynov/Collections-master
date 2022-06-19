package LeetCode.string;

public class T_171_Excel_Sheet_Column_Number {
    //    https://leetcode.com/problems/excel-sheet-column-number/
    public static void main(String[] args) {
        T_171_Excel_Sheet_Column_Number obj = new T_171_Excel_Sheet_Column_Number();
        String columnTitle = "ZY";
        System.out.println("Result = " + obj.titleToNumber(columnTitle));

    }

    public int titleToNumber(String columnTitle) {
        int sum = 0;
        char[] column = columnTitle.toCharArray();
        for(int i = 0; i < columnTitle.length(); i++) {
            int column_char_value = column[column.length - i - 1];
            int power = ( column_char_value - 'A' + 1) * (int)Math.pow(26, i);
            sum += power;
        }
        return sum;
    }

}
