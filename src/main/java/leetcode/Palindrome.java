package leetcode;

import java.util.Arrays;
import java.util.Objects;
//prakash solved it
//https://leetcode.com/problems/palindrome-number/description/
public class Palindrome {
    public boolean isPalindrome(int x) {
        //x = 121
        String xStr=String.valueOf(x);
        String[] myArray=xStr.split("");
        int left=0;
        int right=xStr.length()-1;
        while(left<right){
//            if(Objects.equals(myArray[left], myArray[right])){
            if(myArray[left].equals(myArray[right])){
                left++;
                right--;
            }
            else{
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;


    }

    public static void main(String[] arg){
        int x = 121;
        Palindrome obj = new Palindrome();
        obj.isPalindrome(x);

    }

}
