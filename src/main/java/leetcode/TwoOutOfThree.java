package leetcode;
//Prakash solved it
//https://leetcode.com/problems/two-out-of-three/description/

/*
 Solution: twoOutOfThree

 Step 1: Convert the three arrays into sets to extract unique values.
 Step 2: Find numbers that appear in at least two of the three sets
         (check intersections between set1 & set2, set1 & set3, and set2 & set3).
 Step 3: Collect all such numbers into a list — this list is the final output.
 */

import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoOutOfThree {
    public List<Integer> twoOutOfThree_withInbuild(int[] nums1, int[] nums2, int[] nums3) {
//nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]

        Set<Integer> numsSet1=new HashSet<>();
        Set<Integer> numsSet2=new HashSet<>();
        Set<Integer> numsSet3=new HashSet<>();

        for(int x:nums1){
            numsSet1.add(x);
        }
        for(int x:nums2){
            numsSet2.add(x);
        }
        for(int x:nums3){
            numsSet3.add(x);
        }


        Set<Integer> intersection1 = Sets.intersection(numsSet1, numsSet2);
        Set<Integer> intersection2 = Sets.intersection(numsSet1, numsSet3);
        Set<Integer> intersection3 = Sets.intersection(numsSet2, numsSet3);

        List<Integer> myoutput = new ArrayList<>();

        for(int x:intersection1){
            if(!myoutput.contains(x)) {
                myoutput.add(x);
            }
        }

        for(int x:intersection2){
            if(!myoutput.contains(x)) {
                myoutput.add(x);
            }
        }

        for(int x:intersection3){
            if(!myoutput.contains(x)) {
                myoutput.add(x);
            }
        }

        System.out.println(myoutput);
        return myoutput;

    }
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
//nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]

        Set<Integer> numsSet1=new HashSet<>();
        Set<Integer> numsSet2=new HashSet<>();
        Set<Integer> numsSet3=new HashSet<>();

        for(int x:nums1){
            numsSet1.add(x);
        }
        for(int x:nums2){
            numsSet2.add(x);
        }
        for(int x:nums3){
            numsSet3.add(x);
        }



        List<Integer> myoutput = new ArrayList<>();

        for(int x:numsSet1){
            if(numsSet2.contains(x) || numsSet3.contains(x)){
                if(!myoutput.contains(x)){
                    myoutput.add(x);
                }
            }
        }

        for(int x:numsSet2){
            if(numsSet3.contains(x)){
                if(!myoutput.contains(x)){
                    myoutput.add(x);
                }
            }
        }


        System.out.println(myoutput);
        return myoutput;

    }

    public static void main(String[] arg){
        int[] nums1 = {3,1};
        int[] nums2 = {2,3};
        int[] nums3 = {1,2};

        TwoOutOfThree obj =new TwoOutOfThree();
//        obj.twoOutOfThree_withInbuild(nums1,nums2,nums3);
        obj.twoOutOfThree(nums1,nums2,nums3);
    }
}
