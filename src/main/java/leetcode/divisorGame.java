package leetcode;

public class divisorGame {
    public boolean divisorGame(int n) {
        return n%2==0;
    }

    public static void main(String[] arg){
        int n=2;
        divisorGame obj=new divisorGame();
        obj.divisorGame(n);
    }
}
