package leetcode;

import java.util.HashSet;
import java.util.Set;
//Prakash solved it
// https://leetcode.com/problems/count-pairs-of-similar-strings/description/

/*
Take two different  words from the array and convert those into set of characters
Compare both set

refer similarPairs2 solution
 */
public class CountPairsOfSimilarString {
    public int similarPairs(String[] words) {
//words = ["aba","aabb","abcd","bac","aabc"]

        int myoutput=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){

                Set<Character> set1=new HashSet<>();
                for( char c:words[i].toCharArray()){
                    set1.add(c);
                }

                Set<Character> set2=new HashSet<>();
                for( char c1:words[j].toCharArray()){
                    set2.add(c1);
                }

                if(set1.equals(set2)){
                    myoutput++;
                }

            }
        }

        System.out.println(myoutput);
        return myoutput;
    }

    public int similarPairs2(String[] words) {
        int myoutput=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){


                myoutput+=compareTwoWordSets(words[i],words[j]);

            }
        }

        System.out.println(myoutput);
        return myoutput;
    }

    public int compareTwoWordSets(String word1,String word2){
        Set<Character> set1=new HashSet<>();
        for( char c:word1.toCharArray()){
            set1.add(c);
        }

        Set<Character> set2=new HashSet<>();
        for( char c1:word2.toCharArray()){
            set2.add(c1);
        }

        return set1.equals(set2) ? 1 :0; //returns 1 if true
    }

    public static void main(String[] arg){
        String[] words = {"aba","aabb","abcd","bac","aabc"};
        CountPairsOfSimilarString obj=new CountPairsOfSimilarString();
        obj.similarPairs2(words);
    }
}
