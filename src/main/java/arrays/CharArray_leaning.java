package arrays;

public class CharArray_leaning {
    //refer JewelsAndStones.java

    public static void main(String[] arg){
        String str = "Hello";

        // Convert String to char array
        char[] ch =str.toCharArray();
        System.out.println("ch" +ch);

        //print each characters
        for(char c:ch){
            System.out.println(c);
        }
    }
}
