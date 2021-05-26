public class Test {
    public static void main(String[] args) {
        System.out.println(test((a, b) -> {
            return a + b ;
        }));
    }

    public static int test(FunctionalInterface functionalInterface) {
        return functionalInterface.test(5, 6);
    }
}
