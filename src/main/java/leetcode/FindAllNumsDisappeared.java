package leetcode;

import java.util.*;

//Prakash solved it - Time exceeded
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/?envType=problem-list-v2&envId=array
public class FindAllNumsDisappeared {
    //Below accepted
    public List<Integer> findDisappearedNumbers_Solution2(int[] nums) {
        Set<Integer> mySet= new HashSet<>();
        // Step 1: Converting array into Set
        for(int n:nums){
            mySet.add(n);
        }

        List<Integer> myOutput=new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++){
            if(!mySet.contains(i+1)){ //NOte: you should pass index
                myOutput.add(i+1); //Add index into the output
            }
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public List<Integer> findDisappearedNumbers_Solution1(int[] nums) {
        Set<Integer> mySet= new HashSet<>();
        // Step 1: Converting array into Set
        for(int n:nums){
            mySet.add(n);
        }

        List<Integer> myOutput=new ArrayList<Integer>();
        int value=1;
        while(value<=nums.length){
            if(!mySet.contains(value)){
                myOutput.add(value);
                value++;
            }
            else{
                value++;
            }
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public List<Integer> findDisappearedNumbers_TimeExceeded(int[] nums){

        List<Integer> lst=new ArrayList<Integer>();
        // Step 1: Converting array into list
        for(int n:nums){
            if(!lst.contains(n)){
                lst.add(n);
            }
        }

        List<Integer> myOutput=new ArrayList<Integer>();
        for(int i=1;i<=nums.length;i++){
            if(!lst.contains(i)){ // if the list (step 1)  doesn't contains the index value
                myOutput.add(i);
            }
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
//        int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums = {1,1};
        FindAllNumsDisappeared obj=new FindAllNumsDisappeared();
//        obj.findDisappearedNumbers_TimeExceeded(nums);
//        obj.findDisappearedNumbers_Solution1(nums);
        obj.findDisappearedNumbers_Solution2(nums);
    }
}
