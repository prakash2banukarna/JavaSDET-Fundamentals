package leetcode.HashMap_Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Prakash solved it
// https://leetcode.com/problems/kth-distinct-string-in-an-array/description/

/*
Step 1: Create a hashmap and find the occurance of string
Step 2: Iterate each string and find if the string is distinct, then add to list
Step 3: see if the distinct list size is equal to int k and act accordingly
 */
public class KthDistinctStringInArray {
    public String kthDistinct(String[] arr, int k) {
//arr = ["d","b","c","b","c","a"], k = 2

        Map<String,Integer> stringCount=new HashMap<>();

        //Step 1
        for(int i=0;i<arr.length;i++){
            int count=stringCount.getOrDefault(arr[i],0);
            stringCount.put(arr[i],count+1);
        }

        List<String> distinctStr = new ArrayList<>(); // storing all the distinct value

        //Step 2
        for(int i=0;i<arr.length;i++){
            int value=stringCount.get(arr[i]);
            if(value==1){ // if the string is distinct then adding to list
                distinctStr.add(arr[i]);
            }
        }

        //Step 3
        if(distinctStr.size()>=k){
            System.out.println(distinctStr.get(k-1));
            return distinctStr.get(k-1);
        }

        return "";

    }

    public static void main(String[] arg){
       String[] arr = {"d","b","c","b","c","a"};
       int k = 2;
        KthDistinctStringInArray obj = new KthDistinctStringInArray();
        obj.kthDistinct(arr,k);
    }
}
