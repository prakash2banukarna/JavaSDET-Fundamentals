package leetcode;

import java.util.Arrays;

//Prakash solved it

//https://leetcode.com/problems/array-partition/description/?envType=problem-list-v2&envId=array


public class ArrayPairSum {

    public int arrayPairSum(int[] nums) {
        int output=0;
        Arrays.sort(nums);
        //for(int i=0;i<nums.length;i+=2) this can used to increment more than 1
        for(int i=0;i<nums.length;i++){
            output=output+nums[i];
            i=i+1;
        }

        System.out.println(output);
        return output;

    }

    public static void main(String[] arg){
        int[] nums = {6,2,6,5,1,2};
        ArrayPairSum obj = new ArrayPairSum();
        obj.arrayPairSum(nums);
    }
}
