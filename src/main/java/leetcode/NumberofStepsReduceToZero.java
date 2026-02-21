package leetcode;
//Prakash solved it
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

public class NumberofStepsReduceToZero {
    public int numberOfSteps(int num) {
//int[] num = 14

        int myOutput=0;
        while(num!=0){
            myOutput++;
            if(num%2==0){
                num=num/2;
            }
            else{
                num=num-1;
            }
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
        int num = 14;
        NumberofStepsReduceToZero obj= new NumberofStepsReduceToZero();
        obj.numberOfSteps(num);
    }

}
