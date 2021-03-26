package Todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ToDoList{
    private String args[];
    private Path taskList = Paths.get("src/Todo/TextFiles/Task1.txt");

    boolean isThereArgs(String[] args) {
        this.args = args;
        return (args.length > 0);
    }

    boolean areThereTwoArgs(String[] args) {
        this.args = args;
        return (args.length > 1);
    }

    public ToDoList(String[] args) {
        this.args = args;
    }

    public  void printArgGuide(String[] args){
        this.args = args;
        Path usageDesc = Paths.get("src/Todo/TextFiles/UsageDescription.txt");
        List<String> guide;
        try {
            guide = Files.readAllLines(usageDesc);
            if (!isThereArgs(this.args)) {
                for (String line : guide) {
                    System.out.println(line);
                }
                System.out.println();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void listTask() {
        List<String> tasks;
        try {
            if (isThereArgs(args) && args[0].length() < 3 && args[0].contains("-l")) {
                tasks = Files.readAllLines(taskList);
                if (tasks.size() == 0) {
                    System.out.println("No todos for today! :)");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + " - " + tasks.get(i));
                    }
                    System.out.println();
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void addTaskToList() {
        List<String> list;
        try {
            if (args[0].contains("-a") && args[0].length() < 3) {
                if (areThereTwoArgs(args)) {
                    list = Files.readAllLines(taskList);
                    list.add(args[1]);
                    Files.write(taskList, list);
                } else {
                    System.out.println("Unable to add: No task provided");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void removeTask() {
        List<String> list;
        try {
            int index;
            list = Files.readAllLines(taskList);
            if (args[0].contains("-r") && args[0].length() < 3) {
                System.out.println();
                if (args[0].contains("-r") && args.length < 2) {
                    System.out.println("Unable to remove: no index provided");
                } else if (list.size() < Integer.parseInt(args[1])) {
                    System.out.println("Unable to remove: index is out of bound");
                } else if (areThereTwoArgs(args)) {
                    index = Integer.parseInt(args[1]);
                    list.remove(index - 1);
                    Files.write(taskList, list);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            System.out.println("Unable to remove: index is not a number ");
        }
    }

    public void checkTask() {
        List<String> tasks;

        try {
            tasks = Files.readAllLines(taskList);
            if (areThereTwoArgs(args) && args[0].length() < 3 && args[0].contains("-c")) {
                for (int i = 0; i < tasks.size(); i++) {
                    if (!tasks.get(i).startsWith("[")) {
                        tasks.set(i, "[ ] " + tasks.get(i));
                    }
                    if ((i + 1) == Integer.parseInt(args[1])) {
                        tasks.set(i, tasks.get(i).charAt(0) + "x" + tasks.get(i).substring(2));
                    }
                }
                Files.write(taskList, tasks);
            }
            if (args[0].contains("-c") && args.length < 2) {
                System.out.println("Unable to check: no index provided");
            } else if (tasks.size() < Integer.parseInt(args[1])) {
                System.out.println("Unable to check: index is out of bound");
            }

        }
        catch (IOException ex) {
            ex.printStackTrace();
        }catch (Exception e) {
            System.out.println("Unable to check: index is not a number ");
        }
    }

    public void argErrHandling() {
        if (args.length == 0 || !args[0].startsWith("-")) {
            System.out.println("Unsupported argument");
        }
    }
}
