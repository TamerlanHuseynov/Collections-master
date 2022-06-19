package recursion;

public class T_1266_Minimum_Time_Visiting_All_Points {
    // https://leetcode.com/problems/minimum-time-visiting-all-points/
    public static void main(String[] args) {
        T_1266_Minimum_Time_Visiting_All_Points obj = new T_1266_Minimum_Time_Visiting_All_Points();

        int[][] input = {{1,1},{3,4},{-1,0}}; //7

        System.out.println("recursive " + obj.minTimeToVisitAllPoints_slow_recursive(input));
        System.out.println("iterative " + obj.minTimeToVisitAllPoints_fast_iterative(input));

    }
        public int minTimeToVisitAllPoints_slow_recursive(int[][] points) {
            if(points.length == 0) return 0;
            int count = 0;
            int x = points[0][0];
            int y = points[0][1];
            for(int[] positions: points) {
                count += move_once(x, y, positions);
                x = positions[0];
                y = positions[1];
            }
            return count;
        }
/*
1) y= x>
2) y= x=
3) y= x<
4) y> x>
5) y> x=
6) y> x<
7) y< x>
8) y< x=
9) y< x<
        */
        private int move_once(int x, int y, int[] target) {
            if(y==target[1] && x==target[0]) return 0;
            else if(y == target[1] && x  > target[0]) return 1 + move_once(x-1, y, target);
            else if(y == target[1]) return 1 + move_once(x+1, y, target);
            else if(y <  target[1] && x  < target[0]) return 1 + move_once(x+1, y+1, target);
            else if(y <  target[1] && x == target[0]) return 1 + move_once(x, y+1, target);
            else if(y <  target[1]) return 1 + move_once(x-1, y+1, target);
            else if(x  > target[0]) return 1 + move_once(x-1, y-1, target);
            else if(x == target[0]) return 1 + move_once(x, y-1, target);
            else return 1 + move_once(x+1, y-1, target);
        }

    public int minTimeToVisitAllPoints_fast_iterative(int[][] points) {
        if(points.length == 0) return 0;
        int count = 0;
        int x = points[0][0];
        int y = points[0][1];
        for(int[] positions: points) {
            count += calculate_total_moves(x, y, positions);
            x = positions[0];
            y = positions[1];
        }
        return count;
    }

    private int calculate_total_moves(int x, int y, int[] target) {
        return Math.max(Math.abs(x - target[0]), Math.abs(y - target[1]));
    }

}
