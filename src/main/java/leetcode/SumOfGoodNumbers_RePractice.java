package leetcode;
// Prakash solved it
// https://leetcode.com/problems/sum-of-good-numbers/description/

/*
If both (i-k) and (i+k) indices are valid and if the ith element is strictly greater, then the ith element is good.

If any one of the indices (i-k) or (i+k) is valid and if the ith element is strictly greater, then the ith element is good.

If both the indices (i-k) and (i+k) are invalid, then also the ith element is good.

ind1<0 && ind1 >= nums.length : Ind1 doesn't exist
 */
public class SumOfGoodNumbers_RePractice {
    public int sumOfGoodNumbers(int[] nums, int k) {
// nums = [1,3,2,1,5,4], k = 2
        int count=0;
        for(int i=0;i<nums.length;i++){
            //Note: (i-k) and  (i+k) index should be present, otherwise, nums[i] is good number
            int ind1=i-k;
            int ind2=i+k;
            if(ind1 > nums.length && ind2 > nums.length ){ // both index doesn't exist
                count=count + nums[i];
            }
            else if(ind1>=0 && ind1 < nums.length && nums[i]>nums[ind1] && (ind2<0 || ind2 >= nums.length) ){ // Either one(ind1) index exist and strictly greater and another doesn't exist
                count=count + nums[i];
            }
            else if(ind2>=0 && ind2 < nums.length && nums[i]>nums[ind2] && (ind1<0 || ind1 >= nums.length) ){ // Either one(ind2) index exist and strictly greater and another doesn't exist
                count=count + nums[i];
            }
            else if(ind1 >=0 && ind2>=0 && ind1 < nums.length && ind2 < nums.length){ // both  index exist
                if(nums[i]>nums[ind1] && nums[i]>nums[ind2]){ // strictly greater
                    count=count + nums[i];
                }

            }
        }

        System.out.println(count);
        return count;
    }

    public static void main(String[] arg){
        int[] nums = {1,3,2,1,5,4};
        int k = 2;
        SumOfGoodNumbers_RePractice obj =new SumOfGoodNumbers_RePractice();
        obj.sumOfGoodNumbers(nums,k);
    }
}
