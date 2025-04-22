import java.util.*;

public class UniqueNames {
    public static void main(String[] args) {
        String[] names = {"Aman", "Varchasv", "Divyansh", "Varchasv", "Aman"};
        HashSet<String> unique = new HashSet<>(Arrays.asList(names));

        if (unique.contains("Aman")) {
            System.out.println("Aman is in the set");
        }

        for (String name : unique) {
            System.out.println(name);
        }
    }
}
