package leetcode;

import java.util.Arrays;
//prakash solved it

//https://leetcode.com/problems/contains-duplicate/description/?envType=problem-list-v2&envId=array
public class ContainsDuplicate {

    public boolean dup(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] arg){
        int[] nums={1,2,3,1};
        ContainsDuplicate conDup=new ContainsDuplicate();
        conDup.dup(nums);

    }
}
