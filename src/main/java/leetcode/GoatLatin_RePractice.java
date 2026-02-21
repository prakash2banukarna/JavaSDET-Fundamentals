package leetcode;

import java.util.ArrayList;
import java.util.List;

//Prakash solved it
// https://leetcode.com/problems/goat-latin/description/

/*

Step 1: Create a list with all vowel, both in lower case and upper case
Step 2: Split string into String[] array
Step 3: Iterate each of String array and add the conditions as mentioned in description
Step 4:
 */
public class GoatLatin_RePractice {
    public String toGoatLatin(String sentence) {
// String sentence = "I speak Goat Latin";


        List<Character> vowel= List.of('a', 'e', 'i', 'o', 'u','A','E','I','O','U');
        String[] strArr=sentence.split(" ");
        List<String> myOutput= new ArrayList();
        for(int i=0;i<strArr.length;i++){
            char ch = strArr[i].charAt(0);
            String temp="a".repeat(i+1); //reapeat
            if(vowel.contains(ch)){
                myOutput.add(strArr[i]+"ma"+temp);
            } else {
                String a=strArr[i].substring(1)+ch+"ma"+temp; //substring
                myOutput.add(a);
            }
        }

        String myFinalOutput=myOutput.getFirst();;// dont assign as empty string to start

        for(int i=1;i<myOutput.size();i++){
            myFinalOutput=myFinalOutput+" "+myOutput.get(i);
        }
        System.out.println(myFinalOutput);
        return myFinalOutput;

    }

    public static void main(String[] arg){
        String sentence = "I speak Goat Latin";
        GoatLatin_RePractice obj =new GoatLatin_RePractice();
        obj.toGoatLatin(sentence);

    }
}
