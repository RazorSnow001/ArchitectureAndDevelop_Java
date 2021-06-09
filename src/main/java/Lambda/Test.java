package Lambda;

import Lambda.Comparator.Apple;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class Test {
    public static void main(String[] args) throws IOException {
        int result = execute((a, b, c) -> 60);
        System.out.println(result);
        String txt = processFile((br) ->
                br.readLine() + " " + br.readLine()
        );
        System.out.println(txt);
        ToIntFunction<String> stringToInt =
                (String s) -> Integer.parseInt(s);
        ToIntFunction<String> stringToInt1 =
                Integer::parseInt;
        BiPredicate<List<String>, String> contains =
                List::contains;
        Supplier<Apple> c1 = () -> new Apple();
        Apple a1 = c1.get();
        Function<Integer, Apple> c2 = Apple::new;
        Apple a2 = c2.apply(110);
        Function<Integer, Apple> c3 = (weight) -> new Apple(weight);
        Apple a3 = c3.apply(110);

        List<Integer> weights = Arrays.asList(7, 3, 4, 10);
        List<Apple> apples = map(weights, Apple::new);

    }

    public static List<Apple> map(List<Integer> list, Function<Integer, Apple> f) {
        List<Apple> result = new ArrayList<>();
        for(Integer i: list) {
            result.add(f.apply(i));
        }
        return result;
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("src/data.txt"))) {
            return p.process(br);
        }
    }

    public static int execute(FunctionalInterface functionalInterface) {
        return functionalInterface.test(5, 6, 7);
    }
}
