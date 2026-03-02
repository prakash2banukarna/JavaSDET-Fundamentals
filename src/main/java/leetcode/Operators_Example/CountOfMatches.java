package leetcode.Operators_Example;
// Prakash solved it
// https://leetcode.com/problems/count-of-matches-in-tournament/description/

/*
We always knows its going to be 7/2 = 3 + 1 ==> n=n/2
3/2 = 2 + 1 ==> n=n/2
*/

public class CountOfMatches {

    public int numberOfMatches(int n) {
        //return n-1; This also works
        int count =0;

        while(n>1){
            if(n%2==0){
                count = count + (n/2);
                n=n/2;
            }
            else{
                count = count + (n/2) + 1;
                n=n/2;
            }
        }
        System.out.println(count);
        return count;

    }

    public static void main(String[] arg){
        int n=7;
        CountOfMatches obj = new CountOfMatches();
        obj.numberOfMatches(n);
    }
}
