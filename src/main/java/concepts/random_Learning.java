package concepts;

import java.util.Random;

public class random_Learning {

    /*
    Generate random numbers between 0 to 10
    While Loop : Runs till the condition is true
     */
    public static void main(String[] arg){

        Random rand =new Random();
        int nums =rand.nextInt(0,1); // start : 0 (included), end = 1 (excluded)
        int nums2 =rand.nextInt(0,10); // start : 0 (included), end = 1 (excluded), range: 0 to 9

        System.out.println(nums2);


    }
}
