package leetcode;

//Prakash Solved it
//https://leetcode.com/problems/minimum-absolute-difference/description/?envType=problem-list-v2&envId=array


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDiff {

    public List<List<Integer>> minimumAbsDifference(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int absDif=arr[1]-arr[0];
        int temp=0;
        //Step 1: Find the absolute diff
        for(int i=1;i< arr.length-1;i++){
            temp=arr[i+1]-arr[i];
            absDif=Math.min(absDif,temp);
            if(absDif==1){
                break;
            }
        }
        System.out.println("Abs diff " +absDif);

        List<List<Integer>> myOutput = new ArrayList<>();
        for(int j=0;j< arr.length-1;j++){
            if(arr[j+1]-arr[j]==absDif){ //Step 2 : Find if there are any absolute diff
                List<Integer> row = new ArrayList<>(); // Note: Have to create list
                row.add(arr[j]);
                row.add(arr[j+1]);
                myOutput.add(row);
            }


        }
        System.out.println("myOutput" +myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        int[]  arr = {4,2,1,3};
        MinimumAbsDiff obj=new MinimumAbsDiff();
        obj.minimumAbsDifference(arr);
    }
}
