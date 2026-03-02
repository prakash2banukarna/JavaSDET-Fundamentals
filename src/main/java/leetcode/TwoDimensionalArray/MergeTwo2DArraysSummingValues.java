package leetcode.TwoDimensionalArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
// Prakash solved it
// https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/

/*
In Hashmap, store id :value in ascending order uding TreeMap
Iterate hapMap and put the values in two dimentional array

 */
public class MergeTwo2DArraysSummingValues {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
//nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]

        Map<Integer,Integer> idCount=new TreeMap<>(); // TreeMap will sort the map in ascending order
        for(int i=0;i< nums1.length;i++){
            int count=idCount.getOrDefault(nums1[i][0],0);
            idCount.put(nums1[i][0],nums1[i][1]+count);
        }

        for(int i=0;i< nums2.length;i++){
            int count=idCount.getOrDefault(nums2[i][0],0);
            idCount.put(nums2[i][0],nums2[i][1]+count);
        }


        int[][] myOutput = new int[idCount.size()][2];
        int i=0;
        for(Map.Entry<Integer,Integer> keyValue:idCount.entrySet()){
            int id=keyValue.getKey();
            int value=keyValue.getValue();
            myOutput[i][0]=id;
            myOutput[i][1]=value;
            i++;
        }
        System.out.println(Arrays.deepToString(myOutput));
        return myOutput;
    }

    public static void main(String[] arg){
        int[][] nums1 = {{1,2},{2,3},{4,5}};
        int[][] nums2 = {{1,4},{3,2},{4,1}};
        MergeTwo2DArraysSummingValues obj=new MergeTwo2DArraysSummingValues();
        obj.mergeArrays(nums1,nums2);
    }
}
