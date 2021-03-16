import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class Doubled {
    public static void main(String[] args) {
        decryptText("src/textFiles/duplicated-chars.txt");
    }
    // Create a method that decrypts the duplicated-chars.txt.
    // Decryption is the process reversing an encryption, i.e. the process
    // which converts encrypted data into its original form.

    public static void decryptText (String fileName) {
        ArrayList<String> decryptedLines = new ArrayList<>();
        try {
            Path filepath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(filepath);
            for (int chars = 0; chars < lines.size(); chars++) {
                String temporary = lines.get(chars);
                String temporary2 = "";
                for (int j = 0; j < temporary.length() ; j++) {
                    if (j % 2 == 0)
                        temporary2 = temporary2 + (temporary.charAt(j));
                } decryptedLines.add(chars, temporary2);
            }
            Files.write(filepath, decryptedLines);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}


