package Lambda.Comparator;

import java.util.ArrayList;
import java.util.List;

public class MultipleAttributesSort {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple("red", "180"));
        appleList.add(new Apple("red", "170"));
        appleList.add(new Apple("green", "150"));
        appleList.add(new Apple("green", "130"));
        appleList.add(new Apple("red", "150"));
        appleList.add(new Apple("green", "120"));
        appleList.add(new Apple("red", "150"));
        appleList.add(new Apple("green", "190"));
        appleList.add(new Apple("red", "160"));
        appleList.add(new Apple("green", "170"));
        appleList.add(new Apple("red", "175"));
        appleList.sort((Apple o1, Apple o2) -> {
            int compareColor = o1.getColor().compareTo(o2.getColor());
            int compareWeight = o1.getWeight().compareTo(o2.getWeight());
            return (compareColor == 0) ? compareWeight : compareColor;
        });
        System.out.println();

    }
}
