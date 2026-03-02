package leetcode.Operators_Example;
// Prakash solved it
// https://leetcode.com/problems/number-of-common-factors/description/


public class NumberOfCommonFactors {
    public int commonFactors(int a, int b) {
// a = 12, b = 6

        int minNum=Math.min(a,b); // Finding the minimum numbers between the given two ints, so can check from 0 to minNum % == 0
        int count=0;
        for(int i=1;i<=minNum;i++){
            if(a % i==0){ // Checking if the condition satifies for 1 int first
                if(b % i==0){
                    count++;
                }
            }
        }

        System.out.println(count);
        return count;
    }

    public static void main(String[] arg){
        int a = 12;
        int b = 6;
        NumberOfCommonFactors obj=new NumberOfCommonFactors();
        obj.commonFactors(a,b);

    }
}
