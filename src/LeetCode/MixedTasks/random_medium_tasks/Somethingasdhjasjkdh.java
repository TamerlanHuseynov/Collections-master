package LeetCode.MixedTasks.random_medium_tasks;


public class Somethingasdhjasjkdh {

    public static void main(String[] args) {

        String input = "Please reverse me, I swear I kill you!";
        System.out.println(input);
        String result = reverse_recursively(input);
        System.out.println(result);
    }
    /*
        Please reverse me, I swear I kill you!
         lease reverse me, I swear I kill you! = +P
          ease reverse me, I swear I kill you! = l+P
           ase reverse me, I swear I kill you! = l+e+P
            se reverse me, I swear I kill you! = l+e+a+P
            ....
            !uoy llik I raews I ,em esrever esaelP
     */
    public static String reverse_recursively(String input) {
        if (input.length() == 1) return input;
        else return reverse_recursively(input.substring(1)) +input.charAt(0);
    }

}
