package leetcode;

import java.util.ArrayList;
import java.util.List;
// Prakash solved it
// https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/description/

/*
For input -> abcdefghij
We have to split and add
abc def ghi j
j + (k * char fill)



 */
public class DivideStrGroupSizeK {
    public String[] divideString(String s, int k, char fill) {

        List<String> myOutput= new ArrayList<>();

        for(int i=0;i<s.length();i+=k){
            if(i+k<s.length()){
                String temp=s.substring(i,i+k);
                myOutput.add(temp);
            }
            else{ // if i+k > s.length() then it means we have to fill
                int toBeFilled=(i+k)-s.length(); // this tells how much to fill
                String temp=s.substring(i,s.length())+String.valueOf(fill).repeat(toBeFilled); //here filling
                myOutput.add(temp);
            }

        }

        String[] myOutputStr=new String[myOutput.size()];

        for(int i=0;i<myOutput.size();i++){
            myOutputStr[i]=myOutput.get(i);
        }

        return myOutputStr;
    }


    public static void main(String[] arg){
//        String s = "abcdefghi";
        String s = "abcdefghij";
        int k = 3;
        char fill = 'x';
        DivideStrGroupSizeK obj = new DivideStrGroupSizeK();
        obj.divideString(s,k,fill);
    }
}
