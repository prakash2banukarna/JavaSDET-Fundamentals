package leetcode;
// Prakash solved it
// https://leetcode.com/problems/harshad-number/description/
public class HarshadNumber_RePractice {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
//int  x = 18;
        int q=x;
        while(x/10>=10){
            x=x/10;
            q=x;
        }
        int quatent=q/10;
        int r=x%10;
        if(x%(quatent+r)==0){
            System.out.println(quatent+r);
            return quatent+r;
        }
        return -1;
    }

    public static void main(String[] arg){
        int  x = 18;
//        int  x = 100;
        HarshadNumber_RePractice obj =new HarshadNumber_RePractice();
        obj.sumOfTheDigitsOfHarshadNumber(x);

    }
}
