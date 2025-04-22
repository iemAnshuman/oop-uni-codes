public class Exp37 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            char symbol = (i % 2 == 0) ? '#' : '?';

            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
