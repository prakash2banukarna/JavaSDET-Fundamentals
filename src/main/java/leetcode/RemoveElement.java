package leetcode;

import java.util.Arrays;
//prakash solved - though i took time.

// https://leetcode.com/problems/remove-element/description/?envType=problem-list-v2&envId=array
public class RemoveElement {

    public static void main(String[] arg){

        int[] nums = {3,2,2,3,3,2,2,3};
        int val = 3;

        int position=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val ){
                nums[position]=nums[i];
                position=position+1;
            }

        }
        System.out.println(Arrays.toString(nums));
        System.out.println(position);


    }
}
