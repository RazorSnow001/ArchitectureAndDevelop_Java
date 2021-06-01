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
        Comparator<Apple> byWeight = new Comparator<Apple>() {
            public int compare(Apple a1, Apple a2) {
                return a1.getWeight().compareTo(a2.getWeight());
            }
        };

        Collections.sort(list,new HowToUseComparator());
        System.out.println(list);
    }
}
