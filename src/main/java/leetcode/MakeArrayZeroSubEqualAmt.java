package leetcode;
// Prakash solved it
// https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/description/?envType=problem-list-v2&envId=array

import java.util.Arrays;

/* How this problem is solved
Step 1: Sort the array
Sorting groups zeros to the front and orders non-zero values smallest → largest, so we can process them in increasing order.

Step 2: Find the smallest non-zero element
Scan from nonZeroIndex forward to skip already-zeroed elements. The first non-zero value found is our subtraction target (temp).

Step 3: Count this as one operation
Increment myOutput — subtracting temp from all non-zero elements costs 1 operation.

Step 4: Subtract temp from all remaining elements
Every element from nonZeroIndex onward gets reduced by temp. Elements equal to temp become 0; larger ones shrink.

Step 5: Repeat until all zeros
Loop back to Step 1. Each iteration handles one "unique value level." The loop ends when no non-zero elements remain.
 */
public class MakeArrayZeroSubEqualAmt {
    public int minimumOperations(int[] nums) {
// nums = [1,5,0,3,5]


        boolean nonZero=true;
        int nonZeroIndex=0;

        int temp=-1;
        int myOutput=0;
        while(nonZero){
            nonZero=false;
            Arrays.sort(nums);
            for(int i=nonZeroIndex;i<nums.length;i++){
                if(nums[i]>0){
                    temp=nums[i];
                    nonZeroIndex=i;
                    nonZero=true;
                    myOutput++;
                    break;
                }
            }

            for(int j=nonZeroIndex;j<nums.length;j++){
                nums[j]=nums[j]-temp;
            }
        }
        System.out.println("MyOutput " +myOutput);
        return myOutput;

    }

    public static void main(String[] arg){
        int[] nums = {1,5,0,3,5};
        MakeArrayZeroSubEqualAmt obj= new MakeArrayZeroSubEqualAmt();
        obj.minimumOperations(nums);
    }
}
