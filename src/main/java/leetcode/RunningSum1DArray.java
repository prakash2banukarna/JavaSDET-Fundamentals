package leetcode;

import java.util.Arrays;
//Prakash solved it
//https://leetcode.com/problems/running-sum-of-1d-array/description/
public class RunningSum1DArray {
    public int[] runningSum(int[] nums) {
// nums = [1,2,3,4]
        int[] myOutput=new int[nums.length];
        int runningSum=0;
        for(int i=0;i<nums.length;i++){
            runningSum=runningSum+nums[i];
            myOutput[i]=runningSum;
        }

        System.out.println(Arrays.toString(myOutput));
        return myOutput;
    }

    public static void main(String[] arg){
        int[] nums = {1,2,3,4};
        RunningSum1DArray obj = new RunningSum1DArray();
        obj.runningSum(nums);

    }
}
