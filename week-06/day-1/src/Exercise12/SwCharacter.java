package Exercise12;

import java.util.regex.Pattern;

public class SwCharacter {
    private static final Pattern numPattern = Pattern.compile("^[0-9]+$");
    private static final Pattern datePattern = Pattern.compile("^[0-9]+BBY$");
    private final String name;
    private final int height;
    private final int mass;
    private final String gender;
    private final int age;

    public SwCharacter(String line) {
        String[] data = line.split(";");
        this.name = data[0];
        this.height = numValidator(data[1]);
        this.mass = numValidator(data[2]);
        this.gender = genderValidator(data[7]);
        this.age = dateValidator(data[6]);
    }

    private int dateValidator(String data) {
        return (datePattern.matcher(data).find()) ? (Integer.parseInt(data.replace("BBY", ""))) : (1);
    }

    private String genderValidator(String data) {
        return (data.equals("male") || data.equals("female") ? data : "other");
    }

    private int numValidator(String data) {
        return numPattern.matcher(data).find() ? Integer.parseInt(data) : 1;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + " years old " + this.gender + ", Height: " + this.height + "cm Mass: " + this.mass + "kg";
    }

    public int getHeight() {
        return height;
    }

    public int getMass() {
        return mass;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
