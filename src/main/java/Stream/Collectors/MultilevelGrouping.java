package Stream.Collectors;

import Stream.Examples.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class MultilevelGrouping {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("seasonal fruit", true, 120),
                new Dish("prawns", false, 300),
                new Dish("rice", true, 350),
                new Dish("chicken", false, 400),
                new Dish("fat meat", false, 1800),
                new Dish("french fries", true, 530));
        /*we want to group the menu according to both the isVeg and Calories ! */
        Map<Boolean, Map<Integer, List<Dish>>> result = menu.stream().collect(
                groupingBy(Dish::isVegetables, groupingBy(
                        (dish) -> {
                            if (dish.getCalories() < 300) return 1;
                            else if (dish.getCalories() <= 700) return 2;
                            else return 3;
                        }
                ))
        );
        System.out.println();
    }
}
