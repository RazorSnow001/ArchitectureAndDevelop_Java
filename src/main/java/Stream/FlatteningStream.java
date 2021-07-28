package Stream;

import java.util.Arrays;
import java.util.List;

public class FlatteningStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "good", "hero", "global");
        String test = "hello";
        String[] array = test.split("");
        Arrays.stream(array).distinct().forEach(System.out::println);
        System.out.println();
        list.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);
    }
}
