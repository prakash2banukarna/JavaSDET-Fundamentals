package leetcode;

import java.util.HashMap;
import java.util.Map;
// Prakash solved it
// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
public class FindValueOfVariable {
    public int finalValueAfterOperations(String[] operations) {

        Map<String, Integer> variableVal = Map.of(
                "++X", 1,
                "X++", 1,
                "--X", -1,
                "X--", -1
        );

        int myOutput=0;
        for(int i=0;i<operations.length;i++){
            String str=operations[i];
            myOutput=myOutput + variableVal.get(str);

        }
        System.out.println(myOutput);
        return myOutput;
    }

    public int souktion2(String[] operations){
        int myoutput=0;
        for(int i=0;i<operations.length;i++){
            char ch= operations[i].charAt(1);
            if(ch=='+'){
                myoutput++;
            }
            else{
                myoutput--;
            }
        }
        System.out.println(" myoutput from solution 2 :" +myoutput);
        return myoutput;
    }

    public static void main(String[] arg){
        String[] operations = {"++X","++X","X++"};
        FindValueOfVariable obj=new FindValueOfVariable();
//        obj.finalValueAfterOperations(operations);
        obj.souktion2(operations);
    }
}
