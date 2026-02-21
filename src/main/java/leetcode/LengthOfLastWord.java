package leetcode;


//Prakash solved it
//https://leetcode.com/problems/length-of-last-word/description/
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        String[] str=s.split(" "); // " " space is needed - s.split(" ") splits the string wherever it finds a space.

        String myOutput=str[str.length-1];
        System.out.println(myOutput.length());
        return myOutput.length();

    }

    public static void main(String[] arg){
        String s="Hello World";
        LengthOfLastWord obj= new LengthOfLastWord();
        obj.lengthOfLastWord(s);
    }
}
