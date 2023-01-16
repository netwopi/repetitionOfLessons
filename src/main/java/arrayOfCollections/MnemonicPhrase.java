package arrayOfCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MnemonicPhrase {
    public static void main(String[] args) {

        String text = "Каждый охотник желает знать, где сидит фазан";

        List<String> colors = Arrays.stream(text.split(",?\\s+")).collect(Collectors.toList());
        Collections.reverse(colors);
        colors.forEach(s -> System.out.print(s + " "));

    }
}
