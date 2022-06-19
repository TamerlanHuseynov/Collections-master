package LeetCode.MixedTasks;

public class T_860_Lemonade_Change {
//    https://leetcode.com/problems/lemonade-change/
    public static void main(String[] args) {
        T_860_Lemonade_Change obj = new T_860_Lemonade_Change();
        int[] buyers = {5,5,5,10,20};
        System.out.println("obj.lemonadeChange(buyers) = " + obj.lemonadeChange(buyers));
    }
    private boolean lemonadeChange(int[] bills) {
        int count_5 = 0, count_10 = 0;

        for(int bill : bills) {
            if(bill == 5) count_5++;
            else if(bill == 10) {
                count_10++;
                count_5--;
            }else{
                if(count_10 > 0){
                    count_10--;
                    count_5--;
                } else count_5 -= 3;
            }
            if(count_5 < 0 || count_10 < 0) return false;
        }
        return true;
    }

}
