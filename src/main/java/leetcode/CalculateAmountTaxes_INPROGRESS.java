package leetcode;

import java.util.Arrays;

public class CalculateAmountTaxes_INPROGRESS {
    public void calculateTax(int[][] brackets, int income) {
//brackets = [[3,50],[7,10],[12,25]], income = 10

        int rowLen=brackets.length;
        int columnLen=brackets[0].length;

        int[] rows=new int[rowLen];
        int[] columns=new int[rowLen];

        for(int x=0;x<rowLen;x++){
            rows[x]=brackets[x][0]; // hardcode to [0] for rows
            for(int y=0;y<columnLen;y++){
                columns[x]=brackets[x][1]; // hardcode to [0] for columns
            }
        }
        System.out.println(Arrays.toString(rows));
        System.out.println(Arrays.toString(columns));
    }

    public static void main(String[] r){
        int[][] brackets = {{3,50},{7,10},{12,25}};
        int income = 10;
        CalculateAmountTaxes_INPROGRESS obj= new CalculateAmountTaxes_INPROGRESS();
        obj.calculateTax(brackets,income);
    }


}
