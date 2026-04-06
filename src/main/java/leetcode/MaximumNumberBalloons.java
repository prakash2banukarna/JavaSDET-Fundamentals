package leetcode;

import java.util.Arrays;
import java.util.HashMap;
// Prakash solved it
// https://leetcode.com/problems/maximum-number-of-balloons/description/?envType=problem-list-v2&envId=hash-table
//Note : Took lot of time to solve it, have to retry agian

/*
How this problem is solved. fill this for future referance. make this short and clear to udnerstand quickly
1. Counting frequency of each char in text
    - Loop over text and build a HashMap<String, Integer> that maps each character to how many times it appears.
    - Use getOrDefault so missing keys start at 0 and then increment: strCount.put(sString, strCount.getOrDefault(sString,0) + 1).
2. Checking how many times you can form "balloon"
 - Split "balloon" into ["b","a","l","l","o","o","n"].
    - For each needed letter:
        - For "l" and "o" (which appear twice in "balloon"), divide its count by 2 and take the minimum.
        - For others ("b", "a", "n"), just take the raw count.
    - count = Math.min(count, availableCount) keeps the maximum number of complete "balloon" strings you can build.
1. Early return on missing needed letter If any required letter (from "balloon") is missing in text, the method returns 0 immediately.
 */
public class MaximumNumberBalloons {
    public int maxNumberOfBalloons(String text) {
        HashMap<String,Integer> strCount=new HashMap<>();

        String[] temp="balloon".split("");
        for(int i=0;i<text.length();i++){
            char sChar=text.charAt(i);
            String sString= String.valueOf(sChar);
            int count=strCount.getOrDefault(sString,0);
            strCount.put(sString,count+1);
        }

        int count =Integer.MAX_VALUE;
        for(int i=0;i<temp.length;i++){
            String key= temp[i];
            if(strCount.get(key) != null){
                if(key.equals("l") || key.equals("o")){
                    int temp1 = strCount.get(key);
                    count=Math.min(count,temp1/2);
                }
                else{
                    int temp1 = strCount.get(key);
                    count=Math.min(count,temp1);
                }
            }
            else{
                System.out.println(count);
                count=0;
                return count;
            }

        }


        System.out.println(count);
    return count;
    }


    public static void main(String[] arg){
//        String text = "loonbalxballpoon";
//        String text = "leetcode";
        String text = "balon";
        MaximumNumberBalloons obj = new MaximumNumberBalloons();
        obj.maxNumberOfBalloons(text);

    }
}
