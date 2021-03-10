import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class WriteMultipleLines {
    public static void main(String[] args) {
        String word = "apple";
        int numberOfLines = 5;
        writeToFile("textFiles/my-file.txt", word, numberOfLines);
    }

    private static void writeToFile( String filepath, String word, int numbers) {
        Path location = Paths.get(filepath);
        try {
            List<String> content = new ArrayList();
            for (int i = 0; i < numbers; i++) {
                content.add(word);
            }Files.write(location,content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// - The path parameter should be a string that describes the location (path & name)
//    of the file you wish to modify.
// - The word parameter should also be a string that will be written to the file as individual lines.
// - The number parameter should describe how many lines the file should have.

// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'.
// The function should not raise any errors if it could not write the file.

