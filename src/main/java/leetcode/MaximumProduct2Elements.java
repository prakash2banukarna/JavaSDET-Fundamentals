package leetcode;
// Prakash solved it
// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/

/*
Find the firstMax and secoundMax value
 */
public class MaximumProduct2Elements {
    public int maxProduct(int[] nums) {
// nums = [3,4,5,2]
        int firstMax=0;
        int secoundMax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=firstMax){
                secoundMax=firstMax;
                firstMax=nums[i];
            }
            else if(nums[i]>=secoundMax){
                secoundMax=nums[i];
            }
        }

        System.out.println((firstMax-1) * (secoundMax-1));
        return (firstMax-1) * (secoundMax-1);
    }

    public static void main(String[] arg){
        int[] nums = {3,4,5,2};
        MaximumProduct2Elements obj = new MaximumProduct2Elements();
        obj.maxProduct(nums);
    }
}
