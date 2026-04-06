package leetcode;

import java.util.Arrays;

// Prakash solved it
// https://leetcode.com/problems/reverse-string/description/?envType=problem-list-v2&envId=string
public class ReverseString {
    public void reverseString(char[] s) {
        //s = ["h","e","l","l","o"]

        int len=s.length;
        for(int first=0,last=len-1;first<len/2;first++,last--){
            /*
Temp =s[last]
s[last]=s[first]
s[first] =Temp
             */

            char temp=s[first];
            s[first]=s[last];
            s[last]=temp;


        }

        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] arg){
        char[] s = {'h','e','l','l','o'};
        ReverseString obj=new ReverseString();
        obj.reverseString(s);
    }
}
