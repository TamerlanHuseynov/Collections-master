package random_practice.MJ_office_hours;

public class MJ_office_hours_part2 {
    public static void main(String[] args) {

        /** Find all substring in a String:
         *  ABC
         *  012
         *  ABC / AB / BC / C / A / B
         * (0,0) ==> (0,1) ==> (0,2) ==> (0,3) ==>
         * (1,2) ==> (1,3) ==>
         *  (2,3) ==>
         */
        String str = "ABCD";
        printAllSubstring(str);
    }

    public static void printAllSubstring (String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }

}
