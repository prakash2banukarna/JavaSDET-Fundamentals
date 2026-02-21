package leetcode;
//Prakash solved it
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
public class FindIndexFirstOcc {
    public int strStr(String haystack, String needle) {
        //String haystack = "sadbutsad";
        //String needle = "sad";
        char start=needle.charAt(0);
        int needleLen=needle.length();
        int myOutput=-1;

        if(haystack.length()<needleLen){
            return -1;
        }

        for(int i=0;i<haystack.length();i++){
            //haystack.substring(i,i+needleLen).equals(needle) this needed so that it checks from the point to the target length
            /*
             i+needleLen<=haystack.length() is needed for below input
              String haystack = "mississippi"; String needle = "issipi";
              where i=7 and i+needleLen =6 ==> haystack.substring(i,i+needleLen) -> will get index outof bound exception
             */
            if(i+needleLen<=haystack.length() && haystack.charAt(i)==start && haystack.substring(i,i+needleLen).equals(needle)){
                return i;

            }
        }
        return myOutput;

    }

    public static void main(String[] a){
//        String haystack = "sadbutsad";
//        String needle = "sad";
//        String haystack = "hello";
//        String needle = "ll";
//        String haystack = "aaa";
//        String needle = "ll";
        String haystack = "mississippi";
        String needle = "issipi";

        FindIndexFirstOcc obj=new FindIndexFirstOcc();
        obj.strStr(haystack,needle);

    }
}
