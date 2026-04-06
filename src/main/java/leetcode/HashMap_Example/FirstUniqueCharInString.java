package leetcode.HashMap_Example;

import java.util.HashMap;
import java.util.Map;
// Prakash solved it
// https://leetcode.com/problems/first-unique-character-in-a-string/description/?envType=problem-list-v2&envId=hash-table

/*
Step 1: Create a hashMap and find the count of each characters in S
Step 2: Iterate each character of S,and check its respective count, if the count is equal to 1, return the index

 */
public class FirstUniqueCharInString {
    public int firstUniqChar(String s) {

        Map<Character,Integer> sCount=new HashMap<>();
        for(int i=0;i<s.length();i++){
            int count=sCount.getOrDefault(s.charAt(i),0);
            sCount.put(s.charAt(i),count+1);

        }

        //For each character is s and see  its count , if the count is 1 and find the index
        for(int i=0;i<s.length();i++){
            int countOfsFromMap=sCount.get(s.charAt(i));
            if(countOfsFromMap==1){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] arg){
        String s = "loveleetcode";
        FirstUniqueCharInString obj = new FirstUniqueCharInString();
        obj.firstUniqChar(s);
    }
}
