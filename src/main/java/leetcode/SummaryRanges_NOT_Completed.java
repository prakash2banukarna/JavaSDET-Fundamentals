package leetcode;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SummaryRanges_NOT_Completed {

    public static void main(String[] arg){
        int[] nums = {3,2,1,1,4,3,5};

        TreeSet mySet = new TreeSet(Collections.reverseOrder()); // Refer SortSet class

        for(int n:nums){
            mySet.add(n);
        }
        System.out.println(mySet); // Step 1: Set + sorting in descding order [3, 2, 1]

        List lst =new ArrayList(mySet);  //Converting Set to List to access the index


        if(lst.size()>=3){
            System.out.println(lst.get(2));
        }
        else{
            int l=lst.size()-1;
            System.out.println(l);
        }


    }
}
