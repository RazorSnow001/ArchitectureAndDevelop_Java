package Stream.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Join {
    /*the join just do one thing . append the small to a larger one !*/
    public static void main(String[] args) {
        List<String> list = Arrays.asList(" ab "," cd "," ef ");
        /*Returns a Collector that concatenates the input elements, separated by the specified delimiter, in encounter order.
         Params:
         delimiter – the delimiter to be used between each element
         Returns:
         A Collector which concatenates CharSequence elements, separated by the specified delimiter, in encounter order*/
        String result = list.stream().map(String::trim).collect(Collectors.joining(","));
        System.out.println(result);
    }
}

