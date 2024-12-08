package task4;
import java.util.HashMap;
import java.util.Scanner;

public class Solution4 {

    private HashMap<String, Integer> studentGrades;

    public Solution4() {          //Constructor
        studentGrades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }

    public void removeStudent(String name) {
        studentGrades.remove(name);
    }

    public int getGrade(String name) {
        return studentGrades.getOrDefault(name, -1);
    }

    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add a student");
        System.out.println("2. Remove a student");
        System.out.println("3. Display a student's grade");
        System.out.println("4. Exit");
    }

    public static void main(String[] args) {
        Solution4 studentGrades = new Solution4();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            studentGrades.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    studentGrades.addStudent(name, grade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    studentGrades.removeStudent(nameToRemove);
                    break;
                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String nameToDisplay = scanner.nextLine();
                    int gradeToDisplay = studentGrades.getGrade(nameToDisplay);
                    if (gradeToDisplay != -1) {
                        System.out.println("Grade for " + nameToDisplay + ": " + gradeToDisplay);
                    } else {
                        System.out.println("Student " + nameToDisplay + " not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}