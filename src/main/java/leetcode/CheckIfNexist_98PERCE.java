package leetcode;

import java.util.HashSet;
import java.util.Set;

// REFER -> https://leetcode.com/problems/check-if-n-and-its-double-exist/solutions/6098626/beats-10000-for-loop-explained-with-exam-5gk5/?envType=problem-list-v2&envId=array
//Prakash almost solved it
// https://leetcode.com/problems/check-if-n-and-its-double-exist/description/?envType=problem-list-v2&envId=array

public class CheckIfNexist_98PERCE {

    public boolean checkIfExist(int[] arr) {

        Set<Integer> mySet =new HashSet();
        for(int a:arr){
            mySet.add(a);
        }

        for(int s:mySet){
            if(s%2==0 ){
                for(int i=0;i<arr.length;i++){
                    if(s==2*arr[i]){
                        System.out.println(true);
                        return true;
                    }
                }
            }
        }

        System.out.println(false);
        return false;
    }

    public static void main(String[] arg){
//        int[] arr = {10,2,5,3};
//        int[] arr = {7,1,14,11};
        int[] arr = {0,-2,2};
        CheckIfNexist_98PERCE obj=new CheckIfNexist_98PERCE();
        obj.checkIfExist(arr);
    }
}
