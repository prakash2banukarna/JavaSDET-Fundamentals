package leetcode;

import java.util.Arrays;
// Prakash solved it
// https://leetcode.com/problems/build-array-from-permutation/description/
public class BuildArrayPermutation {
    public int[] buildArray(int[] nums) {

        int[] myoutput=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            myoutput[i]=nums[nums[i]];

        }
        System.out.println(Arrays.toString(myoutput));
        return myoutput;
    }
    public static void main(String[] arg){
        int[] nums = {0,2,1,5,3,4};
        BuildArrayPermutation obj =new BuildArrayPermutation();
        obj.buildArray(nums);
    }
}
