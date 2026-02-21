package leetcode;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
//Prakash solved it
//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/?envType=problem-list-v2&envId=array

public class ReplaceEleWithGreatest {
    public int[] replaceElements(int[] arr) {
        // int[] arr = {17,18,5,4,6,1};
        int[] myOutputArr=new int[arr.length];
        myOutputArr[arr.length-1]=-1;

        for(int i=0;i<arr.length-1;i++){ //arr.length-1 dont want to iterate last index
            int tempMax=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>tempMax){
                    tempMax=arr[j];
                }
            }
            myOutputArr[i]=tempMax;
        }
        System.out.println(Arrays.toString(myOutputArr));
        return myOutputArr;
     }

     public static void main(String[] arg){
         int[] arr = {17,18,5,4,6,1};
         ReplaceEleWithGreatest obj=new ReplaceEleWithGreatest();
         obj.replaceElements(arr);
    }


}
