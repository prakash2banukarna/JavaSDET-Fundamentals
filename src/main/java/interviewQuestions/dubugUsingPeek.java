package interviewQuestions;

import java.util.List;
import java.util.stream.Collectors;


// Question : How to debug usiong peek() ?

public class dubugUsingPeek {
    public static void main(String[] arg){
        List<String> words= List.of("apple","banana","orange","avacado");

        List<String> startsWithA=words.stream()
                .filter(x->x.startsWith("a"))
                .map(y->y.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("Words starts with a: " +startsWithA);


        List<String> startsWithADebugMOde=words.stream()
                .peek(x->System.out.println("Before filter word  :" +x))
                .filter(x->x.startsWith("a"))
                .peek(x->System.out.println("After filter word : " +x))
                .map(y->y.toUpperCase())
                .peek(x->System.out.println("Result after Uppercase  : " +x))
                .collect(Collectors.toList());


    }
}
