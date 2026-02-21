package leetcode;
//Prakash solved it
//https://leetcode.com/problems/counting-words-with-a-given-prefix/description/
public class CountingWordsPrefix {

    public int prefixCount(String[] words, String pref) {
//words = ["pay","attention","practice","attend"], pref = "at"

        int myoutput=0;
        int prefLen=pref.length();
        for(int i=0;i<words.length;i++){
            if(words[i].length()>=prefLen
                    &&
                    words[i].substring(0,prefLen).equals(pref))
            {
                myoutput++;
            }
        }
        System.out.println(myoutput);
        return myoutput;
    }

    public static void main(String[] arg){
//        String[] words = {"pay","attention","practice","attend"};
//        String pref = "at";
        String[] words = {"leetcode","win","loops","success"};
        String pref = "code";
        CountingWordsPrefix obj=new CountingWordsPrefix();
        obj.prefixCount(words,pref);
    }


}
