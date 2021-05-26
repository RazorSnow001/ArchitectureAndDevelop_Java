public class Test {
    public static void main(String[] args) {
        System.out.println(execute((a,b) -> {
            return 60 ;
        }));
    }

    public static int execute(FunctionalInterface functionalInterface) {
        return functionalInterface.test(5, 6);
    }
}
