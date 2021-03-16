import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        decrypt("src/textFiles/Reversed-order.txt");
        // Create a method that decrypts reversed-order.txt
    }
    public static void decrypt (String fileName) {
        try {
            Path file = Paths.get(fileName);
            List<String> lines = Files.readAllLines(file);
            List<String> reversedLines = new ArrayList<>();
            for (int i = 0; i < lines.size(); i++) {
                reversedLines.add(lines.get(lines.size()- i -1));
            }
            Files.write(file, reversedLines);
        } catch (IOException e) {
            System.out.println("Can't open file");
        }
    }

}
