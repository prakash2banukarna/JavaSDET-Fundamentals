package arrays;

public class twoDimensional_array {
    public static void main(String[] arg){



        // Option 1
        int obj6[][] = new int[3][2]; // int[3 - row][2 - column]

        obj6[0][0]=12;
        obj6[0][1]=22;

        obj6[1][0]=290;
        obj6[1][1]=82;

        obj6[2][0]=72;
        obj6[2][1]=26;


        // Option 2

        int obj5[][] = {
                {12,2},
                {33,5},
                {66,4}
        };

        System.out.println("Row/Length of two dimensional array :" +obj5.length); // Number of rows/length = 3
        System.out.println("Column of two dimensional array :" +obj5[0].length); // Number of column = 2

        int rowLenght=obj5.length;
        int columnLength=obj5[0].length;

        // Iterate using simple For loop
        for (int r =0; r<rowLenght;r++){
            for(int c=0;c<columnLength;c++){
                System.out.println(obj5[r][c]);
            }
        }

        // Iterate using Enhanced For loop

        /*
        Blue print of Enhanced for loop

        obj5 : will represent the entrie two dimentional array
        singleDimentionalObj[] : represents single dimentional array i.e {12,2}
        value : fetches each value from single dimentional array
         */

        for(int singleDimentionalObj[] : obj5){
            for(int value:singleDimentionalObj){
                System.out.println("Enhanced for loop - Value of two dimentional array :" +value);
            }
        }


    }
}
