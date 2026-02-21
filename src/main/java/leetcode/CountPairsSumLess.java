package leetcode;

import java.util.List;
//Prakash solved it
// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
public class CountPairsSumLess {
    public int countPairs(List<Integer> nums, int target) {

        int myOutput=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target){
                    myOutput++;
                }
            }
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        List<Integer> nums1 = List.of(-1,1,2,3,1);
        int target =2;
        CountPairsSumLess obj =new CountPairsSumLess();
        obj.countPairs(nums1,target);

    }

}
