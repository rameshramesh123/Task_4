package task4;

// Custom exception for age not within the range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class
class Student {
    int rollNo;
    String name;
    int age;
    String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("AgeNotWithinRangeException-Enter Age Within the Range(15-21)");
        }

        else if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name contains invalid characters");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name
                + ", Age: " + age + ", Course: " + course);
    }
}

// Main class to test the implementation
 class Main {
    public static void main(String[] args) {
        try {
            // Valid student
            Student student1 = new Student(101, "Ramesh1", 18, "Computer Science");
            student1.displayStudentDetails();

        } catch (AgeNotWithinRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
