import java.util.*;

public class SumUnique {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 3, 8, 2, 5));
        HashSet<Integer> unique = new HashSet<>(list);

        int sum = 0;
        for (int val : unique) {
            sum += val;
        }

        System.out.println("Sum of unique values: " + sum);
    }
}
