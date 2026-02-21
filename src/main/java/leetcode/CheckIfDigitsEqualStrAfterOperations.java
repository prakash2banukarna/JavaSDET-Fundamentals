package leetcode;
// Prakash solved it
// https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/description/


public class CheckIfDigitsEqualStrAfterOperations {
    public boolean hasSameDigits(String s) {
// s = "3902"

        String myReuslt=s;

        while(myReuslt.length()>2){
            String tempstr="";

            // I solved this problem first by implementing the below for loop and then added while loop.
            for(int i=0;i<myReuslt.length()-1;i++){
                int temp= (Integer.parseInt(String.valueOf(myReuslt.charAt(i))) + Integer.parseInt(String.valueOf(myReuslt.charAt(i+1)))) % 10;
                tempstr=tempstr + temp;
            }
            myReuslt=tempstr;

            System.out.println(myReuslt);
        }

        if(Integer.parseInt(myReuslt) %11 != 0){
            System.out.println(false);
            return false;
        }

        System.out.println(true);
        return true;

    }

    public static void main(String[] arg){
        String s = "3902";
        CheckIfDigitsEqualStrAfterOperations obj = new CheckIfDigitsEqualStrAfterOperations();
        obj.hasSameDigits(s);
    }
}
