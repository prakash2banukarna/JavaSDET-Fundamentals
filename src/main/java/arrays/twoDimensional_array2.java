package arrays;

public class twoDimensional_array2 {
    public static void main(String[] arg){
        int[][] accounts = {{1,5},{7,3},{3,5}};

        int rowLen= accounts.length;
        int columnLen=accounts[0].length;
        System.out.println(rowLen); // 2
        System.out.println(columnLen); // 3
        int myoutput=0;
        for(int r=0;r<rowLen;r++){
            int tempSum=0;
            for(int c=0;c<columnLen;c++){
                System.out.println(accounts[r][c]);
                tempSum=tempSum+accounts[r][c];
            }
            myoutput=Math.max(tempSum,myoutput);

        }
        System.out.println(myoutput);

    }
}
