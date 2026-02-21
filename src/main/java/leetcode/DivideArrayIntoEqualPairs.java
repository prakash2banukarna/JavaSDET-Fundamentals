package leetcode;

import java.util.HashMap;
import java.util.Map;
// Prakash solved it
// https://leetcode.com/problems/divide-array-into-equal-pairs/description/

/*
1) Create a HashMap and key as int and value as count
2) if the value is not even number , then false or true.

 */
public class DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {
//int[] nums = [3,2,3,2,2,2];
        Map<Integer,Integer> numCount=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int count = numCount.getOrDefault(nums[i],0);
            numCount.put(nums[i],count+1);
        }

        for(Map.Entry<Integer,Integer> keyValue:numCount.entrySet()){
            if(keyValue.getValue()%2!=0){
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;

    }

    public static void main(String[] arg){
//        int[] nums = {3,2,3,2,2,2};
        int[] nums = {1,2,3,4};
        DivideArrayIntoEqualPairs obj = new DivideArrayIntoEqualPairs();
        obj.divideArray(nums);
    }
}
