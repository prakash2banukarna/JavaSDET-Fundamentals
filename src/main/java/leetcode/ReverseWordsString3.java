package leetcode;

import java.util.Arrays;
// Prakash solved it
// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
public class ReverseWordsString3 {
    public String reverseWords(String s) {
//
        String[] sArr=s.split(" "); // Step 1: Convert String to String array
        String[] myoutputArr=new String[sArr.length];

        for(int i=0;i<sArr.length;i++){
            String temp=sArr[i];  //Step 2: For each string value, iterate and reverse the value
            String tempOutput="";
            for(int j=temp.length()-1;j>=0;j--){ //Step 2.1 : Reverse the value
                tempOutput=tempOutput+temp.charAt(j);
            }
            myoutputArr[i]=tempOutput; //Step 3: store all the reversed value in string array

        }

        String myOutput=myoutputArr[0];

        for(int z=1;z<myoutputArr.length;z++){ //Step 4: Convert each string value into string
            myOutput=myOutput+" "+myoutputArr[z];
        }

        return myOutput;
    }

    public static void main(String[] arg){
        String s= "Mr Ding";
        ReverseWordsString3 obj= new ReverseWordsString3();
        obj.reverseWords(s);
    }
}
