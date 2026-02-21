package leetcode;

import java.util.Arrays;
// Prakash solved it
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

//Note: You can also use String builder
public class CheckTwoStrEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //word1 = ["ab", "c"], word2 = ["a", "bc"]

        String word1str=word1[0];
        String word2str=word2[0];
        for(int i=1;i<word1.length;i++){
            word1str=word1str+word1[i];
        }

        for(int j=1;j<word2.length;j++){
            word2str=word2str+word2[j];
        }

        System.out.println(word1str.equals(word2str));
        return word1str.equals(word2str);
    }

    public static void main(String[] arg){
//        String[] word1 = {"ab", "c"};
//        String[] word2 = {"a", "bc"};
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        CheckTwoStrEquivalent obj = new CheckTwoStrEquivalent();
        obj.arrayStringsAreEqual(word1,word2);
    }
}
