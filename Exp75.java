import java.util.Scanner;

interface StackInterface {
    void push(int element);
    void pop();
    void display();
}

public class Exp75 implements StackInterface {
    private int[] stack;
    private int top;
    private final int capacity;

    Exp75(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow.");
        } else {
            stack[++top] = element;
            System.out.println("Pushed: " + element);
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow.");
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack contents: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exp75 myStack = new Exp75(5);

        while (true) {
            System.out.println("\nStack Operations Menu");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    myStack.push(element);
                    break;
                case 2:
                    myStack.pop();
                    break;
                case 3:
                    myStack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    
}
