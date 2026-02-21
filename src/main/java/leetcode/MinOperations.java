package leetcode;
//Prakash solved it

// https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/description/?envType=problem-list-v2&envId=array
public class MinOperations {

    public int minOperations(int[] nums, int k) {

        int sumOfArray=0;

        for(int x:nums){
            sumOfArray=sumOfArray+x;
        }
        int output=sumOfArray % k;
        System.out.println(output);
        return sumOfArray % k;


    }

    public static void main(String[] arg){
        int[] nums = {3,9,7};
        int k = 5;
        MinOperations obj =new MinOperations();
        obj.minOperations(nums,k);

    }



}
