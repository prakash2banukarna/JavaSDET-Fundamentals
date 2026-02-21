package leetcode;

import java.util.Arrays;
import java.util.List;
// Prakash solved it
// https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/description/
public class CheckStringAcronymWord {
    //words = ["alice","bob","charlie"], s = "abc"
    public boolean isAcronym(List<String> words, String s) {
        String actual="";
        for(int i=0;i< words.size();i++){
            actual=actual + words.get(i).substring(0,1);
        }

        if(!s.equals(actual)){
            System.out.println(false);
            return false;
        }

        System.out.println(true);
        return true;
    }

    public static void main(String[] arg){
        List<String> words= Arrays.asList("alice","bob","charlie");
        String s = "abc";
        CheckStringAcronymWord obj= new CheckStringAcronymWord();
        obj.isAcronym(words,s);
    }

}
