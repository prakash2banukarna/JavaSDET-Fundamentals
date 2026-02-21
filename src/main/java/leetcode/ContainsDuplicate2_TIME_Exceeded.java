package leetcode;

import java.util.HashSet;
import java.util.Set;

//Prakash solved it - Time exceed
//https://leetcode.com/problems/contains-duplicate-ii/description/?envType=problem-list-v2&envId=array
public class ContainsDuplicate2_TIME_Exceeded {



    public boolean containsNearbyDuplicate_TimeExceeded(int[] nums, int k) {
        boolean myOutput=false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[j]==nums[i] && j-i <= k){
                    myOutput=true;
                    break;
                }
            }
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
//       int[] nums = {1,2,3,1};
        int[] nums = {1,2,3,1,2,3};
       int k = 2;
        ContainsDuplicate2_TIME_Exceeded obj = new ContainsDuplicate2_TIME_Exceeded();
//        obj.containsNearbyDuplicate_TimeExceeded(nums,k);


    }
}
