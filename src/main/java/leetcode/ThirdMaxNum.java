package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
// Prakash sorted it
// https://leetcode.com/problems/third-maximum-number/description/?envType=problem-list-v2&envId=array
public class ThirdMaxNum {

    public int thirdMax(int[] nums) {

        TreeSet mySet = new TreeSet(Collections.reverseOrder()); // Refer SortSet class

        for(int n:nums){
            mySet.add(n);
        }
        System.out.println(mySet); // Step 1: Set + sorting in descding order [3, 2, 1]

        List lst =new ArrayList(mySet);  //Converting Set to List to access the index


        if(lst.size()>=3){
            System.out.println(lst.get(2));
            return (int) lst.get(2);
        }
        else{

            System.out.println(lst.get(0));
            return (int) lst.get(0);
        }


    }

    public static void main(String[] arg){
        int[] nums = {2,1};
        ThirdMaxNum x= new ThirdMaxNum();
        x.thirdMax(nums);

    }
}
