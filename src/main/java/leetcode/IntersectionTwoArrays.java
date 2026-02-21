package leetcode;

import java.util.*;
import java.util.stream.Collectors;
// Prakash solved it
// https://leetcode.com/problems/intersection-of-two-arrays/description/?envType=problem-list-v2&envId=array

public class IntersectionTwoArrays {

    public int[] intersection_Solution1(int[] nums1, int[] nums2) {

        Set<Integer> mySet=new HashSet(); //Step 1: Fetching the unique values from nums2
        for(int x:nums2){
            mySet.add(x);
        }

        Set<Integer> interactionSet= new HashSet<>();
        for(int i=0;i<nums1.length;i++){ //Step 2: Check if mySet values are present in  nums1 (i.e intersection)
            if(mySet.contains(nums1[i])){
                interactionSet.add(nums1[i]);
            }
        }

        int[] myOutput =new int[interactionSet.size()]; // Step 3: convert the interaction values to arrays

        int i=0;
        for(int l:interactionSet){
            myOutput[i]=l;
            i++;
        }

        System.out.println(Arrays.toString(myOutput));
        return myOutput;
    }

    public static void main(String[] arg){
        int[] nums1 ={1,2,2,1};
        int[] nums2 ={2,2};
        IntersectionTwoArrays obj=new IntersectionTwoArrays();
        obj.intersection_Solution1(nums1,nums2);


    }
}
