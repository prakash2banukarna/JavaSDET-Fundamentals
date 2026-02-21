package leetcode;

import java.util.Arrays;
//Prakash solved it
//https://leetcode.com/problems/missing-number/description/?envType=problem-list-v2&envId=array
public class MissingNumber {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=i){
                System.out.println(i);
                return i;
            }
        }
        System.out.println(nums.length);
        return nums.length;
    }

    public static void main(String[] arg){
        int[] nums={3,0,1};
        int[] nums2={0,1}; //another input
        MissingNumber obj=new MissingNumber();
        obj.solution(nums2);

    }
}
