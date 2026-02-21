package leetcode;
// Prakash solved it
// https://leetcode.com/problems/max-consecutive-ones/description/?envType=problem-list-v2&envId=array
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int ones=0;
        int maxOnes=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1 ){
                ones++;
                maxOnes = Math.max(ones, maxOnes); //Retain the max output
                System.out.println(i +" "+ maxOnes);
            }
            else{
                ones=0;
            }
        }
        return maxOnes;
    }

    public static void main(String[] arg){
//        int[] nums = {1,1,0,1,1,1};
        int[] nums = {1,0,1,1,0,1};
        MaxConsecutiveOnes obj= new MaxConsecutiveOnes();
        obj.findMaxConsecutiveOnes(nums);
    }


}
