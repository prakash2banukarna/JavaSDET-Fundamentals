package leetcode.Operators_Example;

import java.util.ArrayList;
import java.util.List;
// prakash solved it
// https://leetcode.com/problems/count-distinct-numbers-on-board/description/

/*
for n=5;
  5 % 5, 5 % 4, 5 % 3 , 5 % 2 , 5 % 1
  then n-- so--> 4 % 4 ,4 % 3 , 4 % 2 , 4 % 1
  then n-- s0--> 3 % 3 ,3 % 2 ,3 % 1 ,
  and so on.
 */
public class CountDistinctNumBoard {
    public int distinctIntegers(int n) {
//int n=5;

        List<Integer> outputCount=new ArrayList<>();
        outputCount.add(n); // We know the value n is already on board so added

        int temp=n;
        while(n>0){ //for n=5
            while(temp>0){ //First i implemented this while loop then i introduced the baove while loop to recude the n
                if(n%temp==1 && !outputCount.contains(temp)){
                    outputCount.add(temp);
                }
                temp--;
            }
            n--;
            temp=n;
        }


        System.out.println(outputCount.size());
        return outputCount.size();
    }

    public static void main(String[] arg){
        int n=5;
        CountDistinctNumBoard obj = new CountDistinctNumBoard();
        obj.distinctIntegers(n);
    }
}
