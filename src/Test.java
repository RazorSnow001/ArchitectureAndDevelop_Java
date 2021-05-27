public class Test {
    public static void main(String[] args) {
        int result = execute((a, b, c) -> 60);
        System.out.println(result);
    }

    public static int execute(FunctionalInterface functionalInterface) {
        return functionalInterface.test(5, 6, 7);
    }
}
