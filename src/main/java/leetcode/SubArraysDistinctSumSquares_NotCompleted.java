package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubArraysDistinctSumSquares_NotCompleted {
    public int sumCounts(List<Integer> nums) {
//
        int count=0;
        for(int i=0;i<nums.size();i++){
            Set<Integer> temp=new HashSet<>(nums.subList(i,nums.size()));
            int dist=temp.size();
            System.out.println(dist*dist);
        }


        return count;
    }

    public static void main(String[] arg){
        List<Integer> nums = Arrays.asList(1,2,1);
        SubArraysDistinctSumSquares_NotCompleted obj = new SubArraysDistinctSumSquares_NotCompleted();
        obj.sumCounts(nums);

    }
}
