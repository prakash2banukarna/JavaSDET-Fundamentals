package leetcode;
// Prakash solved it
// https://leetcode.com/problems/compute-alternating-sum/description/

public class ComputeAlternatingSum {
    public int alternatingSum(int[] nums) {
//nums = [1,3,5,7]
        int myOutput=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                myOutput=myOutput+nums[i];
            }
            else{
                myOutput=myOutput-nums[i];
            }
        }

        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        int[] nums = {1,3,5,7};
        ComputeAlternatingSum obj =new ComputeAlternatingSum();
        obj.alternatingSum(nums);
    }
}
