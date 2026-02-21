package leetcode;

import java.util.Arrays;

//Prakash solved it
//https://leetcode.com/problems/minimum-number-game/description/
public class MinimumNumberGame {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] myoutput =new int[nums.length];
        for(int i=0;i<nums.length;i=i+2){
            myoutput[i]=nums[i+1];
            myoutput[i+1]=nums[i];
        }
        System.out.println(Arrays.toString(myoutput));
        return myoutput;

    }

    public static void main(String[] a){
        int[] nums = {5,4,2,3};
        MinimumNumberGame obj=new MinimumNumberGame();
        obj.numberGame(nums);
    }
}
