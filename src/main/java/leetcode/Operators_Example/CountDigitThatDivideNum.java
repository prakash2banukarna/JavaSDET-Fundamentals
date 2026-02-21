package leetcode.Operators_Example;
// Prakash solved it
// https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/


public class CountDigitThatDivideNum {

    // Below i googled and got from countDigits_Solution2
    public int countDigits_refined(int num) {
        int count = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;      // Extract the last digit
            if (digit != 0 && num % digit == 0) {
                count++;                // Count if digit divides num evenly
            }
            temp /= 10;                 // Remove the last digit
        }

        System.out.println(count);
        return count;
    }

    public int countDigits_Solution2(int num) {
        //

        if(num<10){
            return 1;
        }
        int myoutput=0;

        int temp =num;
        while(temp>9){
            int remainder=temp % 10;
            int quotient = temp / 10;
            if(num%remainder==0){
                myoutput++;
            }

            if(quotient>9){
                temp=quotient;
            }
            else if(num%quotient==0){
                myoutput++;
                temp=quotient;
            }
        }
        System.out.println(myoutput);
        return myoutput;
    }

    public int countDigits(int num) {
//num = 7
        if(num<10){
            return 1;
        }

        int myOutput=0;
        String[] str=String.valueOf(num).split("");
        for(int i=0;i<str.length;i++){
            int temp=Integer.parseInt(str[i]);
            if(num%temp==0){
                myOutput++;
            }
        }

        System.out.println(myOutput);
        return myOutput;

    }

    public static void main(String[] arg){
//        int num = 7;
        int num = 1248;
        CountDigitThatDivideNum obj = new CountDigitThatDivideNum();
//        obj.countDigits(num);
//        obj.countDigits_Solution2(num);
        obj.countDigits_refined(num);
    }
}
