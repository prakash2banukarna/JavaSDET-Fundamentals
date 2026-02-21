package leetcode;

import java.util.Arrays;
//Prakash solved it
// https://leetcode.com/problems/move-zeroes/description/?envType=problem-list-v2&envId=array
public class MoveZeroes {

    public static void main(String[] arg){
        int[] nums={1,0,1,0,3,12};

        int zeroPosition=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){ // if its not equal to zero , then replace it with non-zero position
                int temp =  nums[zeroPosition]; // This step is needed to store the original value ,
                nums[zeroPosition]=nums[i];
                nums[i]=temp;
                zeroPosition++; //storing zero position , so everytime we swap this position with non-zero
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
