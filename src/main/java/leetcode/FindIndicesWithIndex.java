package leetcode;


import java.util.Arrays;
// Prakash solved it
// https://leetcode.com/problems/find-indices-with-index-and-value-difference-i/description/

public class FindIndicesWithIndex {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
//nums = [5,1,4,1], indexDifference = 2, valueDifference = 4
        int[] myOutput={-1,-1};

        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums.length;j++){ // note i and j may be equal so it should be j=0
                if(Math.abs(i-j) >=indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference){
                    myOutput[0]=i;
                    myOutput[1]=j;
                    System.out.println(Arrays.toString(myOutput));
                    return myOutput;
                }
            }
        }
        return myOutput;

    }

    public static void main(String[] arg){
        int[] nums = {5,1,4,1};
        int indexDifference = 2;
        int valueDifference = 4;
        FindIndicesWithIndex obj = new FindIndicesWithIndex();
        obj.findIndices(nums,indexDifference,valueDifference);
    }
}
