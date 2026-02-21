package leetcode;
//Prakash sovled it
//https://leetcode.com/problems/truncate-sentence/description/
public class TruncateSentance {
    public String truncateSentence(String s, int k) {
//s = "Hello how are you Contestant", k = 4
        String[] str=s.split(" ");
        String myOutput=str[0];
        for(int i=1;i<k;i++){
            myOutput=myOutput+" "+str[i];
        }
        System.out.println(myOutput);
        return myOutput;

    }

    public static void main(String[] arg){
        String s = "Hello how are you Contestant";
        int k = 4;
        TruncateSentance obj = new TruncateSentance();
        obj.truncateSentence(s,k);

    }
}
