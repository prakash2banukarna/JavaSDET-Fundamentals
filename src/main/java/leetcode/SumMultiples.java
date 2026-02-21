package leetcode;
//Prakash solved it
//https://leetcode.com/problems/sum-multiples/description/

public class SumMultiples {
    public int sumOfMultiples(int n) {
//int n=7;
        int myOutput=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                myOutput=myOutput+i;
            }
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        int n=10;
        SumMultiples obj = new SumMultiples();
        obj.sumOfMultiples(n);
    }
}
