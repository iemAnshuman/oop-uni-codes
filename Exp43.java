public class Exp43 {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Exp43 calc = new Exp43();

        System.out.println("Sum of two integers: " + calc.add(10, 20));
        System.out.println("Sum of two doubles: " + calc.add(5.5, 4.3));
        System.out.println("Sum of three integers: " + calc.add(1, 2, 3));
    }
}
