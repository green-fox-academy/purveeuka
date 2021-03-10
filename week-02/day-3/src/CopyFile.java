import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        String file1 = "my-file1.txt";
        String file2 = "my-file2.txt";
        String word = "This is my file to be copied";
        int numberOfLines = 10;
        writeToFile("my-file1.txt", word, numberOfLines);
        System.out.println(fileCopier(file1, file2));
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

    private static boolean fileCopier(String copyFrom, String copyTo) {
        try {
            Path location = Paths.get(copyFrom);
            Path location2 = Paths.get(copyTo);
            Files.copy(location, location2);
            return true;
        } catch (IOException e){
            return false;
        }
    }
}
// Write a function that copies the contents of a file into another file
// It should take two filenames (string) as parameters:
//  - path and name of the source file
//  - path and name of the target file
// It should return a boolean that shows if the copy was successful
