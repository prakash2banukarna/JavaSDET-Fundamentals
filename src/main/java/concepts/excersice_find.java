package concepts;

import java.util.Scanner;

public class excersice_find {

    String evenorodd(int num){
        String xxx="";
        if(num%2==0){
            xxx="Even number";
        }
        else{
            xxx="Odd number";
        }
        return xxx;
    }

    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        excersice_find excersiceFind = new excersice_find();
        String result=excersiceFind.evenorodd(num);
        System.out.println("Result :" +result);

    }
}
