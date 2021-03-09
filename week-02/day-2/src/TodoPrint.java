public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        todoText=todoText.replace("- Buy milk", "My todo:\n " +
                                   "- Buy milk\n - Download games\n   - Diablo" );
        System.out.println(todoText);
    }
}

// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText applying indention

// Expected output:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo