package edu.norcocollege.cis18b.weekx.mini03;

public class AlertValidatorDemo {
    
    public static void validateAlert(Alert alert) throws InvalidAlertException {
        if (alert == null) {
            throw new InvalidAlertException("Alert cannot be null");
        }
        if (alert.getMessage() == null || alert.getMessage().trim().isEmpty()) {
            throw new InvalidAlertException("Alert message cannot be null or blank");
        }
        if (alert.getLevel() == null) {
            throw new InvalidAlertException("Alert level cannot be null");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Custom Exception Demo ===\n");
        
        System.out.println("Test 1: Invalid alert (blank message)");
        Alert alert1 = new Alert(1, "", null);
        try {
            validateAlert(alert1);
            System.out.println("Alert is valid.");
        } catch (InvalidAlertException ex) {
            System.out.println("Invalid alert: " + ex.getMessage());
        }
        
        System.out.println("\nTest 2: Valid alert");
        Alert alert2 = new Alert(2, "CPU temperature high", AlertLevel.WARNING);
        try {
            validateAlert(alert2);
            System.out.println("Alert is valid: " + alert2);
        } catch (InvalidAlertException ex) {
            System.out.println("Invalid alert: " + ex.getMessage());
        }
    }
}