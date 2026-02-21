package leetcode;

import java.util.Arrays;
//Prakash solved it
//https://leetcode.com/problems/apple-redistribution-into-boxes/description/

public class AppleRedistribution {

    public int minimumBoxes(int[] apple, int[] capacity) {
//apple = [1,3,2], capacity = [4,3,1,5,2]

//        for(int x:apple){
//            applesize=applesize+x;
//        }

        int applesize=Arrays.stream(apple).sum(); //Can also use streams
        Arrays.sort(capacity); //Since its from ascending order, for loop should iterate reverse


        int capacityNeeded=0;
        int box=0;
        for(int i=capacity.length-1;i>=0;i--){
            capacityNeeded=capacityNeeded + capacity[i];
            box++;

            if(capacityNeeded>=applesize){
                System.out.println(box);
                return box;

            }


        }
        return box;


    }

    public static void main(String[] a){
        //apple = [1,3,2], capacity = [4,3,1,5,2]
        int[] apple={1,3,2};
        int[] capacity={4,3,1,5,2};
        AppleRedistribution obj= new AppleRedistribution();
        obj.minimumBoxes(apple,capacity);

    }



}
