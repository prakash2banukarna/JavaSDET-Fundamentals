package leetcode;

import java.util.ArrayList;
import java.util.List;
// Prakash solved it
// https://leetcode.com/problems/baseball-game/description/
public class BaseballGame {
    public int calPoints(String[] operations) {
// String[] ops = {"5","-2","4","C","D","9","+","+"}
        List<Integer> myLst=new ArrayList();
        for(int i=0;i<operations.length;i++){
            int len=myLst.size(); // This helps to find the len everytime we iterate
            if(operations[i].equals("+")){
                int previousTwoScores=myLst.get(len-1) + myLst.get(len-2); //Fetching the previous two values
                myLst.add(previousTwoScores);
            }
            else if(operations[i].equals("D")){
                int doublePreviousScore=myLst.get(len-1)*2; // Doubling the previous score
                myLst.add(doublePreviousScore);
            }
            else if(operations[i].equals("C")){
                myLst.remove(len-1);
            }
            else{
                myLst.add(Integer.parseInt(operations[i])); // Convet to int and add to list
            }

        }

        System.out.println(myLst);
        int myOutput=0;
        for(int x:myLst){
            myOutput=myOutput+x;
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        BaseballGame obj = new BaseballGame();
        obj.calPoints(ops);
    }
}
