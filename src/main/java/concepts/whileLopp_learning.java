package concepts;

import java.util.Random;

public class whileLopp_learning {

     /*
    Generate random numbers between 0 to 10
    While Loop : Runs till the condition is true

     */

    public static void main(String[] arg){

        Random rand =new Random();
        int num = 0;

        while(num!=5){
            System.out.println("Still in while loop where nums is " + num);
            num=rand.nextInt(10);
        }

    }
}
