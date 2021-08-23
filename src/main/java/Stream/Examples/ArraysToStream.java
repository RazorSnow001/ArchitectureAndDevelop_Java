package Stream.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArraysToStream {
    public static void main(String[] args) {
        String test = "goodBallMovement!";
        String[] testArray = test.split("");
        Stream<String> testStream = Arrays.stream(testArray);
        testStream.forEach(System.out::printf);
        List<String> words = Arrays.asList("We", "like", "basketball", "football", "baseball", "and", "so", "on");
        System.out.println();
        words.stream().map(word -> word.split("")).flatMap(Arrays::stream).distinct().forEach(System.out::printf);
    }
}
