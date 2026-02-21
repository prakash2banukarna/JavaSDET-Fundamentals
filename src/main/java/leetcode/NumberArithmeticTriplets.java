package leetcode;
// prakash solved it
// https://leetcode.com/problems/number-of-arithmetic-triplets/description/
public class NumberArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
//nums = [0,1,4,6,7,10], diff = 3

        int myOutput=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=j;k<nums.length;k++){
                    if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff){
                        myOutput++;
                    }
                }
            }
        }

        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        NumberArithmeticTriplets obj = new NumberArithmeticTriplets();
        obj.arithmeticTriplets(nums,diff);
    }
}
