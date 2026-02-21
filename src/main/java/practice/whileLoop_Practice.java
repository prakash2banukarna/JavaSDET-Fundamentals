package practice;

import java.util.ArrayList;
import java.util.List;

public class whileLoop_Practice {
    public static void main(String[] arg){

        List<Integer> myResult=new ArrayList<Integer>();

        int nums=100;

        int temp =nums;
        while(temp>9){
            System.out.println(temp);
            myResult.add(temp%10);
            temp=temp/10;

        }
        myResult.add(temp%10);
        System.out.println(myResult);

    }

}
