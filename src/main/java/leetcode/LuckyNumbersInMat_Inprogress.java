package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInMat_Inprogress {
    public void luckyNumbers(int[][] matrix) {
        int rowLen=matrix.length;
        int columnLen=matrix[0].length;

        for(int r=0;r<rowLen;r++){
            for(int c=0;c<columnLen;c++){
                List minRows =new ArrayList();
                System.out.println(matrix[r][c]);
            }

        }
    }



    public static void main(String[] arg){
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        LuckyNumbersInMat_Inprogress obj=new LuckyNumbersInMat_Inprogress();
        obj.luckyNumbers(matrix);
    }
}
