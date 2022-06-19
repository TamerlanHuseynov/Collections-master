package LeetCode.MixedTasks;

public class T_482_License_Key_Formatting {
//    https://leetcode.com/problems/license-key-formatting/
    public static void main(String[] args) {
        T_482_License_Key_Formatting obj = new T_482_License_Key_Formatting();
        String license = "5F3Z-2e-9-w";
        int k = 4;
        System.out.printf("Old license = %s where k = %s\nNewLicense = %s", license, k, obj.licenseKeyFormatting(license, k));

    }

    private String licenseKeyFormatting(String s, int k) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for(int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == '-') continue;
            char c = Character.toUpperCase(s.charAt(i));
            if(count == k && (Character.isDigit(c) || Character.isLetter(c)) ){
                builder.append('-');
                count = 0;
            }
            builder.append(c);
            count++;
        }
        return builder.reverse().toString();
    }

}
