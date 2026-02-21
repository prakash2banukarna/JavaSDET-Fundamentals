package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//prakash solved it
// https://leetcode.com/problems/separate-the-digits-in-an-array/description/
public class SeperateDigits_RePractice {
    public int[] separateDigits(int[] nums) {

        System.out.println(9/10); //this gives the quotient
        System.out.println(9%10); //this gives the remainder


        List<Integer> myOutput=new ArrayList<Integer>(); //As List

        for(int num:nums){
            List<Integer> temp=new ArrayList<Integer>();
            while(num>0){ // consider example 1000 to understand this solution
                temp.add(num%10); //quatien added
                num=num/10; //remainder again goes inside the loop
            }
            //For example , value 1000  is added as 0,0,0,1 , so we need to reverse and store the value

            for(int j=temp.size()-1;j>=0;j--){
                myOutput.add(temp.get(j));
            }

        }

        int[] myOutputArr=new int[myOutput.size()];
        for(int j=0;j<myOutput.size();j++){
            myOutputArr[j]=myOutput.get(j);
        }

        System.out.println(Arrays.toString(myOutputArr));
        return myOutputArr;



    }

    public static void main(String[] arg){
        int[] nums = {13,25,83,77};
//        int[] nums = {7,1,3,9};
        SeperateDigits_RePractice obj =new SeperateDigits_RePractice();
        obj.separateDigits(nums);
    }
}
