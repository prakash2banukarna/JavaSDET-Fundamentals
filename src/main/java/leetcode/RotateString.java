package leetcode;
//Prakash solved it
//https://leetcode.com/problems/rotate-string/description/

/*
First find the starting char of goal (i.e start)
Iterate each char of s and see if it matches,
once it matches, take the left side string and append to right .
 */


public class RotateString {
    public boolean rotateString(String s, String goal) {
        // s = "abcde", goal = "cdeab"
        char start=goal.charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==start ){
                String temp=s.substring(i)+s.substring(0,i);
                if(temp.equals(goal)){
                    System.out.println(true);
                    return true;
                }
            }
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] arg){
        String s = "abcde";
        String goal = "cdeab";
        RotateString obj = new RotateString();
        obj.rotateString(s,goal);

    }


}
