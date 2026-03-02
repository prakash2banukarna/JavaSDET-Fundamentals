package leetcode;

import java.util.ArrayList;
import java.util.List;
// Prakash solved it
// https://leetcode.com/problems/string-matching-in-an-array/description/
public class StringMatchingArray {

    public List<String> stringMatching(String[] words) {
//
        List<String> myOutput=new ArrayList<>();
        for(int i=0;i< words.length;i++){
            for(int j=0;j< words.length;j++){
                if(i!=j && words[i].contains(words[j]) && !myOutput.contains(words[j])){
                    // !myOutput.contains(words[j]) - Added this to ignore duplicates in output
                    myOutput.add(words[j]);
                }
            }

        }
        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
//        String[] words = {"mass","as","hero","superhero"};
        String[] words = {"leetcoder","leetcode","od","hamlet","am"};
        StringMatchingArray obj = new StringMatchingArray();
        obj.stringMatching(words);
    }
}
