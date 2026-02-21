package collections_Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Declaration {
    public static void main(String[] arg){

        List<List<String>> items_immutable = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );

        List<List<String>> items_mutable = new ArrayList<>(Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        ));

        //Java 9+ Immutable Option
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );

    }
}
