package leetcode;

import java.util.Arrays;
//Prakash solved it

// https://leetcode.com/problems/merge-sorted-array/description/?envType=problem-list-v2&envId=array
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] arg){
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;

        MergeSortedArray mer=new MergeSortedArray();
        mer.merge(nums1,m,nums2,n);

    }

}
