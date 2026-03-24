package edu.norcocollege.cis18b.weekx.mini05;

public class DebuggingDemo {
    public static void main(String[] args) {
        String[] alerts = {"CPU High", "Disk Full", "Login Failure"};

        System.out.println("=== Debugging Demo (Fixed) ===");
        System.out.println("Array length: " + alerts.length);
        System.out.println("Valid indices: 0 to " + (alerts.length - 1));
        System.out.println();
        
        // FIXED: Changed <= to <
        for (int i = 0; i < alerts.length; i++) {
            System.out.println("Processing alert index " + i + ": " + alerts[i]);
        }
        
        System.out.println("All alerts processed!");
    }
}