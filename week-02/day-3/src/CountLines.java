import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        String fileName = "textFiles/my-file.txt";
        System.out.println(lines(fileName));
    }

    public static int lines(String fileName) {
        int lineNumber = 0;
        try {
            Path filePath= Paths.get("src/my-file.txt");
            List<String> lines = Files.readAllLines(filePath);
            lineNumber = lines.size();
        }
        catch(Exception e) {
        }
        return lineNumber;
    }
}
// Write a function that takes a filename as string as a parameter
// and returns the number of lines the file contains.
// It should return zero if it can't open the file
// and should not raise any error.
