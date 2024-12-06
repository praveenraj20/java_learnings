package ExceptionTest;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int numerator = 10;
            int denominator = 0; // This will cause a divide-by-zero exception
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch and handle the exception
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Exception: " + e.getMessage());
        } finally {
            // Finally block will always execute
            System.out.println("Execution completed.");
        }
    }
}


