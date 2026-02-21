package concepts;

/*
Method overloading in Java means having multiple methods with the same name in the same class but with different parameter lists (different number, order, or types of parameters).
 The compiler decides at compile time which overloaded method to call based on the arguments you pass.

 Basic idea
-Same method name.
-Different parameter list (this is called a different “method signature”).
-Return type alone is not enough to overload a method; parameters must differ.
-It is a form of compile-time polymorphism.

 */
public class method_overloading_learning {
    // 1. Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // 2. Add three integers (different number of parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3. Add two doubles (different parameter types)
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        method_overloading_learning calc = new method_overloading_learning();

        int sum2 = calc.add(10, 20);        // calls add(int, int)
        int sum3 = calc.add(10, 20, 30);    // calls add(int, int, int)
        double sumD = calc.add(2.5, 3.5);   // calls add(double, double)

        System.out.println(sum2);  // 30
        System.out.println(sum3);  // 60
        System.out.println(sumD);  // 6.0
    }
}
