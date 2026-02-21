package leetcode;

import java.util.Arrays;
//prakash solved it
// https://leetcode.com/problems/sort-array-by-parity/description/
public class SortArrayParity {
    public int[] sortArrayByParity(int[] nums) {
//int[] nums = {2,3,1,2,4,5,6}


        int[] myOutput=new int[nums.length];

        int left =0;
        int right =nums.length-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                myOutput[left]=nums[i];
                left++;
            }
            else{
                myOutput[right]=nums[i];
                right--;
            }
        }
        System.out.println(Arrays.toString(myOutput));
        return myOutput;
    }

    public static void main(String[] a){
        int[] nums = {2,3,1,2,4,5,6};
        SortArrayParity obj=new SortArrayParity();
        obj.sortArrayByParity(nums);
    }


}
