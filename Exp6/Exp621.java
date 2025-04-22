package Exp6;

public class Exp621 {
    public void publicMethod() {
        System.out.println("This is a public method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defaultMethod() {
        System.out.println("This is a default method (package-private)");
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    public void callPrivateMethod() {
        System.out.println("Calling private method from inside class A:");
        privateMethod();
    }
}
