package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class WithCollect {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 400),
                new Dish("prawns", false, 300),
                new Dish("rice", true, 300),
                new Dish("chicken", false, 400),
                new Dish("french fries", true, 530));
        Map<Integer, List<Dish>> map =
                specialMenu.stream().collect(groupingBy(Dish::getCalories));
        System.out.println();
    }
}
