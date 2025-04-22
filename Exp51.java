class SuperClass {
    private int privateVar = 10;
    
    public void displayPrivateVar() {
        System.out.println("Private variable value: " + privateVar);
    }
}
class SubClass extends SuperClass {
    public void tryToAccessPrivate() {
        System.out.println("Accessing through superclass method:");
        displayPrivateVar();
    }
}

public class Exp51 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.tryToAccessPrivate();
    }
}