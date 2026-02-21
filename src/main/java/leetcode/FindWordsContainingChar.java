package leetcode;

import java.util.ArrayList;
import java.util.List;
// Prakash solved it
// https://leetcode.com/problems/find-words-containing-character/description/
public class FindWordsContainingChar {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> myOutput=new ArrayList<>();
        for(int i=0;i< words.length;i++){
            String xx=String.valueOf(x);
            if(words[i].contains(xx)){ // you are not able to pass char , so converting  char to  String
                myOutput.add(i);
            }
        }

        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
       String[] words = {"abc","bcd","aaaa","cbc"};
       char x = 'a';
        FindWordsContainingChar obj = new FindWordsContainingChar();
        obj.findWordsContaining(words,x);
    }
}
