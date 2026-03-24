package edu.norcocollege.cis18b.weekx.mini07;

public class AlertServiceApp {
    public static void main(String[] args) {
        System.out.println("=== Alert Service Demo ===\n");
        
        AlertService service = new AlertService(new InMemoryAlertRepository());
        Alert alert = new Alert(1, "Unauthorized login attempt", AlertLevel.CRITICAL);

        try {
            service.processAlert(alert);
            System.out.println("✓ Alert processed successfully.");
        } catch (InvalidAlertException | AlertStorageException | AlertProcessingException ex) {
            System.out.println("✗ Processing failed: " + ex.getMessage());
        }
    }
}