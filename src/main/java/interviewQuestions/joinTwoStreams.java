package interviewQuestions;

import javax.xml.transform.stream.StreamSource;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

//Question 3: Merge two list and sort them into single sorted list
public class joinTwoStreams {

    public static void main(String[] arg){
        List<Integer> numbersLst1 = List.of(18,33,55,66,12,612,157,1,9811,17);
        List<Integer> numbersLst2 = List.of(218,343,554,662,132,612,1357,12,29811,127);

        Stream<Integer> combinaedStream =Stream.concat(numbersLst1.stream(),numbersLst2.stream());
        List<Integer> lstSorted =combinaedStream.sorted().toList();

        lstSorted.forEach(System.out::println);

    }
}
