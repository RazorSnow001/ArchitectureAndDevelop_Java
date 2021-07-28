package Stream.Collectors;

import Stream.Dish;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;



public class Collectors {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120),
                new Dish("prawns", false, 300),
                new Dish("rice", true, 350),
                new Dish("chicken", false, 400),
                new Dish("french fries", true, 530));
        int totalCalories = specialMenu.stream().map(Dish::getCalories).reduce(0, (i, j) -> i + j);
        Optional<Dish> mostCalorieDish =
                specialMenu.stream().reduce((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2);
     /*   Map<Dish.Type, List<Dish>> caloricDishesByType =
                menu.stream()
                        .collect(groupingBy(Dish::getType,
                                filtering(dish -> dish.getCalories() > 500, toList())));*/
        System.out.println(totalCalories);
        System.out.println(mostCalorieDish);
    }
}
