import Printable.Domino;
import Printable.Todo;

import java.util.ArrayList;
import java.util.List;

public class PrintableMain {
    public static void main(String[] args) {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(3, 2));

        for (Domino domino:dominoes) {
            domino.printAllFields();
        }

        System.out.println("-------------------------------");

        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo("Buy Milk", "High", true));

        for (Todo todo : todos) {
            todo.printAllFields();
        }
    }
}
