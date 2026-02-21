package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

//Prakash solved it

// https://leetcode.com/problems/majority-element/description/?envType=problem-list-v2&envId=array
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */

public class MajorityElement {

    public int solution(int[] nums) {
        Arrays.sort(nums);
        System.out.println((nums.length)/2);
        return nums[(nums.length)/2];
    }




    public static void main(String[] arg){
        int[] nums = {1,2,1};
        MajorityElement obj= new MajorityElement();
        obj.solution(nums);
    }
}
