package random_practice.random_garbage;

import java.util.Arrays;

public class Seat_A_Family_of_Three_in_a_Plane {

    public static void main(String[] args) {

        //reserved seats. Can be listed in any order. N - number of reserved seats

        /*    Plane
         A B C   D E F G   H I J
        {x x x   x x x x   x x x}  <-- 1
        {x x x   x x x x   x x x}  <-- 2
        {x x x   x x x x   x x x}  <-- 3
        {x x x   x x x x   x x x}  <-- 4
        {x x x   x x x x   x x x}  <-- 5
        {x x x   x x x x   x x x}  <-- ...
        {x x x   x x x x   x x x}  <-- N
         */
        Seat_A_Family_of_Three_in_a_Plane obj = new Seat_A_Family_of_Three_in_a_Plane();
        String input = "1A 3C 2B 40G 5A";
        int N = 10;
        System.out.printf("Result = %s", obj.seat3(input, N));
    }

    private int seat3(String occupiedSeats, int N) {
        if(occupiedSeats == null || occupiedSeats.isEmpty()) return N * 3;
        if(N == 0) return 0;
        boolean[][] plane = new boolean[N][10];
        String[] seats = occupiedSeats.split(" ");
        for (String seat : seats) {
            int row = 0;
            int iterator = 0;
            while (iterator < seat.length() && Character.isDigit(seat.charAt(iterator))) {
                row = row * 10 + Character.getNumericValue(seat.charAt(iterator++));
            }
            int column = seat.charAt(iterator) - 65;
            row--;
            if (row >= N || column > 9) {
                System.out.printf("Seat %d-%d doesn't exist!\n", row, column);
                continue;
            }
            plane[row][column] = true;
        }
        int count = 0;
        for (int row = 0; row < N; row++) count += validateRowFor3(plane[row]);
        return count;
    }

    private int validateRowFor3(boolean[] row) {
        int count = 0;
        if (!row[0] && !row[1] && !row[2]) count++;
        if(!row[4] && !row[5] && (!row[3] || !row[6])) count++;
        if(!row[7] && !row[8] && !row[9]) count++;
        return count;
    }



}
