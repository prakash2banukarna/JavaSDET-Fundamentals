package leetcode;

import java.util.Arrays;

// Prakash solved it
// https://leetcode.com/problems/single-number/description/
public class SingleNumber {


    public int singleNumber(int[] nums) {
        //int[] nums ={2,2,1};
        Arrays.sort(nums);

        int myoutput=nums[nums.length-1]; //It takes last value and it also helps to works for input nums ={4,1,2,1,2} (ie. output is last value in array
        for(int i=0;i<nums.length-1;i+=2){ //It should be length -1 ,since you are doing ,i=0 and i+1
            if(nums[i]!=nums[i+1]){
                myoutput=nums[i];
                System.out.println(myoutput);
                return myoutput;
            }
        }
        System.out.println(myoutput);
        return myoutput;

    }

    public static void main(String[] a){
//        int[] nums ={2,2,1};
        int[] nums ={4,1,2,1,2};
        SingleNumber obj= new SingleNumber();
        obj.singleNumber(nums);
    }
}
