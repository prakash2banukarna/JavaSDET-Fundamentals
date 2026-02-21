package concepts;

/*
Inheritance in  java is a mechanism where one class (child or subclas) can accurise properties
 and behaviour (fields )  of another class ( parent or super class)

 Types of inheritance :
 - Single inheritance
 - multilevel inheritance (multiple extents )
 - Hierarchical inheritance
 - Hybrid inheritance
 */



class dad{ // here this is acting as a parent/super class
    int money=2000;

}

class Son extends dad{ // here this is acting as a child class / sub class

}

public class inheritance_learning { // main class
    public static void main(String[] arg){
        Son s1 = new Son();
        System.out.println(s1.money); // son is able to inherit dad properties.
    }
}
