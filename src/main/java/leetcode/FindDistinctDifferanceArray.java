package leetcode;

import java.util.*;
// Prakash solved it
// https://leetcode.com/problems/find-the-distinct-difference-array/description/
public class FindDistinctDifferanceArray {
    public int[] distinctDifferenceArray(int[] nums) {
//nums = [1,2,3,4,5]
        int len=nums.length;
        int[] myOutput=new int[len];


        for(int n=0;n< nums.length;n++){ // For each idex, find the distinct prefic and distictn suffic

            // ----- Calculate suffix distinct count -----
            // Start from the element after current index (n+1) until the end of array
            Set suffic = new HashSet();
            for(int i=n;i<len-1;i++){
                suffic.add(nums[i+1]);  // nums = [1,2,3,4,5] for i=0, we should find the distinct between nums = [2,3,4,5]
                // Add all elements from (n+1) to end into the suffix set
            }

            // ----- Calculate prefix distinct count -----
            // Start from beginning (0) till current index n (inclusive)
            Set prefix = new HashSet();
            for(int j=0;j<=n;j++){  // nums = [1,2,3,4,5] for j=0, we should find the distinct between nums = [1]
                prefix.add(nums[j]);
            }
            myOutput[n]=prefix.size()-suffic.size();
        }

        System.out.println(Arrays.toString(myOutput));
        return myOutput;

    }

    public static void main(String[] arg){
        int[] nums = {3,2,3,4,2};
        FindDistinctDifferanceArray obj = new FindDistinctDifferanceArray();
        obj.distinctDifferenceArray(nums);
    }
}
