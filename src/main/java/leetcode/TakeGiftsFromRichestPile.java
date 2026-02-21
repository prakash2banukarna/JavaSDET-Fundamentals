package leetcode;

import java.util.Arrays;
// Prakash solved it
// https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/
/*
How this problem is solved
Step 1: Sort the array and pick the last index value (i.e max value ) and fetch the square  root value
Step 2: repeat the above step for k times
Step 3: Once the above steps are completed, sum all the values of array
 */

/*
Step-by-Step Explanation
1. Sort the array
    * Sorting ensures the largest pile is always at the end of the array (gifts[gifts.length - 1]).
2. Pick and reduce k times
    * For each iteration:
        * Take the largest value (last element after sorting).
        * Replace it with its square root (using Math.sqrt() and cast to int to drop decimals).
        * Repeat this step k times.
3. Sum up all piles
    * After all reductions, sort again (optional for correctness) and add up all elements.
 */
public class TakeGiftsFromRichestPile {
    public long pickGifts(int[] gifts, int k) {

        int reduce=0;
        while(reduce<k){
            Arrays.sort(gifts);
            int lastInd=gifts.length-1;

            double d=Math.sqrt(gifts[lastInd]);
            gifts[lastInd] = (int) d;

            System.out.println(gifts[lastInd]);
            reduce++;
        }
        Arrays.sort(gifts);
        long myOutput=0;
        for(int i= 0;i<gifts.length;i++){
            myOutput=myOutput+gifts[i];
        }

        System.out.println(myOutput);
        return myOutput;

    }

    public static void main(String[] arg){
        int[] gifts = {25,64,9,4,100};
        int k = 4;
        TakeGiftsFromRichestPile obj= new TakeGiftsFromRichestPile();
        obj.pickGifts(gifts,k);
    }
}
