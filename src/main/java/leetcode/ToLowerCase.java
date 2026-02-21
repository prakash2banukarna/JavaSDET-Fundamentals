package leetcode;
// Prakash solved it
// https://leetcode.com/problems/to-lower-case/description/


public class ToLowerCase {
    public String toLowerCase(String s) {
//s = "Hello"
        System.out.println(s.toLowerCase());
        return s.toLowerCase();
    }

    public static void main(String[] arg){
        String s = "Hello";
        ToLowerCase obj = new ToLowerCase();
        obj.toLowerCase(s);
    }
}
