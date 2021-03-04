public class Cuboid {
    public static void main(String[] args) {
        double length = 8;
        double width = 5;
        double height = 15;


        double SurfaceArea= length * width * height;
        double volume = (5 * length * width) + (5 * length * height) + (2.67 * width * height);

        System.out.println("SurfaceArea: " + SurfaceArea);
        System.out.println("volume: " + volume);


    }
}
