package Lambda;

import java.io.BufferedReader;
import java.io.IOException;

@java.lang.FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader b) throws IOException;
}
