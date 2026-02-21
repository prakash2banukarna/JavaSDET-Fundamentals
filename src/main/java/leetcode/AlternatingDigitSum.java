package leetcode;
// Prakash solved it
// https://leetcode.com/problems/alternating-digit-sum/description/

public class AlternatingDigitSum {
    public int alternateDigitSum(int n) {
//int n = 521;
        String[] str=String.valueOf(n).split("");
        int myOutput=0;
        for(int i=0;i<str.length;i++){
            if(i%2==0){
                myOutput=myOutput+Integer.parseInt(str[i]);
            }
            else{
                myOutput=myOutput-Integer.parseInt(str[i]);
            }
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        int n = 521;
        AlternatingDigitSum obj=new AlternatingDigitSum();
        obj.alternateDigitSum(n);
    }
}
