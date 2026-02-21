package leetcode;

import java.util.Arrays;
// prakash solved it
// https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/description/

public class MinimumOperationsExcThreshI {
    public int minOperations(int[] nums, int k) {
//nums = [2,11,10,1,3], k = 10
        Arrays.sort(nums);
        int myoutput=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                myoutput++;
            }
            else{
                break;
            }

        }
        System.out.println(myoutput);
        return myoutput;
    }

    public static void main(String[] a){
        int[] nums = {2,11,10,1,3};
        int k = 10;
        MinimumOperationsExcThreshI obj=new MinimumOperationsExcThreshI();
        obj.minOperations(nums,k);
    }

}
