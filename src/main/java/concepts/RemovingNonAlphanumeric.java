package concepts;

import java.sql.SQLOutput;
// ^ --> shift(up arrow) + 6
// Removing non-alphanumeric characters from string
public class RemovingNonAlphanumeric {
    public static void main(String[] args) {
        String S = "A man, a plan, a canal: Panama";
        String finalOutput=S.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(finalOutput);
    }
}
