package leetcode;

import java.util.Arrays;

//Prakash solved it
//https://leetcode.com/problems/squares-of-a-sorted-array/description/

public class SquaresSorted {
    public int[] sortedSquares(int[] nums) {


        int[] myOutput=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;

        while(left<=right){ // instead of for loop, use while loop
            if(Math.abs(nums[right])>Math.abs(nums[left])){
                myOutput[index]=nums[right]*nums[right];
                right--;
                index--;
            }
            else{
                myOutput[index]=nums[left]*nums[left];
                left++;
                index--;
            }
        }
        System.out.println(Arrays.toString(myOutput));
        return myOutput;


    }

    public static void main(String[] arg){
        int[] nums={-4,-1,0,3,10};
        SquaresSorted obj= new SquaresSorted();
        obj.sortedSquares(nums);
    }

}
