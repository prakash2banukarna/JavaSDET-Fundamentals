package leetcode;
// Prakash solved it
// https://leetcode.com/problems/calculate-delayed-arrival-time/description/
public class CalculateDelayedTime {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
//arrivalTime = 15, delayedTime = 5
        int totalArriavalTime=arrivalTime+delayedTime;
        if(totalArriavalTime>=24){
            System.out.println(24-totalArriavalTime);
            return totalArriavalTime-24;
        }
        System.out.println(totalArriavalTime);
        return totalArriavalTime;

    }

    public static void main(String[] r){
        int arrivalTime = 13;
        int delayedTime = 11;
        CalculateDelayedTime obj= new CalculateDelayedTime();
        obj.findDelayedArrivalTime(arrivalTime,delayedTime);
    }

}
