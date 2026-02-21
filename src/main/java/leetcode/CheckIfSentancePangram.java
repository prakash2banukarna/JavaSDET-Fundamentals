package leetcode;

import java.util.HashSet;
import java.util.Set;
//Prakash solved it
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class CheckIfSentancePangram {
    public boolean checkIfPangram(String sentence) {
//sentence = "thequickbrownfoxjumpsoverthelazydog"
       if(sentence.length()<26){
           System.out.println(false);
       }

       Set alphabets =new HashSet();

       for(String ch:sentence.split("")){
           alphabets.add(ch);
       }

        return alphabets.size() == 26;
    }

    public static void main(String[] arg){
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        CheckIfSentancePangram obj = new CheckIfSentancePangram();
        obj.checkIfPangram(sentence);
    }
}
