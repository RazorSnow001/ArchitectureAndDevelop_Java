package Lambda.Comparator;

import java.util.Comparator;

public class HowToUseComparator implements Comparator<Apple> {

    @Override
    public int compare(Apple o1, Apple o2) {
        return Integer.parseInt(o2.weight)-Integer.parseInt(o1.weight);
    }
}
