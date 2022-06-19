package LeetCode.MixedTasks;

public class Problem1422_MaximumNumberAfterSplitting {
    public static void main(String[] args) {
        Problem1422_MaximumNumberAfterSplitting obj = new Problem1422_MaximumNumberAfterSplitting();

//        DOESN"T WORK YET------ FIND A BUG IN HERE PLEASE


        String d = "01001";  //expected 4
        String s = "011101"; //expected: 5
        String a = "1111";  //expected: 3
        String c = "00"; //expected 1
        System.out.println(obj.maxScore(a));

    }



        public int maxScore(String s) {
            char[] charray = s.toCharArray();
            int maxScore = 0;
            int temp = 0;

            for(int i = 0; i<charray.length;i++){

                if(i !=0 || i != charray.length-1){
                    temp = counter(charray, i);
                }

                if(temp>maxScore){
                    maxScore=temp;
                }
            }
            return maxScore;
        }

        private int counter(char[] charray, int currentIndex){
            int pew = 0;

            for(int i =0; i<currentIndex; i++){
                if(charray[i]=='0') {pew++;}
            }
            for(int i = currentIndex; i<charray.length;i++){
                if(charray[i]=='1'){ pew++;}
            }

//            if(charray.length!=2 && ((currentIndex==0 && charray[0]=='1') || (currentIndex==charray.length-1 && charray[0]=='0')) ) pew--;

            return pew;
        }

    }




