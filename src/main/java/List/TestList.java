package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<Integer> biggerList = Arrays.asList(2,3,4,5,6);
        list.addAll(biggerList);
        List<Integer> list2 = Arrays.asList(3,2);
        List<List<Integer>> test = new ArrayList<>();
        test.add(list);
        test.add(list2);
        List<Integer> longeestIncreaseSubsequence = test.stream()
                .max(Comparator.comparingInt(List::size)).get();
        System.out.println(longeestIncreaseSubsequence);
    }
}
