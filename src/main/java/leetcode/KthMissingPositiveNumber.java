package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// prakash solved it
// https://leetcode.com/problems/kth-distinct-string-in-an-array/description/

/*
Step 1 : Iterate from index 1 to last value i.e  myLst.size() + 1 + k
 */
public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
//arr = [2,3,4,7,11], k = 5

        List<Integer> myLst =   Arrays.stream(arr).boxed().toList();

        int missingCount=0;
        int kthMissingNum=-1;

        for(int i=1;i<myLst.size() + 1 + k ;i++){ // Note: its myLst.size() + 1 + k : so you iterate present and missing numbers
            if(!myLst.contains(i) && missingCount<k){ // Adding "&& missingCount<k" condition so that once we find the missing num, we break
                missingCount++;
                kthMissingNum=i;

            }
            else if(missingCount==k){
                System.out.println(kthMissingNum);
                return kthMissingNum;
            }
        }


        return kthMissingNum;
    }

    public static void main(String[] arg){
//        int[] arr = {2,3,4,7,11};
//        int k = 5;
        int[] arr = {1,2,3,4};
        int k = 2;
        KthMissingPositiveNumber obj = new KthMissingPositiveNumber();
        obj.findKthPositive(arr,k);
    }
}
