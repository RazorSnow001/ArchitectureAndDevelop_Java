package Stream;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class UsingTakeWhile {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120),
                new Dish("prawns", false, 300),
                new Dish("rice", true, 350),
                new Dish("chicken", false, 400),
                new Dish("french fries", true, 530));
         specialMenu.stream()
                .filter(dish -> dish.getCalories() < 320)
                .forEach((dish)-> System.out.println(dish.getDishName()));
        specialMenu.stream()
                .takeWhile(dish -> dish.getCalories() < 320)
                .forEach((dish)-> System.out.println(dish.getDishName()));
        specialMenu.stream()
                .dropWhile(dish -> dish.getCalories() < 320)
                .forEach((dish)-> System.out.println(dish.getDishName()));
    }
}
