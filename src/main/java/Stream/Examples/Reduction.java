package Stream.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduction {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,9,10,55,2);
        int result = numbers.stream().reduce(0,Integer::sum);
        System.out.println(result);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println(max);
    }
}
