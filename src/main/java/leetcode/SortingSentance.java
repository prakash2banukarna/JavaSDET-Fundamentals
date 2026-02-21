package leetcode;

import java.util.Arrays;
// Prakash solved it
// https://leetcode.com/problems/sorting-the-sentence/description/
public class SortingSentance {
    public String sortSentence(String s) {
//s = "is2 sentence4 This1 a3"
        String[] str=s.split(" ");
        String[] myOutput=new String[str.length];
        for(int i=0;i<str.length;i++){
            int len=str[i].length();
            String lastValue=str[i].substring(len-1,len); // Finding the last Value (i.e index)
            myOutput[Integer.parseInt(lastValue)-1]=str[i].substring(0,len-1);

        }
        System.out.println(Arrays.toString(myOutput));

        String result=myOutput[0];

        for(int j=1;j< myOutput.length;j++){
            result=result+" "+myOutput[j];
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] arg){
        String s = "is2 sentence4 This1 a3";
        SortingSentance obj = new SortingSentance();
        obj.sortSentence(s);
    }
}
