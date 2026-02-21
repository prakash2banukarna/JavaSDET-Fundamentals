package leetcode;
// Prakash solved it
// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
public class Find1stPalidromicStringArr_RePractice {
    public String firstPalindrome(String[] words) {
//String[] words = ["abc","car","ada","racecar","cool"];

        for(int i=0;i< words.length;i++){
            String temp=words[i];
            int left=0;
            int right=temp.length()-1;
            boolean isPalindrome=true; //this should be inside for loop
            while(left<right){
                if(temp.charAt(left)==temp.charAt(right)){
                    left++;
                    right--;
                }
                else{
                    isPalindrome=false;
                    break;
                }

            }

            if(isPalindrome){
                System.out.println(temp);
               return temp;
            }


        }

        return "";
    }

    public static void main(String[] arg){
        String[] words = {"abc","car","ada","racecar","cool"};
        Find1stPalidromicStringArr_RePractice obj= new Find1stPalidromicStringArr_RePractice();
        obj.firstPalindrome(words);
    }
}
