package leetcode.Operators_Example;

public class HappyNumber_NotCompleted {
    public boolean isHappy(int n) {

        int temp=n;
        while(temp>2){
            int digit =temp % 10; // This will always be less than 10, which we need to square
            int qutient= temp/10;

           if(qutient>9){ //If quetient is > 9 , then again this needs to go into while loop
               temp=qutient;
           }
           else{
               int sum=digit * digit + qutient * qutient;
               temp=sum;
           }

        }
        System.out.println(temp);
        if(temp!=1){
            return false;
        }
        return true;

    }

    public static void main(String[] arg){
//        int n=19;
        int n=7;
        HappyNumber_NotCompleted obj = new HappyNumber_NotCompleted();
        obj.isHappy(n);
    }
}
