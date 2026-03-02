package leetcode.HashMap_Example;

import java.util.HashMap;
import java.util.Map;
// Prakash solved it
// https://leetcode.com/problems/permutation-difference-between-two-strings/description/?envType=problem-list-v2&envId=hash-table


public class PermutationDifftTwoString {
    public int findPermutationDifference(String s, String t) {
//s = "abc", t = "bac"
        Map<Character,Integer> sCharIndex=new HashMap<>();
        Map<Character,Integer> tCharIndex=new HashMap<>();

        for(int i=0;i<s.length();i++){
            sCharIndex.put(s.charAt(i),i);
        }

        for(int j=0;j<t.length();j++){
            tCharIndex.put(t.charAt(j),j);
        }

        int countDifferance=0;

        for(Map.Entry<Character,Integer> keyValue:sCharIndex.entrySet()){
            char sKey=keyValue.getKey();
            int sValue=keyValue.getValue(); //
            int tValue=tCharIndex.get(sKey); //Fetching the t value using the sKey.
            countDifferance =countDifferance + Math.abs(sValue-tValue);
        }
        System.out.println(countDifferance);
        return countDifferance;
    }

    public static void main(String[] arg){
        String s = "abc";
        String t = "bac";
        PermutationDifftTwoString obj =new PermutationDifftTwoString();
        obj.findPermutationDifference(s ,t);
    }
}
