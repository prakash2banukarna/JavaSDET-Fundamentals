package leetcode;

import java.util.Arrays;
//https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/
// REFER -> https://www.perplexity.ai/search/euclidean-algorithm-in-java-UXtdoKmCSV6MnY1g4HCJfg
public class FindGreatestCD_Practice {


    public int findGCD(int[] nums) {
        Arrays.sort(nums);

        int largest=nums[nums.length-1]; //a
        int small=nums[0]; //b

        while(small!=0){
            int temp =small;
            small=largest%small; //This gives the remainder
            largest=temp;

            /*
            iteration 1 : (a,b)
            then (old b,remainder)
             */

        }
        System.out.println(largest);
        return largest;
    }

    public static void main(String[] arg){
//        int[] nums = {2,5,6,9,10};
//        int[] nums={7,5,6,8,3};
        int[] nums = {6,7,9};
        FindGreatestCD_Practice obj=new FindGreatestCD_Practice();
        obj.findGCD(nums);

    }

}
