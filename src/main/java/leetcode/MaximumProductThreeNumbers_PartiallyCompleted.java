package leetcode;

public class MaximumProductThreeNumbers_PartiallyCompleted {
    public int maximumProduct(int[] nums) {
// nums = [1,2,3,4]
        int firstMax = 0;
        int secoundMax =0;
        int thridMax =0;

        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])>=Math.abs(firstMax)){
                thridMax=secoundMax;
                secoundMax=firstMax;
                firstMax=nums[i];
            }
            else if(Math.abs(nums[i])>=Math.abs(secoundMax)){
                thridMax=secoundMax;
                secoundMax=nums[i];
            }
            else if(Math.abs(nums[i])>=Math.abs(thridMax)){
                thridMax=nums[i];
            }
        }
        System.out.println(firstMax * secoundMax * thridMax);
        return firstMax * secoundMax * thridMax;
    }

    public static void main(String[] arg){
//       int[] nums = {1,2,3,4};
        int[] nums = {-1,-2,-3};
//        int[] nums = {-100,-98,-1,2,3,4};
        MaximumProductThreeNumbers_PartiallyCompleted obj = new MaximumProductThreeNumbers_PartiallyCompleted();
        obj.maximumProduct(nums);
    }
}
