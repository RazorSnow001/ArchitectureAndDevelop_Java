package Map;

import java.util.Map;

import static java.util.Map.entry;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> favouriteMovies
                = Map.ofEntries(entry("Raphael", "Star Wars"),
                entry("Cristina", "Matrix"),
                entry("Olivia", "James Bond"));
        favouriteMovies
                .entrySet()
                .stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(System.out::println);
        Map<Integer, Integer> numberMap = Map.ofEntries(entry(5, 1), entry(3, 6), entry(7, 9));
        numberMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(System.out::println);
        numberMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(System.out::println);
    }
}
