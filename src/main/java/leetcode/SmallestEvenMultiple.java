package leetcode;
//Prakash solved it
//https://leetcode.com/problems/smallest-even-multiple/description/

public class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        if(n%2!=0){
            return n*2;
        }
        return n;
    }

    public static void main(String[] a){
        int n=5;
        SmallestEvenMultiple obj=new SmallestEvenMultiple();
        obj.smallestEvenMultiple(n);
    }
}
