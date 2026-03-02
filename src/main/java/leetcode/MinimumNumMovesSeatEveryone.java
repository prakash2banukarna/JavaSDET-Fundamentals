package leetcode;

import java.util.Arrays;
//Prakash solved it
// https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/

public class MinimumNumMovesSeatEveryone {
    public int minMovesToSeat(int[] seats, int[] students) {
//seats = [3,1,5], students = [2,7,4]
        Arrays.sort(seats);
        Arrays.sort(students);

        int count=0;
        for(int i=0;i<seats.length;i++){
            count=count+Math.abs(seats[i]-students[i]);
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] arg){
        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        MinimumNumMovesSeatEveryone obj =new MinimumNumMovesSeatEveryone();
        obj.minMovesToSeat(seats,students);
    }
}
