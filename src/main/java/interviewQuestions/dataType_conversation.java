package interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class dataType_conversation {

    public static void main(String[] arg){
        //convert int to string option 1
        int x=123;
        String y=String.valueOf(x);
        System.out.println("Option 1 - converting int to string :" +y);

        //convert int to string option 2
        String z=Integer.toString(x);
        System.out.println("Option 2 - converting int to string :" +z);

        //convert string to int
        String xx="123456";
        int yy=Integer.valueOf(xx);
        System.out.println("Option 1 - Converting string to int :" +yy);

        //String to list preserving the order option 1

        //Tip : toCharArray() is a String method in Java that converts a String into a new char[] (character array), where each element is one character from the string.


        String x22="234512";
        List<Integer> lst = new ArrayList<>();

        for(char c : x22.toCharArray()){ //preserves order [web:10]
            lst.add(c - '0');  // char digit to int

        }
        //String to list preserving the order option 1
        System.out.println("String to list preserving the order option 1 " +lst); // [1, 2, 3, 4]


        // String to list preserving the order option 2 Using Java 8 streams
        String y22 ="984539354";
        List<Integer> u1=y22.chars().map(c->c-'0').boxed().collect(Collectors.toList());
        System.out.println("String to list preserving the order option 2 using java streams " +u1); // [9, 8, 4, 5, 3, 9, 3, 5, 4]


    }
}
