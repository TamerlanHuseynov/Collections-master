package LeetCode.MixedTasks;

import java.util.HashSet;

public class T_929_UniqueEmailAddress {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        System.out.println(numUniqueEmails(emails));

    }

    public static int numUniqueEmails(String[] emails) {

        // . in first part is ok
        // + in first part == ignore till @

        HashSet<String> set = new HashSet<>();

        for(String each : emails){

            int index = each.indexOf("@");

            String local = each.substring(0, index);
            String domain = each.substring(index+1);

            int i_plus = local.indexOf("+");

            if( i_plus >= 0) local = local.substring(0, i_plus);

            set.add(local.replaceAll("\\.","")+domain);

        }
        System.out.println(set);
        return set.size();
    }

}
