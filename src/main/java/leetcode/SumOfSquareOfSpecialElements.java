package leetcode;
// prakash solved it
// https://leetcode.com/problems/sum-of-squares-of-special-elements/description/

/*
How this problem is solved:
Step 1: Get the length of the array (n).
Step 2: Iterate through each element using a 1-indexed position (i+1).
Step 3: Check if the element is "special" — meaning its 1-based index (i+1)
        evenly divides n (i.e., n % (i+1) == 0).
Step 4: If special, square the element and add it to the running total.
Step 5: Return the total sum of squares of all special elements.
*/

public class SumOfSquareOfSpecialElements {
    public int sumOfSquares(int[] nums) {
        int myOutput=0;
        int len=nums.length;

        for(int i=0;i<len;i++){ // 1-indexed integer array
            if(len % (i+1) ==0){
                myOutput = myOutput + (nums[i] * nums[i]);
            }
        }

        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        int[] nums = {2,7,1,19,18,3};
        SumOfSquareOfSpecialElements obj=new SumOfSquareOfSpecialElements();
        obj.sumOfSquares(nums);
    }
}
