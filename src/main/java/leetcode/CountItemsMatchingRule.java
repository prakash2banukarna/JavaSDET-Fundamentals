package leetcode;

import java.util.Arrays;
import java.util.List;
// Prakash solved it
// https://leetcode.com/problems/count-items-matching-a-rule/description/

/*
Find the ruleIndex
 */

public class CountItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"

        int ruleIndex=0;
        if(ruleKey.equals("type")){
            ruleIndex=0;
        }
        else if(ruleKey.equals("color")){
            ruleIndex=1;
        }
        else{
            ruleIndex=2;
        }

        int myOutput=0;
       for(int i=0;i< items.size();i++){
           String ruleValueActual=items.get(i).get(ruleIndex);
           if(ruleValue.equals(ruleValueActual)){
               myOutput++;
           }
       }
        System.out.println(myOutput);
       return myOutput;
    }

    public static void main(String[] arg){
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );

        String ruleKey = "color";
        String ruleValue = "silver";

        CountItemsMatchingRule obj = new CountItemsMatchingRule();
        obj.countMatches(items, ruleKey, ruleValue);

    }
}
