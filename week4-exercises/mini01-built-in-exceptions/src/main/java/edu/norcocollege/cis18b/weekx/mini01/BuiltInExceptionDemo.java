package edu.norcocollege.cis18b.weekx.mini01;

public class BuiltInExceptionDemo {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        String[] alerts = {"CPU High", "Disk Full", "Login Failure"};

        System.out.println("=== Testing ArithmeticException ===");
        // Handle division by zero
        try {
            int result = numerator / denominator;
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("\n=== Testing ArrayIndexOutOfBoundsException ===");
        // Handle invalid array index
        try {
            String alert = alerts[3];  // Index 3 doesn't exist (valid: 0,1,2)
            System.out.println("Alert at index 3: " + alert);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid alert index.");
            System.out.println("Valid indices are 0 to " + (alerts.length - 1));
        }

        System.out.println("\nProgram completed.");
    }
}