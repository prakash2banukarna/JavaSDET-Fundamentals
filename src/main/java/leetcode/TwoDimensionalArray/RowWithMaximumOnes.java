package leetcode.TwoDimensionalArray;
// Prakash solved it
// https://leetcode.com/problems/row-with-maximum-ones/description/
public class RowWithMaximumOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
//mat = [[0,0,0],[0,1,1]]

        int rowLen=mat.length;
        int colLen= mat[0].length;
        int maxOnesRow=0;
        int maxOnesIndex=0;
        for(int i=0;i<rowLen;i++){
            int onesCount=0; // Creating a temp variable to store the max ones
            for(int j=0;j<colLen;j++){
                if(mat[i][j]==1){ //Step 1: counting the  ones in each row
                    onesCount++;
                }
            }

            if(onesCount>maxOnesRow){ // Step 2: checking if maxOnesRow is greter than  onesCount (temp variable)
                maxOnesRow=onesCount;
                maxOnesIndex=i; //If maxOnesRow found, then update the respective index
            }


        }
        System.out.println("maxOnesIndex " +maxOnesIndex);
        System.out.println("maxOnesRow " +maxOnesRow);

        return new int[]{maxOnesIndex,maxOnesRow}; //remember this line

    }

    public static void main(String[] arg){
        int[][] mat = {{0,0,0},{0,1,1}};
        RowWithMaximumOnes obj = new RowWithMaximumOnes();
        obj.rowAndMaximumOnes(mat);
    }
}
