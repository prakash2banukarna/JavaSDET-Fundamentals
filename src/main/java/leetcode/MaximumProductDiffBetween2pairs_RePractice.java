package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Prakash solved it
// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/description/?source=submission-noac

// Try this solution -> https://leetcode.com/problems/maximum-product-difference-between-two-pairs/solutions/4418493/beats-100-explained-with-video-largest-a-ex1t/?source=submission-noac

/*
Basically you have to find max two number and min value of two numbers
Then (maxValue 1 * maxValue 2) - (MinValue 1 * MinValue2)
 */
public class MaximumProductDiffBetween2pairs_RePractice {
    public int maxProductDifference(int[] nums) {
// nums = [4,2,5,9,7,4,8]


        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
                lst.add(nums[i]);
        }

        lst.sort(Collections.reverseOrder());

        int myOutput= (lst.get(0) * lst.get(1)) - (lst.get(lst.size()-1) * lst.get(lst.size()-2));

        return myOutput;

    }

    public static void main(String[] arg){
//        int[] nums = {4,2,5,9,7,4,8};
//        int[] nums = {10,10,10,10};
        int[] nums={2,9,5,9,1};
        MaximumProductDiffBetween2pairs_RePractice obj =new MaximumProductDiffBetween2pairs_RePractice();
        obj.maxProductDifference(nums);
    }
}
