package LeetCode.MixedTasks;

public class T_1154_DayOfTheYear {
    public static void main(String[] args) {


        System.out.println(dayOfYear("2019-01-09"));

    }
    public static int dayOfYear(String date) {
        int result = 0;
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8));

        if(month == 1){
            return day;
        }

        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};

        if((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            months[1] = 29;
        }

        for(int i = 0; i < month-1; i++){
            result += months[i];
        }

        result += day;
        return result;
    }
    }
