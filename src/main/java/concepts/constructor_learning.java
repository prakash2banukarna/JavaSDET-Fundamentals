package concepts;
/*
A constructor in Java is a special method that runs automatically when you create an object, and its main job is to
initialize that object’s state (fields/variables).


What is a constructor?
- Has the same name as the class.
- Has no return type (not even void).
- Runs automatically when you use new ClassName(...) to create an object.

If you do not write any constructor, Java adds a default no‑arg constructor that just calls super() and leaves fields with their default values (0, null, false, etc.).


 */
public class constructor_learning {

    int marks;
    String name;

    constructor_learning(){ // this is called constructor
        System.out.println("Hello Hi");
    }

    public static void main(String[] arg){
        constructor_learning constructorLearning = new constructor_learning();
        // Tip:Just executing the main method will call line no 20 and print the value.
        System.out.println(constructorLearning.marks); //0
        System.out.println(constructorLearning.name); //null
    }
}
