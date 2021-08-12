package Stream;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class GetPair {
    /*
    ! so with the flatMap we can combine the 1 to many pair .
    ? in this example . we have 1 to 1-3 and 1-4
      so with the flatMap to i and to j
    !
    *
    * */
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> pairs =
                numbers1.stream()
                        .flatMap(i -> numbers2.stream()
                                .map(j -> new int[]{i, j})
                        )
                        .collect(toList());

        pairs.forEach(pair -> System.out.println(Arrays.toString(pair)));
       /* numbers1.stream()
                .flatMap(i -> numbers2.stream()
                        .filter(j -> (i + j) % 3 == 0)
                        .map(j -> new int[]{i, j})
                ).forEach(a -> System.out.println("[" + a[0] + "," + a[1] + "]"));
        System.out.println();
        numbers1.stream()
                .flatMap(i -> numbers2.stream()
                        .map(j -> new int[]{i, j})
                ).forEach(a -> System.out.println("[" + a[0] + "," + a[1] + "]"));*/
    }
}
