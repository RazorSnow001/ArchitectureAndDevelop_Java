package Stream;

import static java.util.stream.LongStream.iterate;

public class InfiniteStream {
    public static void main(String[] args) {
        long sum = iterate(1L, i -> i + 3)
                .limit(5)
                .reduce(0L, Long::sum);
        System.out.println(sum);
    }
}
