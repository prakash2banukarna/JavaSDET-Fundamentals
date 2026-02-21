package leetcode;

import java.util.*;
// prakash solved it - Time exceeded
//https://leetcode.com/problems/3sum/description/?envType=problem-list-v2&envId=array
public class Sum3_TIME_Exceeded {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> myOutput = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int z=j+1;z<nums.length;z++){
                    if(nums[i]+nums[j]+nums[z]==0){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[z]);
                        Collections.sort(temp); //sort
                        if(!myOutput.contains(temp)){ // if not present , then add
                            myOutput.add(temp);
                        }

                    }
                }
            }
        }

        System.out.println(myOutput);
        return myOutput;

    }

    public static void main(String[] arg){
        int[] nums = {-1,0,1,2,-1,-4};
        Sum3_TIME_Exceeded obj= new Sum3_TIME_Exceeded();
        obj.threeSum(nums);
    }
}
