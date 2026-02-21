package leetcode;

import java.util.*;
//Prakash solved it but time exceeded
//https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii/description/
public class MinimumOperationsExcThreshII_TimeExceeded {
    public int minOperations(int[] nums, int k) {
        List<Long> newLst=new ArrayList<>();

        for(int x:nums){
            newLst.add(Long.valueOf(x));
        }

        int myoutput=0;

        Collections.sort(newLst);
        while(newLst.size()>=2 && newLst.get(0)<k){
            long temp=0;
            temp=   Long.valueOf(newLst.get(0)*2) + Long.valueOf(newLst.get(1));
            newLst.remove(0); // we can remove two values if both are less than k , thats why below step
            if(newLst.get(0)<k){
                newLst.remove(0);
            }
            newLst.add( temp);
            myoutput++;
            Collections.sort(newLst);


        }
        System.out.println(myoutput);
        return myoutput;

    }


    public static void main(String[] a){
//        int[] nums = {2,11,10,1,3};
//        int k = 10;
        int[] nums = {1000000000,999999999,1000000000,999999999,1000000000,999999999};
        int k = 1000000000;
        MinimumOperationsExcThreshII_TimeExceeded obj=new MinimumOperationsExcThreshII_TimeExceeded();
        obj.minOperations(nums,k);
    }




}
