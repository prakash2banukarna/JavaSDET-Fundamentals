package leetcode;

import java.util.ArrayList;
import java.util.List;
// Prakash solved it
// https://leetcode.com/problems/calculate-digit-sum-of-a-string/description/
public class CalculateDigitSumString {

    public String digitSum_Step2(String s, int k) {
// s = "11111222223", k = 3

        String tempS= s;
        String tempString="";

        while(tempS.length()>k){
            for(int i=0;i<tempS.length();i+=k){
                String chunk =tempS.substring(i,Math.min(i+k,tempS.length())); // handles the last chunk safely when it's shorter than `k`.
                int chunkInt = chunk.chars().map(c-> c - '0').sum();
                tempString =tempString + String.valueOf(chunkInt);
            }
            //reset
            tempS =tempString;
            tempString="";
        }
        System.out.println(tempS);
        return tempS;
    }

    public void digitSum_Step1(String s, int k) {
// s = "11111222223", k = 3

        List<String> subGroups=new ArrayList<>();

        int count=Math.ceilDiv(s.length(),k);

        /* Index: s = "111,112,222,23", k = 3
        0,3
        3,6
        6,9
         */

        int startIndex=0;
        int endIndex=k ;
        while(count!=0){
            if((endIndex + 1)<s.length()){
                String temp =s.substring(startIndex,endIndex );
                subGroups.add(temp);
                //reset the values
                count--;
                startIndex = endIndex ;
                endIndex = endIndex + k;
            }
            else{
                String temp =s.substring(startIndex); // this takes care of last part of the string and doesn't get index out of bound
                subGroups.add(temp);
                //reset the values
                count--;
                startIndex = endIndex ;
                endIndex = endIndex + k;
            }
        }

        System.out.println(subGroups);

    }

    public static void main(String[] arg){
        String s = "11111222223";
        int k=3;
        CalculateDigitSumString obj = new CalculateDigitSumString();
        obj.digitSum_Step2(s,k);
    }
}
