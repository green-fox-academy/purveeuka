package Comparable;

public class Thing  implements  Comparable<Thing>{
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Thing o) {
        if (this.completed == o.completed) {
            return 0;
            } else if (this.completed){
            return -1;
        }else {
            return 1;
        }
    }
}
/*
if you haven't got a separate
Todo class, or it doesn't contain fields like description and completed, use your Thing class
 */