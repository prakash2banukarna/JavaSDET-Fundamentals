package leetcode;
// Prakash solved it
// https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/description/

/* How this problem is solved:
 * 1. Extract digits of n one by one (right to left) via repeated mod/divide by 10.
 * 2. Accumulate their sum in `sumDigit`.
 * 3. Concatenate only the non-zero digits (in original left-to-right order) into `nonZeros`.
 * 4. Return sumDigit * nonZeros (parsed as a long).
 * Edge case: if n < 10, return n * n directly.
 */


public class ConcatenateNonZeroDigitsAndMultiplySum {
    public long sumAndMultiply(int n) {
// int n=10203004;

        if(n<10){
            return n*n;
        }

        long sumDigit=0;
        int temp=n;
        String nonZeros="";
        while(temp>9){
            int lastDigit =temp % 10;
            sumDigit = sumDigit + lastDigit;
            temp=temp/10;

            //Note: the below order is import for input n= 12
            //for nonZeros
            if(lastDigit>0){
                nonZeros = String.valueOf(lastDigit) + nonZeros;
            }

            if(temp<10){
                sumDigit =sumDigit + temp;
                nonZeros = String.valueOf(temp) + nonZeros; // to add last value --NonZeros
            }

        }

        return sumDigit * Long.parseLong(nonZeros);

    }

    public static void main(String[] arg){
//        int n=10203004;
//        int n=2;
        int n=12;
        ConcatenateNonZeroDigitsAndMultiplySum obj = new ConcatenateNonZeroDigitsAndMultiplySum();
        obj.sumAndMultiply(n);
    }
}
