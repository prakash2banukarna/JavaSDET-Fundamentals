package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Prakash solved it
//https://leetcode.com/problems/find-target-indices-after-sorting-array/description/

public class FindTargetIndicesAfterSorting {
    public List<Integer> targetIndices(int[] nums, int target) {
// nums = [1,2,5,2,3], target = 2

        Arrays.sort(nums);
        List<Integer> myoutput=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                myoutput.add(i);
            }
        }
        System.out.println(myoutput);
        return myoutput;

    }


    // copied from google
    public List<Integer> targetIndices_solution(int[] nums, int target) {
        Arrays.sort(nums);  // nums = [1,2,2,3,5] for your example

        List<Integer> result = new ArrayList<>();
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
                found = true;
            } else if (found && nums[i] > target) {
                // We already started seeing target, and now numbers are bigger,
                // so we can stop early.
                break;
            }
        }

        // If you want an empty list when no match, just return `result`.
        // It will already be empty if nothing was found.
        return result;
    }

    public static void main(String[] arg){
       int[] nums = {1,2,5,2,3};
       int target = 2;
        FindTargetIndicesAfterSorting obj = new FindTargetIndicesAfterSorting();
        obj.targetIndices(nums,target);
    }
}
