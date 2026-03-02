package leetcode;
// Prakash solved it
// https://leetcode.com/problems/find-the-number-of-good-pairs-i/description/?envType=problem-list-v2&envId=hash-table


public class FindNumOfGoodPairs2_TimeExceeded {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
// nums1 = [1,2,4,12], nums2 = [2,4], k = 3

        long count=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] % (nums2[j] * k)==0){
                    count++;
                }
            }
        }

        System.out.println(count);
        return count;

    }

    public static void main(String[] arg){
        int[] nums1 = {1,2,4,12};
        int[] nums2 = {2,4};
        int k = 3;
        FindNumOfGoodPairs2_TimeExceeded obj = new FindNumOfGoodPairs2_TimeExceeded();
        obj.numberOfPairs(nums1,nums2,k);
    }
}
