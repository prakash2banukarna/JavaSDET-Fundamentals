package leetcode;
//Prakash Solved

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1880164041/?envType=problem-list-v2&envId=array

import java.util.Arrays;

public class RemoveDuplicatesInPlace {


    public int removeDup(int[] nums){
        int place=0;

        //My initial implementation
//        for(int i=1;i<nums.length;i++){
//            if(nums[place]==nums[i]){
//
//            }
//            else{
//                place=place+1;
//                nums[place]=nums[i];
//            }
//
//        }

        // More effective - from impementation
        for(int i=1;i<nums.length;i++){
            if(nums[place]!=nums[i]){
                place=place+1;
                nums[place]=nums[i];
            }

        }




        System.out.println(Arrays.toString(nums));
        System.out.println("My output :" + (place +1));
        return (place +1);
    }

    public static void main(String[] arg){
       int[] nums = {0,0,1,1,2,2,3,3,4};
        RemoveDuplicatesInPlace obj=new RemoveDuplicatesInPlace();
        obj.removeDup(nums);





    }
}
