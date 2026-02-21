package leetcode;


import java.util.Arrays;

public class MaximizeSumArrKNegations_InProgress {

    public int largestSumAfterKNegations(int[] nums, int k) {
        //nums = [4,2,3], k = 1
        Arrays.sort(nums);
        for(int i=0;k>0;i++,k--){
            nums[i]=-nums[i];
        }

        int myOutput=0;
        for(int j=0;j<nums.length;j++){
            myOutput=myOutput+nums[j];
        }
        System.out.println(myOutput);
        return myOutput;

    }

    public static void main(String[] arg){
        int[] nums = {4,2,3};
        int k = 1;
        MaximizeSumArrKNegations_InProgress obj=new MaximizeSumArrKNegations_InProgress();
        obj.largestSumAfterKNegations(nums,k);
    }
}
