package Stream;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class UsingMap {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120),
                new Dish("prawns", false, 300),
                new Dish("rice", true, 350),
                new Dish("chicken", false, 400),
                new Dish("french fries", true, 530));
        specialMenu.stream().map(Dish::getDishName).forEach(System.out::println);

        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(toList());
        for (Integer integer :
                wordLengths) {
            System.out.println(integer);
        }

    }
}
