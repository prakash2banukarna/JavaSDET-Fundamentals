package leetcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Prakash solved it
// https://leetcode.com/problems/keyboard-row/description/?envType=problem-list-v2&envId=array

/*
Step 1: First find which row in Keyboard the words (checkIn=firstRow) below too by finding the first character of words in array
Step 2: Then for each words check the charaters contain in checkIn
Step 3: add those into list and latter convert to arrays
 */
public class KeyBoardRow {
    public String[] findWords(String[] words) {

        String firstRow="qwertyuiop";
        String secondRow="asdfghjkl";
        String thirdRow="zxcvbnm";
        String checkIn="";

        List<String> myOutput =new ArrayList<>();

        for(int i=0;i<words.length;i++){

            //Step 1:
            char firstChar=words[i].toLowerCase().charAt(0);
            if(firstRow.contains(Character.toString(firstChar)))
            {
                checkIn=firstRow;
            }
            else if(secondRow.contains(Character.toString(firstChar)))
            {

                 checkIn=secondRow;
            }
            else {
                 checkIn=thirdRow;
            }


            boolean allInRow = true;
            for(int j=1;j<words[i].length();j++){
                char wordsIn= words[i].toLowerCase().charAt(j);
                if(!checkIn.contains(Character.toString(wordsIn))){
                    allInRow=false;
                    break;
                }
            }

            if(allInRow){
                myOutput.add(words[i]);
            }

        }

        String[] myOutputArr= new String[myOutput.size()];

        int i=0;
        for(String word:myOutput){
            myOutputArr[i]=word;
            i++;
        }

        System.out.println(Arrays.toString(myOutputArr));
        return myOutputArr;

    }
    public static void main(String[] arg){
        String[] words = {"Hello","Alaska","Dad","Peace"};
        KeyBoardRow obj = new KeyBoardRow();
        obj.findWords(words);
    }
}
