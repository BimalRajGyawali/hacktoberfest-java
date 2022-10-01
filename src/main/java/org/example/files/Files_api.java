import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Files_api {

    public static void main(String[] args) {

        Path filePath = Path.of(
                "hactoberfest.txt");

        Stream<String> stream = null;
        try {
            stream = Files.lines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        stream.forEach(System.out::println);

    }

}