package leetcode;
// Prakash solved
// https://leetcode.com/problems/a-number-after-a-double-reversal/description/

/*
- if num is less than 10, then doing double reverse will be same value, so true
- if the last digit of num is 0, then doing double reverse will be not be same value, so false
- to find if the last digit is zero, mod (%) of num == zero , then false.
 */
public class NumberAfterDoubleReversal {
    public boolean isSameAfterReversals(int num) {
// num = 526
        if(num<9){
            return true;
        }
        if(num%10==0){
            return false;
        }

        return true;
    }

    public static void main(String[] arg){
        int num = 526;
        NumberAfterDoubleReversal obj = new NumberAfterDoubleReversal();
        obj.isSameAfterReversals(num);
    }
}
