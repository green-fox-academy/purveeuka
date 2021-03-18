package Animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal monkey = new Animal();
        System.out.println(monkey.eat());
        System.out.println("----------------");
        System.out.println(monkey.drink());
        System.out.println("----------------");
        monkey.play();
    }
}
