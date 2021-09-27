package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<Integer> biggerList = Arrays.asList(2,3,4,5,6);
        System.out.println(list);
        list.addAll(biggerList);
        System.out.println(list);
    }
}
