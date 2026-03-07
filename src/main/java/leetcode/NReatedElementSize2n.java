package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Prakash solved it
// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/description/?envType=problem-list-v2&envId=array

public class NReatedElementSize2n {
    public int repeatedNTimes(int[] nums) {

        List<Integer> num=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(!num.contains(nums[i])){
                num.add(nums[i]);
            }
            else{
                System.out.println(nums[i]);
                return nums[i];
            }
        }

        return 1; //dummy return
    }

    public static void main(String[] arg){
        int[] nums = {1,1,2,3};
        NReatedElementSize2n obj = new NReatedElementSize2n();
        obj.repeatedNTimes(nums);
    }
}
