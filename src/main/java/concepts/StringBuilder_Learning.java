package concepts;

/*
In Java, StringBuilder is a mutable sequence of characters used for efficient string manipulation, especially when you need to build or modify strings in loops.
Basic idea
String is immutable: every modification creates a new object.

StringBuilder is mutable: methods like append, insert, delete, and reverse modify the same underlying buffer, which is faster for repeated changes.

 */
public class StringBuilder_Learning {

    public static void main(String[] arg){
        StringBuilder sb=new StringBuilder();
        sb.append("Hello");
        sb.append(" How are you");
        System.out.println("String builder example : "+sb); //Hello How are you

        // Insert text at index 6
        sb.insert(6,"I am Jo ");
        System.out.println("String builder example after insert : "+sb); //Hello I am Jo How are you

        // Replace a portion of string
        sb.replace(11, 13, "KO"); // "Hello Awesome World"
        System.out.println("String builder example after REPLACE : "+sb); //Hello I am KO How are you

        // Delete characters (remove "am ")
        sb.delete(8, 10);             // "Hello World"
        System.out.println("String builder example after Delete : "+sb); //Hello I  KO How are you

        // Convert back to String
        String result = sb.toString();
        System.out.println("My Result : "+result);

    }
}
