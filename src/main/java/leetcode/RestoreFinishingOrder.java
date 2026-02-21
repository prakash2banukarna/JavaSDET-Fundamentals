package leetcode;

import java.util.Arrays;
//Prakash solved it
//https://leetcode.com/problems/restore-finishing-order/description/?envType=problem-list-v2&envId=array
public class RestoreFinishingOrder {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] myOutput =new int[friends.length];


        int i=0; // insert in the finishing order
        for(int j=0;j< order.length;j++){
            for(int z=0;z<friends.length;z++){
                if(order[j]==friends[z]){
                    myOutput[i]=order[j];
                    i++; // maintain the order
                }
            }


        }
        System.out.println(Arrays.toString(myOutput));
        return myOutput;
    }

    public static void main(String[] arg){
        int[] order = {3,1,2,5,4};
        int[] friends = {1,3,4};

        RestoreFinishingOrder obj=new RestoreFinishingOrder();
        obj.recoverOrder(order,friends);

    }
}
