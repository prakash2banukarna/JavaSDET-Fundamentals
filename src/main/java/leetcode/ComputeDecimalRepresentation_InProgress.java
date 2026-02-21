package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputeDecimalRepresentation_InProgress {
    public int[] decimalRepresentation(int n) {
//int n = 537;
        String[] str=String.valueOf(n).split("");

        List<Integer> myoutputLtr=new ArrayList<>();

        int places=0;
        for(int i=str.length-1;i>=0;i--){
            String temp=str[i]+"0".repeat(places);
            if(Integer.parseInt(temp)!=0){ //Note : if the value is zero (0), we have to ignore
                myoutputLtr.add(Integer.parseInt(temp));
                places++;
            }

        }

        int[] myoutput=new int[myoutputLtr.size()];
        for(int i=0;i<myoutputLtr.size();i++){
            myoutput[i]=myoutputLtr.get(i);
        }

        System.out.println(Arrays.toString(myoutput));
        return myoutput;

    }

    public static void main(String[] arg){
//        int n = 537;
        int n=102;
        ComputeDecimalRepresentation_InProgress obj = new ComputeDecimalRepresentation_InProgress();
        obj.decimalRepresentation(n);
    }
}
