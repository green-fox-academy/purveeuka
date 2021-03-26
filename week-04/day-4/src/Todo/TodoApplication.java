package Todo;

public class TodoApplication {
    public static void main(String[] args) {
        ToDoList myList;
        myList = new ToDoList(args);
        if(args.length == 0){
            myList.printArgGuide(args);
        } else if (args[0].equals("-l")) {
            myList.listTask();
        } else if (args[0].equals("-a")) {
            myList.addTaskToList();
        } else if (args[0].equals("-r")) {
            myList.removeTask();
        } else if (args[0].equals("-c")) {
            myList.checkTask();
        } else {
            myList.argErrHandling();
        }
    }
}
