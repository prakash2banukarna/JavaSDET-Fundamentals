package leetcode;

public class RepeatedSubStringPattern_NOT_Completed {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length()%2!=0){
            return false;
        }

        char start=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==start){

            }
        }

        System.out.println(false);
        return false;
    }

    public static void main(String[] x){
//        String s = "abab";
        String s="ababab";
        RepeatedSubStringPattern_NOT_Completed obj=new RepeatedSubStringPattern_NOT_Completed();
        obj.repeatedSubstringPattern(s);
    }
}
