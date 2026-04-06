package operators;

public class OperatorsDigitsSum {
    public static void main(String[] arg){

        int num = 1552;        // Input number (1+5+5+2 = 13)

        int sumDigits = 0;
        int temp = num;

        while(temp > 9){                            // Loop until one digit remains
            sumDigits += (temp % 10);               // Extract last digit, add to sum
            temp = temp / 10;                       // Remove last digit

            if(temp < 10){                          // If remaining is single digit
                sumDigits += temp;                  // Add it directly (loop won't catch it)
            }
        }

        System.out.println("SumDigits is : " +sumDigits);

    }
}
