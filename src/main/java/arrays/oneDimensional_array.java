package arrays;

public class oneDimensional_array {
    public static void main(String[] arg){


        // Option 1:
         int obj3[] = new int[3];
         int[] obj4 =new int[4];

         //Add elements into array obj3
        obj3[0]=22;
        obj3[1]=23;
        obj3[2]=24;

        // Option 2:
        //Declaration
        int obj[] ={100,33,23,443,234,4342};
        int[] obj2 ={23,3524,3534,23423,34,23,234};

        // Iterate using simple For loop

        /*
        i<obj2.length
        i<=obj2.length-1
         */
        for(int i=0;i<obj2.length;i++){
            System.out.println("Iterate using simple For loop :" +obj2[i]);
        }

        // Iterate using enhanced For loop
        for (int x : obj){
            System.out.println(" Iterate using enhanced For loop: " +x);
        }



    }
}
