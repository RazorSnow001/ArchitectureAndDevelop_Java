package main.java.Stream.Reduce;



import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestReduce {
    /*The terminal operations you’ve seen either return a boolean (allMatch and so on),  ---- match ? --- boolean
    void (forEach), or an Optional object (findAny and so on). You’ve also been using     ---- void --- foreach ! Optional object
    findAny ....
    collect to combine all elements in a stream into a List.*/
    /* the reduce is the terminal operation !
    *  what is teh function of the reduce ?
    *  1 that is like the query language ! “Calculate the sum of all calories in the menu"
    *    What is the highest calorie dish in the menu
    *  ---- using the reduce operation. Such
queries combine all the elements in the stream repeatedly to produce a single value
such as an Integer     ----  as reduction operations (a stream
is reduced to a value)   */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 3, 6, 7, 2, 7, 3);
        int sum = numbers.stream().reduce(0, Integer::sum);
        int sum2 = numbers.stream().reduce(0,(a,b)->a+b);
        /* why we need this to do the reduce operation --- because that the reduce() method
        consume BinaryOperator and the T identity, BinaryOperator<T> accumulator  '
         which extends the BiFunction that is an @FunctionalInterface with apply method  R apply(T t, U u);   */

        /*so with the stream and the reduce method we can easily get the sum or the min or max of some number attribute of the object in the stream */
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println(max.get());

    }
}
