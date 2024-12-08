package task4;
import java.util.Stack;
import java.util.Scanner;
public class CollectionStack {
    // Stack to store integers
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public CollectionStack() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void push(int value) {
        stack.push(value);
        System.out.println("Pushed " + value + " onto the stack.");
    }

    // Method to pop an element from the stack
    public Integer pop() {
        if (!isEmpty()) {
            int value = stack.pop();
            System.out.println("Popped " + value + " from the stack.");
            return value;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Main method to demonstrate the stack functionalities
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CollectionStack integerStack = new CollectionStack();

        while (true) {
            System.out.println("Stack Menu:");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Check if Stack is Empty");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Push Element
                    System.out.print("Enter an integer to push: ");
                    int value = scanner.nextInt();
                    integerStack.push(value);
                    break;

                case 2: // Pop Element
                    integerStack.pop();
                    break;

                case 3: // Check if Stack is Empty
                    if (integerStack.isEmpty()) {
                        System.out.println("The stack is empty.");
                    } else {
                        System.out.println("The stack is not empty.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
