import java.util.*;

public class AppendA{
    public static void main(String... args){
        List<String> far = Arrays.asList("koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill",
                "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn");

        System.out.println(appendA(far));
    }

    public static ArrayList appendA (List input) {
        ArrayList newFar = new ArrayList();

        for (int i = 0; i < input.size() ; i++) {
            newFar.add(input.get(i)+"a");
        }

        return (newFar);
    }
}

//for (String animal : animals} {
//System.out.println(animal);
// - Create an array variable named `animals`
//   with the following content:
//   `["koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill",
//     "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn"]`
//
// - Add an `"a"` at the end of all elements (use a loop!)