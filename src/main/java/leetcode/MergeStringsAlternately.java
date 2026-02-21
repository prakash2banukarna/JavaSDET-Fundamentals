package leetcode;
// Prakash solved it
// https://leetcode.com/problems/merge-strings-alternately/description/
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
//word1 = "abc", word2 = "pqr"
        String myOutput="";
        for(int i=0 , j=0;i<word1.length() || j<word2.length();i++,j++){
            if(i<word1.length()){
                myOutput=myOutput+word1.charAt(i);
            }
            if(j<word2.length()){
                myOutput=myOutput+word2.charAt(j);
            }

        }

        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
//        String word1 = "abc";
//        String word2 = "pqr";
        String word1 = "ab";
        String word2 = "pqrs";
        MergeStringsAlternately obj = new MergeStringsAlternately();
        obj.mergeAlternately(word1,word2);
    }
}
