package leetcode;
// Prakash solved it
// https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/

public class DivisibleAndNonDivisibleSumDiff {
    public int differenceOfSums(int n, int m) {
//n = 10, m = 3

        int num1Sum=0;
        int num2Sum=0;

        for(int i=1;i<=n;i++){
            if(i%m!=0){ //not divisible by m
                num1Sum=num1Sum + i;
            }
            else{ // divisible by m
                num2Sum= num2Sum + i;
            }
        }


        System.out.println(num1Sum - num2Sum);
        return num1Sum - num2Sum;
    }

    public static void main(String[] arg){
        int n=10;
        int m=3;
        DivisibleAndNonDivisibleSumDiff obj = new DivisibleAndNonDivisibleSumDiff();
        obj.differenceOfSums(n,m);
    }
}
