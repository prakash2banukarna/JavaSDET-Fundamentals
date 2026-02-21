package leetcode;

import java.util.Arrays;
// Prakash solved it
// https://leetcode.com/problems/concatenation-of-array/description/
public class ConcatenationArray {
    public int[] getConcatenation(int[] nums) {
//int[] nums = {1,2,1};
        int[] myOutput=new int[nums.length*2];
        int len=nums.length;

        for(int i=0;i<myOutput.length;i++){
            if(i<nums.length){
                myOutput[i]=nums[i];
            }
            else{
                /*
                 here index(i) = 3 , len = 3 , so i-len=>0
                 index(i) = 4 , len = 3 , so 4-3=>1
                 */
                myOutput[i]=nums[i-len];
            }
        }

        System.out.println(Arrays.toString(myOutput));
        return myOutput;

    }

    public static void main(String[] arg){
        int[] nums = {1,2,1};
        ConcatenationArray obj = new ConcatenationArray();
        obj.getConcatenation(nums);

    }
}
