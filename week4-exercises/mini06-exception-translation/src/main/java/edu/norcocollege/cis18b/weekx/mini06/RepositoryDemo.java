package edu.norcocollege.cis18b.weekx.mini06;

public class RepositoryDemo {
    public static void main(String[] args) {
        System.out.println("=== Exception Translation Demo ===\n");
        
        Alert alert = new Alert(1, "Security breach detected", AlertLevel.CRITICAL);
        AlertRepository repository = new InMemoryAlertRepository();

        System.out.println("Attempting to save alert: " + alert);
        System.out.println();
        
        try {
            repository.save(alert);
            System.out.println("✓ Alert saved successfully!");
        } catch (AlertStorageException e) {
            System.out.println("✗ Failed to save alert!");
            System.out.println("\n--- Translated Exception ---");
            System.out.println("Exception type: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
            System.out.println("\n--- Original Cause (Preserved) ---");
            System.out.println("Cause type: " + e.getCause().getClass().getSimpleName());
            System.out.println("Cause message: " + e.getCause().getMessage());
        }
        
        System.out.println("\n=== Demo Complete ===");
    }
}