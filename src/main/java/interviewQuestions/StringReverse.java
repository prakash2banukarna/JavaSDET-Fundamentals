package interviewQuestions;

public class StringReverse {

    public static void main(String[] arg){
        String original = "Hello World";
        String rev = new StringBuilder(original).reverse().toString();
        System.out.println(rev);
    }
}
