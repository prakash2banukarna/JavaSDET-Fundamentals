package leetcode;

import java.util.Arrays;
// prakash solved it
// https://leetcode.com/problems/neither-minimum-nor-maximum/description/
public class NeitherMinNorMax {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length>2){
            System.out.println(nums[nums.length/2]);
            return nums[nums.length/2];
        }

        return -1;
    }

    public static void main(String[] arg){
        int[] nums={3,2,1,4};
        NeitherMinNorMax obj=new NeitherMinNorMax();
        obj.findNonMinOrMax(nums);
    }


}
