package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_NotCompleted {
    public void summaryRanges(int[] nums) {

        List<String> myOutput = new ArrayList<>();
// 0,1,2,4,5,7
        int start=0;
        int end=-1;

        for(int i=start;start<nums.length-1;){

            if(nums[i]==nums[i + 1] + 1){
                end=nums[i + 1];
                start++;
            }
            else{
                if(end!=-1){
                    String temp=String.valueOf(start)+"->"+String.valueOf(end);
                    myOutput.add(temp);
                    // reset
                    start=start+1;
                    end=-1;
                }
                else{
                    String temp=String.valueOf(start);
                    myOutput.add(temp);
                    // reset
                    start=start+1;
                    end=-1;
                }


            }
        }
    }

    public static void main(String[] arg){
        int[] nums = {0,2,3,4,6,8,9};
        SummaryRanges_NotCompleted obj = new SummaryRanges_NotCompleted();
        obj.summaryRanges(nums);
    }
}
