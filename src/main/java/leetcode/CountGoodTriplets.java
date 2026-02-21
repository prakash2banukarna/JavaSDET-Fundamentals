package leetcode;
// Prakash solved it
// https://leetcode.com/problems/count-good-triplets/description/

public class CountGoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
//arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
        int myOutput=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    //Note: This is Absolute differance
                    if(Math.abs(arr[i] - arr[j]) <=a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c){
                        myOutput++;
                    }
                }
            }
        }
        System.out.println(myOutput);
        return myOutput;
    }

    public static void main(String[] arg){
       int[] arr = {3,0,1,1,9,7};
       int a = 7;
       int b = 2;
       int c = 3;
        CountGoodTriplets obj =new CountGoodTriplets();
        obj.countGoodTriplets(arr,a,b,c);
    }
}
