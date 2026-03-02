package leetcode;

import java.util.HashSet;
import java.util.Set;
// Prakash solved it
// https://leetcode.com/problems/first-letter-to-appear-twice/description/?envType=problem-list-v2&envId=hash-table

public class FirstLetterAppearTwice {
    public char repeatedCharacter(String s) {
        // s = "abccbaacz"
        char[] sChar=s.toCharArray();
        Set<Character> sSet=new HashSet<>();

        for(int i=0;i<sChar.length;i++){
            if(sSet.contains(sChar[i])){
                System.out.println(sChar[i]);
                return sChar[i];
            }
            else{
                sSet.add(sChar[i]);
            }
        }

        return 's'; //Just a dummy return
    }

    public static void main(String[] arg){
        String s = "abccbaacz";
        FirstLetterAppearTwice obj=new FirstLetterAppearTwice();
        obj.repeatedCharacter(s);
    }
}
