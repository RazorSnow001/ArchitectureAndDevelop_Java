package Stream;

import java.util.Arrays;
import java.util.List;

public class SkippingElements {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120),
                new Dish("prawns", false, 300),
                new Dish("rice", true, 350),
                new Dish("chicken", false, 400),
                new Dish("french fries", true, 530));
        specialMenu.stream().filter(d->d.getCalories()>200).skip(2).forEach((dish)-> System.out.println(dish.getCalories()));
    }
}
