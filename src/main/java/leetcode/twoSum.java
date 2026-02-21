package leetcode;

//https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=array

public class twoSum {

    public int[] sumNumbers(int[] nums,int target){

        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("Here is the answer" +i +j);
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] arg){
        int[] nums = {3,2,4};
        int target=6;

        twoSum ts=new twoSum();
        ts.sumNumbers(nums,target);
    }
}
