package leetcode;
// Prakash solved it
// https://leetcode.com/problems/smallest-index-with-equal-value/description/
public class SmallestIndexEqualValue {
    public int smallestEqual(int[] nums) {
//int[] nums = {0,1,2};
        int output=-1;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                System.out.println(i);
                return i;
            }
        }
        return output;
     }

     public static void main(String[] arg){
         int[] nums = {4,3,2,1};
         SmallestIndexEqualValue obj = new SmallestIndexEqualValue();
         obj.smallestEqual(nums);
     }
}
