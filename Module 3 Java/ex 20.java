// Try-Catch Example Program in Java

import java.util.Scanner;

class TryCatchExample {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Input numbers
            System.out.print("Enter first integer: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second integer: ");
            int num2 = sc.nextInt();

            try {
                // Division operation
                int result = num1 / num2;

                System.out.println("Result = " + result);

            } catch (ArithmeticException e) {

                // Handling division by zero
                System.out.println("Error: Division by zero is not allowed.");
            }
        }
    }
}
