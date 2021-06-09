package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CountWithCollect {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120),
                new Dish("prawns", false, 300),
                new Dish("rice", true, 350),
                new Dish("chicken", false, 400),
                new Dish("french fries", true, 530));
        Optional<Integer> result = specialMenu.stream().map(Dish::getCalories).collect(Collectors.maxBy((d1, d2)->d1.compareTo(d2)));
        System.out.println(result.isPresent());

    }


}
