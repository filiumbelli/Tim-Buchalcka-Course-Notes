package PredicatesSuppliersLambdaFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Examples {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("h11", "p51", "h15", "p52", "p50", "a15", "t15", "g15", "p11", "p12");

        ArrayList<String> pNumbers = new ArrayList();
        numbers.forEach(number -> {
            if (number.toUpperCase().startsWith("P")) {
                pNumbers.add(number);
            }
        });

        // sort the values by using compareTo
        pNumbers.sort(String::compareTo);
        // print the values by using sout
        pNumbers.forEach(System.out::println);
        System.out.println("------------------------------------");
        numbers.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("P"))
                .sorted()
                .forEach(System.out::println);

    }
}
