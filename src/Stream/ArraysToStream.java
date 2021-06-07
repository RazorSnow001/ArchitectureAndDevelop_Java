package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysToStream {
    public static void main(String[] args) {
        String test = "goodBallMovement!";
        String[] testArray = test.split("");
        Stream<String> testStream = Arrays.stream(testArray);
        testStream.forEach(System.out::printf);
    }
}
