package Stream.Collectors;

import Stream.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class Group {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("seasonal fruit", true, 120),
                new Dish("prawns", false, 300),
                new Dish("rice", true, 350),
                new Dish("chicken", false, 400),
                new Dish("fat meat", false, 1800),
                new Dish("french fries", true, 530));

        Map<Integer, List<Dish>> dishesByCalories = menu.stream().collect(groupingBy(
                (dish) -> {
                    if (dish.getCalories() < 300) return 1;
                    else if (dish.getCalories() <= 700) return 2;
                    else return 3;
                }, filtering(dish -> dish.getCalories() > 350, toList())
        ));
        Map<Integer, List<String>> dishesByCaloriesName = menu.stream().collect(groupingBy(
                (dish) -> {
                    if (dish.getCalories() < 300) return 1;
                    else if (dish.getCalories() <= 700) return 2;
                    else return 3;
                }, mapping(Dish::getDishName, toList())
        ));

        System.out.println(dishesByCalories);
    }
}
