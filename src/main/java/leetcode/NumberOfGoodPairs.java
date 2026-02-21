package leetcode;

import java.util.HashMap;
import java.util.Map;

//Prakash solve it
// https://leetcode.com/problems/number-of-good-pairs/description/
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
//nums = [1,2,3,1,1,3]
        int output=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] ){
                    output++;
                }
            }
        }
        System.out.println(output);
        return output;
    }



    public static void main(String[] arg){
        int[] nums = {1,2,3,1,1,3};
        NumberOfGoodPairs obj= new NumberOfGoodPairs();
        obj.numIdenticalPairs(nums);

    }
}
