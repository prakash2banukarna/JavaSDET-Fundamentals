package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//
/*
int duration =2;
 int[] timeSeries={1,4};
1,2 (duration times
4,5 (duration times
 */
//Prakash solved it -Time exceeded
// https://leetcode.com/problems/teemo-attacking/description/?envType=problem-list-v2&envId=array

// refer solution --> https://leetcode.com/problems/teemo-attacking/solutions/1956310/java-easy-on-solution-with-intuition-by-tw8y0/?envType=problem-list-v2&envId=array

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        List myOutput=new ArrayList();

        for(int i=0;i<timeSeries.length;i++){
            int durationTimes=0;
            int value=timeSeries[i]; // Original value
            while(durationTimes<duration){
                if(!myOutput.contains(value)){
                    myOutput.add(value);
                    value++; // Value incrementing based on durationTimes
                    durationTimes++;
                }

            }
        }
        System.out.println(myOutput);
        return myOutput.size();

    }

    public int findPoisonedDuration_TimeExceeded(int[] timeSeries, int duration) {
        Set myOutput=new HashSet();

        for(int i=0;i<timeSeries.length;i++){
            int durationTimes=0;
            int value=timeSeries[i]; // Original value
            while(durationTimes<duration){
                myOutput.add(value);
                value++; // Value incrementing based on durationTimes
                durationTimes++;
            }
        }
        System.out.println(myOutput);
        return myOutput.size();

    }

    public static void main(String[] arg){
        int duration =2;
        int[] timeSeries={1,4};
        TeemoAttacking obj=new TeemoAttacking();
//        obj.findPoisonedDuration(timeSeries,duration);
        obj.findPoisonedDuration_TimeExceeded(timeSeries, duration);
    }
}
