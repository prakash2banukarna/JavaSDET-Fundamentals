package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/plus-one/description/?envType=problem-list-v2&envId=array
public class plusOne {

    public int[] plusOne(int[] digits){


        for(int i=digits.length-1;i>=0;i--){
            System.out.println(i +" " +digits[i]);
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                System.out.println("My output: " +Arrays.toString(digits));
                return digits;
            }
            else
                digits[i]=0;
        }

        digits =new int[digits.length + 1];
        digits[0]=1;
        System.out.println("My output: " +Arrays.toString(digits));
        return digits;


    }

    public static void main(String[] arg){
        int digits[] = {9,9};
        plusOne pOne=new plusOne();
        pOne.plusOne(digits);

    }
}
