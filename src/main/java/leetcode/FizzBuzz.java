package leetcode;

import java.util.ArrayList;
import java.util.List;
// Prakash solved
// https://leetcode.com/problems/fizz-buzz/description/?envType=problem-list-v2&envId=string

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
// n=3;
        List<String> myoutput =new ArrayList<>();
        int i=1;
        while(i<n+1){
            if(i%3==0 && i%5==0){
                myoutput.add("FizzBuzz");
            }
            else if(i%3==0){
                myoutput.add("Fizz");
            }
            else if(i%5==0){
                myoutput.add("Buzz");
            }
            else{
                myoutput.add(String.valueOf(i));
            }
            i++;
        }

        System.out.println(myoutput);
        return myoutput;
    }

    public static void main(String[] arg){
        int n=5;
        FizzBuzz obj = new FizzBuzz();
        obj.fizzBuzz(n);
    }
}
