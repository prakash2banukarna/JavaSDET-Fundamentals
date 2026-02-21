package leetcode.Operators_Example;

// Prakash solved it
// https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/description/


public class CountEqualDiviPairs {
    public int countPairs(int[] nums, int k) {
//nums = [3,1,2,2,2,1,3], k = 2

        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j] && (i * j)%k==0){
                    count++;
                }
            }
        }

        System.out.println(count);
        return count;
    }

    public static void main(String[] arg){
//        int[] nums = {3,1,2,2,2,1,3};
        int[] nums = {5,5,9,2,5,5,9,2,2,5,5,6,2,2,5,2,5,4,3};
        int k = 7;
        CountEqualDiviPairs obj = new CountEqualDiviPairs();
        obj.countPairs(nums,k);
    }
}
