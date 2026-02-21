package interviewQuestions;

import java.util.stream.IntStream;

public class palindromeFinder {
    public static void main(String[] arg) {
        String myName = "madam";
        System.out.println(myName.length() / 2);

        boolean ispalindrome = IntStream.
                range(0, myName.length() / 2)
                .allMatch(i -> myName.toUpperCase().charAt(i) == myName.charAt(myName.length()-1 - i));
        System.out.println(ispalindrome);
    }
}
