import java.util.Arrays;

public class Exp310 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        k = k % arr.length;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + k) % arr.length] = arr[i];
        }

        System.out.println("Rotated array: " + Arrays.toString(rotated));
    }
}
