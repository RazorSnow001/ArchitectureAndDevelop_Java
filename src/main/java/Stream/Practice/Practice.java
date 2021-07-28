package main.java.Stream.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class Practice {
    public static class Trader {
        private final String name;
        private final String city;

        public Trader(String n, String c) {
            this.name = n;
            this.city = c;
        }

        public String getName() {
            return this.name;
        }

        public String getCity() {
            return this.city;
        }

        public String toString() {
            return "Trader:" + this.name + " in " + this.city;
        }
    }

    public static class Transaction {
        private final Trader trader;
        private final int year;
        private final int value;

        public Transaction(Trader trader, int year, int value) {
            this.trader = trader;
            this.year = year;
            this.value = value;
        }

        public Trader getTrader() {
            return this.trader;
        }

        public int getYear() {
            return this.year;
        }

        public int getValue() {
            return this.value;
        }

        public String toString() {
            return "{" + this.trader + ", " +
                    "year: " + this.year + ", " +
                    "value:" + this.value + "}";
        }
    }

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        /* Finds all transactions in 2011 and sort by value (small to high)*/
        List<Transaction> tr2011 =
                transactions.stream()
                        .filter(transaction -> transaction.getYear() == 2011).sorted(comparing(Transaction::getValue)).collect(toList());
        /*What are all the unique cities where the traders work?*/
        List<String> cities = transactions.stream().map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
        Set<String> cities2 =
                transactions.stream()
                        .map(transaction -> transaction.getTrader().getCity())
                        .collect(toSet());
        System.out.println(" hello to your friend !");
        /*Finds all traders from Cambridge and sort them by name*/
        List<Trader> traders =
                transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(trader -> trader.getCity().equals("Cambridge"))
                        .distinct()
                        .sorted(comparing(Trader::getName))
                        .collect(toList());
        /*Returns a string of all traders’ names sorted alphabetically*/
        String traderStr =
                transactions.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(traderStr);
        /*Note that this solution is inefficient (all Strings are repeatedly concatenated, which
        creates a new String object at each iteration). In the next chapter, you’ll see a more
        efficient solution that uses joining() as follows (which internally makes use of a
        StringBuilder)*/
        String traderStrV2 =
                transactions.stream().map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .collect(joining());
        System.out.println(traderStrV2);
        /* Are any traders based in Milan?*/
        boolean milanBased = transactions.stream().anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);
        /*Prints all transactions’ values from the traders living in Cambridge*/
        transactions.stream()
                .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);
        /*What’s the highest value of all the transactions?*/
        Optional<Integer> highestValue =
                transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(Integer::max);
        /* Finds the transaction with the smallest value*/
        Optional<Transaction> smallestTransaction =
                transactions.stream()
                        .reduce((t1, t2) ->
                                t1.getValue() < t2.getValue() ? t1 : t2);
        Optional<Transaction> smallestTransaction2 =
                transactions.stream()
                        .min(comparing(Transaction::getValue));

    }

}
