package edu.norcocollege.cis18b.weekx.mini02;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("=== Finally Block Demo ===\n");
        System.out.println("Opening alert stream...");

        try {
            System.out.println("Attempting to connect to alert stream...");
            throw new RuntimeException("Alert stream connection failed");
        } catch (RuntimeException ex) {
            System.out.println("Caught exception: " + ex.getMessage());
        } finally {
            System.out.println("Closing alert stream...");
            System.out.println("Resources cleaned up successfully.");
        }

        System.out.println("\nApplication continues after cleanup.");
    }
}