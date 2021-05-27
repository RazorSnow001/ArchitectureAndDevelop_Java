import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        int result = execute((a, b, c) -> 60);
        System.out.println(result);
        String txt = processFile((br) ->
                br.readLine() + " " + br.readLine()
        );
        System.out.println(txt);
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("src/data.txt"))) {
            return p.process(br);
        }
    }

    public static int execute(FunctionalInterface functionalInterface) {
        return functionalInterface.test(5, 6, 7);
    }
}
