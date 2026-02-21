package leetcode;
//Prakash sovled it
// https://leetcode.com/problems/monotonic-array/description/

/* Problem solving steps summary
https://www.perplexity.ai/search/problem-solving-steps-summary-.alaBRGuTGahktgCI59xNA

Problem Understanding
The goal is to determine whether a given array is monotonic —
that is, entirely non-decreasing (each element is less than or equal to the next) or entirely non-increasing (each element is greater than or equal to the next).

Example:

[1, 2, 2, 3] → Monotonic increasing
[6, 5, 4, 4] → Monotonic decreasing
[1, 3, 2] → Not monotonic

Step-by-Step Logic Explanation
Step 1: Identify the Trend (increasing or decreasing)
Start looping through the array using a while loop.
Compare nums[ind] and nums[ind + 1].

If nums[ind] < nums[ind + 1], mark the trend as increasing.

If nums[ind] > nums[ind + 1], mark the trend as decreasing.

Keep moving ahead until you find the first unequal pair (ignore equal elements, as they don’t affect the trend).
At the end of this step, you know whether the array should be checked for increasing or decreasing order.

Example:
For [1, 2, 2, 3], the first unequal pair is (1, 2) → increasing sequence.

Step 2: Verify the Trend Across the Entire Array
Now that you know the expected pattern, use a for loop starting from the identified index to check every subsequent pair.
If the array was found to be increasing, ensure no pair violates this (i.e., there should be no nums[j] > nums[j+1]).
If the array was decreasing, ensure no pair violates that (no nums[j] < nums[j+1]).
If any violation is found, return false immediately.

Step 3: Return the Final Result

If the entire loop completes without finding a mismatch, return true, meaning the array is monotonic.

Example Walkthrough
Array: [1, 2, 2, 3]

Step 1 finds it’s increasing (1 < 2).
Step 2 checks all pairs — no violations found.
Final result → true.

This step-by-step breakdown helps readers understand why you use two loops — one to detect the pattern and another to validate it.
 */
public class MonotonicArray_RePractice {
    public boolean isMonotonic(int[] nums) {
//nums = [1,2,2,3]

        boolean monoInc=false;
        int ind=0;
        while(ind+1<nums.length){ //finidng if it is inc or dec
            if(nums[ind] < nums[ind+1]){
                monoInc=false;
                ind++;
                break;
            }
            else if(nums[ind] > nums[ind+1]){
                monoInc=true;
                ind++;
                break;
            }
            else{
                ind++;
            }
        }
        System.out.println(" myoutput " +monoInc +"-" +ind);

        for(int j=ind;j<nums.length-1;j++){
            if(monoInc==false){
                if(nums[j] > nums[j+1]){
                    System.out.println(false);
                    return false;
                }
            }
            else{
                if(nums[j] < nums[j+1]){
                    System.out.println(false);
                    return false;
                }
            }
        }
        System.out.println(true);
        return true;


    }

    public static void main(String[] arg){
//        int[] nums = {1,3,2};
        int[] nums = {1,1,1};
        MonotonicArray_RePractice obj = new MonotonicArray_RePractice();
        obj.isMonotonic(nums);
    }
}
