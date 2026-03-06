package leetcode;

import java.util.HashSet;
import java.util.Set;
// prakash solved but leetcode has bug with one input (Although Alice tried to focus on her typing, she is aware that she may still have done this at most once.)
// https://leetcode.com/problems/find-the-original-typed-string-i/description/
public class FindOriginalTypedString_NotCompleted {
    public int possibleStringCount(String word) {
//word = "abbcccc"
        Set<Character> mySetChar=new HashSet<>();

        int myOutput=1;
        for(int i=0;i<word.length();i++){
            char temp=word.charAt(i);
            if(mySetChar.contains(temp)){
                myOutput++;
            }
            else{
                mySetChar.add(temp);
            }
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
       String word = "abbcccc";
        FindOriginalTypedString_NotCompleted obj =new FindOriginalTypedString_NotCompleted();
        obj.possibleStringCount(word);
    }
}
