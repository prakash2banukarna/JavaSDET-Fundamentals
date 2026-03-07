package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Prakash solved it
// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/?envType=problem-list-v2&envId=array

/*How this problem is solved
Step 1: Build a frequency map of nums1 (value → count)
Step 2: Loop through nums2 — if the element exists in the map with count > 0,
        add it to the result and decrement its count (to avoid reusing it)
Step 3: Convert the result list to an int array and return it

Example: nums1=[1,2,2,1], nums2=[2,2]
  Map → {1:2, 2:2}
  nums2[0]=2 → found, add 2, map becomes {1:2, 2:1}
  nums2[1]=2 → found, add 2, map becomes {1:2, 2:0}
  Output → [2,2]
*/
public class IntersectionsOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
//nums1 = [1,2,2,1], nums2 = [2,2]

        Map<Integer,Integer> nums1Map=new HashMap<>();

        for(int i=0;i< nums1.length;i++){
            int count= nums1Map.getOrDefault(nums1[i],0);
            nums1Map.put(nums1[i],count+1);
        }

        List<Integer> myOutput= new ArrayList<>();

        for(int j=0;j<nums2.length;j++){
            if(nums1Map.get(nums2[j])!=null && nums1Map.get(nums2[j]) > 0){
                myOutput.add(nums2[j]);

                int count= nums1Map.get(nums2[j]);
                nums1Map.put(nums2[j],count-1);

            }
        }

        System.out.println(myOutput);

        int[] myoutArr= new int[myOutput.size()];
        for(int j=0;j<myOutput.size();j++){
            myoutArr[j]=myOutput.get(j);
        }

        return myoutArr;

    }

    public  static void main(String[] arg){
//        int[] nums1 = {1,2,2,1};
//        int[] nums2 = {2,2};
//        int[] nums1 = {4,9,5};
//        int[] nums2 = {9,4,9,8,4};
        int[] nums1 = {4,7,9,7,6,7};
        int[] nums2 = {5,0,0,6,1,6,2,2,4};
        IntersectionsOfTwoArrays obj = new IntersectionsOfTwoArrays();
        obj.intersect(nums1,nums2);
    }
}
