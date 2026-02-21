package operators;

public class Operator_learning {
    public static void main(String[] args) {

        int dividend = 38;
        int divisor  = 10;

//        int dividend = 3;
//        int divisor  = 10;

        int quotient = dividend / divisor;  // 4
        int remainder = dividend % divisor; // 1

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
