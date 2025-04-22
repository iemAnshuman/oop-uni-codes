import Exp6.Exp621;

public class Exp622 extends Exp621 {
    public static void main(String[] args) {
        Exp621 objA = new Exp621();
        Exp622 objB = new Exp622();

        System.out.println("Testing access from class B to methods of class A:");

        System.out.println("\nAccessing public method:");
        objA.publicMethod();

        System.out.println("\nAccessing protected method through inheritance:");
        objB.protectedMethod();

        System.out.println("\nAccessing private method indirectly:");
        objA.callPrivateMethod();

        System.out.println("\nAccess modifier demonstration complete.");
    }

    public void explainResults() {
        System.out.println("\nExplanation of Access Modifiers:");
        System.out.println("1. public: Accessible from anywhere");
        System.out.println("2. protected: Accessible within same package and from subclasses");
        System.out.println("3. default: Accessible only within the same package");
        System.out.println("4. private: Accessible only within the declaring class");
    }
}
