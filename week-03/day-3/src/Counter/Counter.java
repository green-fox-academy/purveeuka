package Counter;

public class Counter {
    int field;
    int initial;

    public Counter(int field) {
        this.field = field;
        this.initial = field;
    }
    public Counter(){
        this(0);
    }
    public void add(int number){
        field = field + number;
    }
    public void add(){
        this.field++;
    }
    public int get() {
        return field;
    }
    public void reset(){
        this.field = this.initial;
    }
}

/*
    Create Counter.Counter class
which has a counter (integer) field
        at creation it should have a default value 0 or can be specified by a parameter
        we can add another whole number to this counter: add(number)
        we can just increase the counter's value by one: add() (no parameters)
        we can get() the current counter value
        and we can reset() the counter to the initial value
 */