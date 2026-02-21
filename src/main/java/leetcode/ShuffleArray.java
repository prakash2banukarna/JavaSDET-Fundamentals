package leetcode;

import java.util.Arrays;
//Prakash solved it
//https://leetcode.com/problems/shuffle-the-array/description/
public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
//nums = [2,5,1,3,4,7], n = 3
        int[] myOutput=new int[n*2];
        int z=0;
        for(int i=0,j=n ; i<n && j<n*2; i+=1,j+=1){
            myOutput[z]=nums[i];
            myOutput[z+1]=nums[j];
            z+=2;
        }
        System.out.println(Arrays.toString(myOutput));

        return myOutput;

    }

    public static void main(String[] arg){
       int[] nums = {2,5,1,3,4,7};
       int n = 3;
        ShuffleArray obj=new ShuffleArray();
        obj.shuffle(nums,n);
    }
}
