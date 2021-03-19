package SharpieSet;

public class SharpieMain {
    public static void main(String[] args) {
        SharpieSet sharpies = new SharpieSet();

        Sharpie newSharpie = new Sharpie("Red", 2.45f);
        sharpies.add(newSharpie);
        Sharpie newSharpie2 = new Sharpie("Blue", 2.15f);
        sharpies.add(newSharpie2);
        Sharpie newSharpie3 = new Sharpie("Green", 1.05f);
        sharpies.add(newSharpie3);

        for (int ink = 0; ink < newSharpie.getInkAmount(); ink++) {
            while (newSharpie.getInkAmount() > 0){
                newSharpie.use();
            }
            while (newSharpie2.getInkAmount() > 0) {
                newSharpie2.use();
            }
        }

        System.out.println(sharpies.countUsable());
        System.out.println("--------------------");
        sharpies.removeTrash();
        System.out.println(sharpies.toString());
    }
}
