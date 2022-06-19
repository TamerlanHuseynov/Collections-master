package LeetCode.string;

import java.util.PriorityQueue;

public class T_1629_Slowest_Key {
//    https://leetcode.com/problems/slowest-key/
    public static void main(String[] args) {
        T_1629_Slowest_Key obj = new T_1629_Slowest_Key();

        int[] releaseTime1 = {12,23,36,46,62};
        String keysPressed1  = "spuda"; // a 16
        System.out.println("Expected result = 'a' and was = '" + obj.slowestKey(releaseTime1, keysPressed1) + "'");
        System.out.println("---------------------------------");

        // 9   29   49   50
        // c   b    c    d
        // 9   20   20   1
        int[] releaseTime2 = {9,29,49,50};
        String keysPressed2  = "cbcd"; // c
        System.out.println("Expected result = 'c' and was = '" + obj.slowestKey(releaseTime2, keysPressed2) + "'");
    }

    private char slowestKey(int[] releaseTimes, String keysPressed) {
        int len = releaseTimes.length;
        if(len == 1) return keysPressed.charAt(0);
        PriorityQueue<KeyCombo> pQue = new PriorityQueue<>(
                (a, b) -> {
                    int dur = Integer.compare(b.duration, a.duration);
                    if(dur == 0) return Character.compare(b.key, a.key);
                    return dur;
                }
        );
        pQue.add(new KeyCombo(keysPressed.charAt(0), releaseTimes[0]) );
        for(int i = 1; i < releaseTimes.length; i++)
            pQue.add(new KeyCombo(keysPressed.charAt(i), releaseTimes[i] - releaseTimes[i-1]));
        return pQue.peek().key;
    }


}

class KeyCombo {
    char key;
    int duration;
    public KeyCombo(char key, int duration) {
        this.key = key;
        this.duration = duration;
    }
}
