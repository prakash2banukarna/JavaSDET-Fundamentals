package concepts;

public class enhancedForLoop_learning {

    /*
In Java, the enhanced for loop (also called the for-each loop) is a shorter, safer way to iterate over arrays and collections when you only need each element and not its index.

Basic idea
- It removes the need to manage an index or iterator manually.
- It is ideal when you want to visit every element in order and do not need to modify the underlying structure.

Syntax :
for (ElementType element : arrayOrCollection) {
    // use element
}

     */

    public static void main(String[] arg){
        int nums[] ={23,45,67,23,244,654,765}; // created an array

        for(int num:nums){
            System.out.println(num);
        }
    }
}
