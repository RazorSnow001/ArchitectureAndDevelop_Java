package Lambda.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Apple> list = new ArrayList<>();
        list.add(new Apple("red", "180"));
        list.add(new Apple("green", "150"));
        list.add(new Apple("green", "170"));
        list.add(new Apple("green", "130"));
        list.add(new Apple("green", "120"));
        list.add(new Apple("green", "190"));
        Comparator<Apple> byWeight = (Apple o1, Apple o2) -> Integer.parseInt(o2.getWeight()) - Integer.parseInt(o1.getWeight());
        Collections.sort(list,byWeight);
        System.out.println(list);
    }
}
