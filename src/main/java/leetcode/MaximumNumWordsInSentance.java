package leetcode;
// Prakash solved it
// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/

public class MaximumNumWordsInSentance {
    public int mostWordsFound(String[] sentences) {
//sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
        int myoutput=0;

        for(int i=0;i<sentences.length;i++){
            int temp=sentences[i].split(" ").length;
            myoutput=Math.max(temp,myoutput);
        }
        System.out.println(myoutput);
        return myoutput;
    }

    public static void main(String[] arg){
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        MaximumNumWordsInSentance obj = new MaximumNumWordsInSentance();
        obj.mostWordsFound(sentences);
    }
}
