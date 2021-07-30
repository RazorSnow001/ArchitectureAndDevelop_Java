package Stream.GroupBy;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestGroup {

    public static class Operator {
        private Integer id;
        private Integer number;
        private Integer contactNumber;

        public Operator(Integer id, Integer number, Integer contactNumber) {
            this.id = id;
            this.number = number;
            this.contactNumber = contactNumber;
        }

        @Override
        public String toString() {
            return "Operator{" +
                    "id=" + id +
                    ", number=" + number +
                    ", contactNumber=" + contactNumber +
                    '}';
        }
    }

    public static class Summary {
        private Integer id;
        private Integer contactNumber;
        private List<Detail> detailList;

        public Summary(Integer id, Integer contactNumber, List<Detail> detailList) {
            this.id = id;
            this.contactNumber = contactNumber;
            this.detailList = detailList;
        }
    }

    public static class Detail {
        private Integer id;
        private Integer number;

        public Detail(Integer id, Integer number) {
            this.id = id;
            this.number = number;
        }
    }

    public static void main(String[] args) {


        Detail d1 = new Detail(1, 131);
        Detail d2 = new Detail(2, 141);
        Detail d3 = new Detail(3, 151);
        Detail d4 = new Detail(4, 161);

        List<Detail> list1 = new ArrayList<>();
        list1.add(d1);
        list1.add(d2);

        List<Detail> list2 = new ArrayList<>();
        list2.add(d3);
        list2.add(d4);

        Summary s1 = new Summary(5, 212, list1);
        Summary s2 = new Summary(6, 234, list2);

        List<Summary> summaryList = new ArrayList<>();
        summaryList.add(s1);
        summaryList.add(s2);

        Operator o1 = new Operator(7, 131, 212);
        Operator o2 = new Operator(8, 141, 212);
        Operator o3 = new Operator(9, 151, 234);
        Operator o4 = new Operator(10, 161, 234);

        List<Operator> operatorList = new ArrayList<>();
        operatorList.add(o1);
        operatorList.add(o2);
        operatorList.add(o3);
        operatorList.add(o4);

        /*Map<Pair, List<Operator>> map = operatorList.stream().collect(Collectors.groupingBy(o -> org.apache.commons.lang3.tuple.Pair.of(o.contactNumber, o.number)));*/
        Map<Pair, Operator> map2 = operatorList.stream().collect(Collectors.toMap(o -> Pair.of(o.contactNumber, o.number), Function.identity()));
        summaryList.forEach(s -> s.detailList.forEach(d -> {
            Operator operator = map2.get(Pair.of(s.contactNumber, d.number));
            System.out.println(operator.toString());
        }));
        System.out.println(map2);
    }

}
