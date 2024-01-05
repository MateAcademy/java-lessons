package lessons.stream.ex2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "/home/user/dev/java-lessons/src/main/java/lessons/stream/ex2/text.txt";

        Stream<String> lines = null;
        try {
            lines = Files.lines(Path.of(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        lines.forEach(System.out::println);


    }
}
