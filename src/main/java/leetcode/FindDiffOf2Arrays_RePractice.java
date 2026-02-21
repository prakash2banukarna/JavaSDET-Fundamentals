package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Prakash solved it
// https://leetcode.com/problems/find-the-difference-of-two-arrays/description/
public class FindDiffOf2Arrays_RePractice {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> myOutput= new ArrayList<>();
        //        int[] nums1 = {1,2,3};
        //        int[] nums2 ={2,4,6};

        List<Integer> temp=new ArrayList<>();
        //Below is to add nums2 not preset in nums1
        for(int i=0;i<nums1.length;i++){

            int value=nums1[i];
            boolean found =Arrays.stream(nums2).anyMatch(x->x==value);
            if(!found){ //if false
                if(!temp.contains(value)){
                    temp.add(value);

                }
            }

        }
        myOutput.add(temp);

        //Below is to add nums1 not preset in nums2
        List<Integer> temp2=new ArrayList<>();
        for(int j=0;j<nums2.length;j++){
            int value=nums2[j];
            boolean found = Arrays.stream(nums1).anyMatch(x->x==value);
            if(!found && !temp2.contains(value)){
                temp2.add(value);
            }

        }
        myOutput.add(temp2);


        return myOutput;

    }

    public static void main(String[] arg){
        int[] nums1 = {1,2,3};
        int[] nums2 ={2,4,6};
        FindDiffOf2Arrays_RePractice obj =new FindDiffOf2Arrays_RePractice();
        obj.findDifference(nums1,nums2);

    }
}
