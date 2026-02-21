package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Prakash solved it
//https://leetcode.com/problems/create-target-array-in-the-given-order/description/

/*
nums = [0,1,2,3,4], index = [0,1,2,2,1]

mylist.add(index[i],num[i]) ==> mylist.add(0,num[i])
 */
public class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
//nums = [0,1,2,3,4], index = [0,1,2,2,1]

        List<Integer> myOutputLst = new ArrayList<>();

        for(int i=0;i< index.length;i++){
            int ind=index[i];
            myOutputLst.add(ind,nums[i]); // add the values into list using index
        }


        int[] myOutputArr= new int[nums.length];
        for(int x=0;x<myOutputLst.size();x++){
            myOutputArr[x]=myOutputLst.get(x);

        }

        System.out.println(Arrays.toString(myOutputArr));
        return myOutputArr;
    }

    public static void main(String[] arg){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        CreateTargetArray obj = new CreateTargetArray();
        obj.createTargetArray(nums,index);
    }
}
