package Map;

import java.util.Map;

import static java.util.Map.entry;

public class getOrDefault {
    public static void main(String[] args) {
        Map<String,String> favouriteMovies =
                Map.ofEntries(entry("Raphael","Star Wars"),entry("Olivia","James Bond"));
        System.out.println(favouriteMovies.getOrDefault("Raphael","WTF"));
        System.out.println(favouriteMovies.getOrDefault("Nancy","WTF"));
    }
}
