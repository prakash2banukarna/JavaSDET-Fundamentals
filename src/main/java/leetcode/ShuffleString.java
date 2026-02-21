package leetcode;

import java.util.ArrayList;
import java.util.List;

//Prakash solved it
//https://leetcode.com/problems/shuffle-string/description/

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
//s = "codeleet", indices = [4,5,6,7,0,2,1,3]
        String[] arr = new String[indices.length];

        for(int i=0;i<indices.length;i++){
            int indFormyLst=indices[i]; //Step 1 : Get the index (i.e 4)
            String ch= String.valueOf(s.charAt(i)); //Step 2: Get char in S from 0th index (ch=c)

            arr[indFormyLst]=ch; //Step 3: Add the value in array arr[4] =c

        }

        String myOutput="";
        for(int j=0;j<arr.length;j++){
            myOutput=myOutput+arr[j];
        }
        System.out.println(myOutput);

        return myOutput;

    }

    public static void main(String[] arg){
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        ShuffleString obj = new ShuffleString();
        obj.restoreString(s,indices);
    }
}
