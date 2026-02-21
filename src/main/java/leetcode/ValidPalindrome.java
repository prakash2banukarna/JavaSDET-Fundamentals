package leetcode;
//Prakash solved it
// https://leetcode.com/problems/valid-palindrome/description/?envType=problem-list-v2&envId=string

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String onlyAlphNum=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(onlyAlphNum);
        int left=0;
        int right =onlyAlphNum.length()-1;
        while (left < right){
            if(onlyAlphNum.charAt(left)==onlyAlphNum.charAt(right)){
                left++;
                right--;
            }
            else{
                System.out.println("false");
                return false;
            }

        }
        System.out.println("True");
        return true;
    }

    public static void main(String[] arg){
        String s = "race a car";
        ValidPalindrome obj=new ValidPalindrome();
        obj.isPalindrome(s);

    }
}
