package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamOnlyOnce {
    public static void main(String[] args) {
        List<String> title = Arrays.asList("Modern", "Java", "In", "Action");
        Stream<String> s = title.stream();
        List<String> result = s.filter((d) -> d.length() > 2).collect(toList());
        System.out.println(result);
        /* s.forEach(System.out::println);*/
        /*s.forEach(System.out::println);*/
    }
}
