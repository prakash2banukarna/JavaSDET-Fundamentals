package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Prakash solved it
//https://leetcode.com/problems/distribute-elements-into-two-arrays-i/description/

/*
Step 1: Create two lists, add nums[0] to the first list and nums[1] to the second list. [web:9]

Step 2: From index 2 to end, compare the last elements of both lists:
        - If last element of list 1 > last element of list 2, append current nums[i] to list 1.
        - Otherwise, append current nums[i] to list 2.

Step 3: Concatenate list 2 after list 1 (add all elements of list 2 to list 1).

Step 4: Copy all elements from the final list into the output int[] array and return it.
*/


public class DistributeElementsTwoArrays {
    public int[] resultArray(int[] nums) {
        //nums = [5,4,3,8]
        List<Integer> nums1Lst=new ArrayList<>();
        nums1Lst.add(nums[0]);
        List<Integer> nums2Lst=new ArrayList<>();
        nums2Lst.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            if(nums1Lst.getLast()>nums2Lst.getLast()){
                nums1Lst.add(nums[i]);
            }
            else{
                nums2Lst.add(nums[i]);
            }
        }


        int[] myoutput=new int[nums.length];

        nums1Lst.addAll(nums2Lst);
        System.out.println(nums1Lst);

        for(int x=0;x<nums1Lst.size();x++){
            myoutput[x]=nums1Lst.get(x);
        }

        System.out.println(Arrays.toString(myoutput));
        return myoutput;

    }

    public static void main(String[] arg){
       int[] nums = {5,4,3,8};
        DistributeElementsTwoArrays obj=new DistributeElementsTwoArrays();
        obj.resultArray(nums);
    }

}
