package leetcode;

import java.util.HashMap;
import java.util.Map;
// prakash solved it
// https://leetcode.com/problems/sum-of-unique-elements/description/

public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
//
        int myOutput=0;

        Map<Integer,Integer> myCount=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int count=myCount.getOrDefault(nums[i],0);
            myCount.put(nums[i],count+1);
        }

        for(Map.Entry<Integer,Integer> keyValue:myCount.entrySet()){
            if(keyValue.getValue()==1){
                myOutput=myOutput + keyValue.getKey(); //Basically if the integer occured only once, then adding it.
            }
        }

        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        int[] nums = {1,2,3,2};
        SumOfUniqueElements obj =new SumOfUniqueElements();
        obj.sumOfUnique(nums);
    }
}
