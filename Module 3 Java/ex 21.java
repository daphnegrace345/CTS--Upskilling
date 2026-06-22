// Custom Exception Program in Java
import java.util.Scanner;
// Custom Exception Class
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}
class CustomExceptionDemo {
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Access Granted.");
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            try {
                checkAge(age);
            } catch (InvalidAgeException e) {
                // Display exception message
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}
