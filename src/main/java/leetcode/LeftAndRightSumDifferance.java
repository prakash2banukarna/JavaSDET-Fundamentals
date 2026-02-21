package leetcode;

import java.util.Arrays;
// prakash solved it
// https://leetcode.com/problems/left-and-right-sum-differences/description/

public class LeftAndRightSumDifferance {


    public int[] leftRightDifference(int[] nums) {
//nums = [10,4,8,3]
        int[] myoutput = new int[nums.length];

        for(int i=0;i< nums.length;i++){
            int left=Arrays.stream(nums,0,i).sum();
            int right=Arrays.stream(nums,i+1,nums.length).sum();
            System.out.println(left+"-"+right);
            myoutput[i]=Math.abs(left-right);
        }

        System.out.println(Arrays.toString(myoutput));
        return myoutput;

    }


    public static void main(String[] arg){
        int[] nums = {10,4,8,3};
        LeftAndRightSumDifferance obj = new LeftAndRightSumDifferance();
        obj.leftRightDifference(nums);
    }
}
