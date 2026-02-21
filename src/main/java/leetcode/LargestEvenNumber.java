package leetcode;

import java.math.BigInteger;
//Prakash solved it
//https://leetcode.com/problems/largest-even-number/description/

/*
Dont try % 2 == 0  logic , when the size of string is too large, wont be able to convert to int/long/bigdecimal
 */
public class LargestEvenNumber {
    public String largestEven(String s) {
//String[] s="1112";
        for(int i=s.length()-1;i>=0;i--){
           if(s.charAt(i)=='2'){
               System.out.println(s.substring(0,i+1));
               return s.substring(0,i+1);
           }
        }
        return "";

     }

     public static void main(String[] a){
//         String s="1112";
//         String s="1";
         String s="2";
//         String s="2211112112";
         LargestEvenNumber obj =new LargestEvenNumber();
         obj.largestEven(s);
     }
}
