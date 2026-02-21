package interviewQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class nthSmallestElement {
    public static void main(String[] arg){
        List<Integer> elements = List.of(12,4,55,5,8,1,23,123,2);

        int n=3;
// .sorted by default will arrange in ascending order (i.e small to high)
        Optional<Integer> nthSmall=elements.stream().sorted().skip(n-1).findFirst();

        // .sorted by default will arrange in ascending order (i.e small to high)
       Optional<Integer> nthHighest=elements.stream().sorted(Comparator.reverseOrder()).skip(n-1).findFirst();


        System.out.println("smallest number " + nthSmall);
        System.out.println("Highest number " + nthHighest);
    }



}
