package leetcode;

import java.util.Arrays;
// Prakash solved it
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
public class HowManyNumSmallerThanCurrent {
    //int[] nums = {8,1,2,2,3};
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] myOutput=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[j] < nums[i]){
                    count++;
                }
            }
            myOutput[i]=count;
        }

        System.out.println(Arrays.toString(myOutput));
        return myOutput;
    }

    public static void main(String[] arg){
        int[] nums = {8,1,2,2,3};
        HowManyNumSmallerThanCurrent obj = new HowManyNumSmallerThanCurrent();
        obj.smallerNumbersThanCurrent(nums);

    }
}
