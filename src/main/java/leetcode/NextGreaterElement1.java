package leetcode;

import java.util.Arrays;
// prakash solved it
// https://leetcode.com/problems/next-greater-element-i/description/?envType=problem-list-v2&envId=hash-table

/*
 * PROBLEM: Next Greater Element I
 * Given nums1 (subset of nums2), find the next greater element in nums2
 * for each element in nums1. Return -1 if no greater element exists.
 *
 * APPROACH: Brute Force (Nested Loop)
 *
 * STEP 1: Loop through each element in nums1
 *         → Find its position (index) in nums2 using a nested loop
 *         → This is our "starting point" to search for a greater element
 *
 * STEP 2: From that found index in nums2, scan RIGHT using a while loop
 *         → Default answer is -1 (set before scanning)
 *         → If we find nums2[tempInd] > nums1[i], update answer and BREAK
 *         → If nothing greater is found, -1 stays as the answer
 *
 * EXAMPLE TRACE:
 *   nums1 = [4, 1, 2], nums2 = [1, 3, 4, 2]
 *
 *   i=0, nums1[0]=4 → found at index 2 in nums2
 *         scan right from index 2: [4, 2] → nothing > 4 → output[0] = -1
 *
 *   i=1, nums1[1]=1 → found at index 0 in nums2
 *         scan right from index 0: [1, 3] → 3 > 1 → output[1] = 3
 *
 *   i=2, nums1[2]=2 → found at index 3 in nums2
 *         scan right from index 3: [2] → nothing > 2 → output[2] = -1
 *
 *   Final Output: [-1, 3, -1]
 *
 * TIME COMPLEXITY:  O(n * m) — n = nums1 length, m = nums2 length
 * SPACE COMPLEXITY: O(n)     — output array of nums1 size
 */
public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//nums1 = [4,1,2], nums2 = [1,3,4,2]

        int[] myOutput=new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int tempInd = j ;
                    myOutput[i]=-1; // It first adds as -1 and if greater value found, it updates the greater value, if not, it stays with -1

                    while(tempInd < nums2.length){
                        if(nums2[tempInd]>nums1[i]){
                            myOutput[i]=nums2[tempInd];
                            break;
                        }
                        else{
                            tempInd++;
                        }
                    }

                }
            }
        }

        System.out.println(Arrays.toString(myOutput));
        return myOutput;
    }

    public static void main(String[] arg){
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        NextGreaterElement1 obj =new NextGreaterElement1();
        obj.nextGreaterElement(nums1,nums2);
    }
}
