package leetcode;
// Prakash solved it
// https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/?envType=problem-list-v2&envId=array

public class LongestContiInc {
    public int findLengthOfLCIS(int[] nums) {

        int output=1;
        int temp=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                temp++;
                output=Math.max(temp,output);
            }
            else{
                temp=1;
            }
        }
        System.out.println(output);
        return output;
    }

    public static void main(String[] arg){
        int[] nums = {1,3,5,4,2,3,4,5};
        LongestContiInc obj= new LongestContiInc();
        obj.findLengthOfLCIS(nums);

    }
}
