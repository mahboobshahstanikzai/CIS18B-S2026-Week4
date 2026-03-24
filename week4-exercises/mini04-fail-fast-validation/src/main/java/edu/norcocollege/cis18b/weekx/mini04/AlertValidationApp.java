package edu.norcocollege.cis18b.weekx.mini04;

public class AlertValidationApp {
    public static void main(String[] args) {
        System.out.println("=== Fail-Fast Validation Demo ===\n");
        
        AlertValidator validator = new AlertValidator();

        System.out.println("Test 1: Valid Alert");
        Alert validAlert = new Alert(1, "CPU usage high", AlertLevel.WARNING);
        try {
            validator.validate(validAlert);
            System.out.println("✓ SUCCESS: Valid alert passed validation");
            System.out.println("  Alert: " + validAlert);
        } catch (InvalidAlertException e) {
            System.out.println("✗ ERROR: " + e.getMessage());
        }
        
        System.out.println("\nTest 2: Invalid Alert (blank message)");
        Alert invalidAlert = new Alert(2, "   ", AlertLevel.INFO);
        try {
            validator.validate(invalidAlert);
            System.out.println("✓ SUCCESS: Invalid alert passed validation");
        } catch (InvalidAlertException e) {
            System.out.println("✗ FAIL-FAST: Alert rejected - " + e.getMessage());
        }
        
        System.out.println("\n=== Demo Complete ===");
    }
}