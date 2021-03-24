package Printable;

public class Todo implements Printable{


    private String task;
    private String priority;
    boolean isDone;

    public Todo(){
    }

    public Todo(String task, String priority, boolean isDone) {
        this.task = task;
        this.priority = priority;
        this.isDone = isDone;
    }

    @Override
    public void printAllFields() {
        System.out.println("Task: " + this.getTask() + " | Priority: " + this.getPriority() + " | Done: " + this.isDone);
    }

    public String getTask() {
        return task;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isDone() {
        return isDone;
    }
}
