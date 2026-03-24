package edu.norcocollege.cis18b.weekx.mini08;

public class ObserverApp {
    public static void main(String[] args) {
        System.out.println("=== Observer Pattern Demo ===\n");
        
        AlertService service = new AlertService();

        System.out.println("Registering observers:");
        AlertObserver emailObserver = new EmailAlertObserver();
        AlertObserver logObserver = new LogAlertObserver();
        
        service.addObserver(emailObserver);
        service.addObserver(logObserver);
        
        System.out.println("\n" + "=".repeat(60) + "\n");
        
        Alert alert = new Alert(1001, "Unauthorized login attempt detected", AlertLevel.CRITICAL);
        service.processAlert(alert);
        
        System.out.println("=".repeat(60));
        System.out.println("\n✓ Observer pattern demo completed!");
    }
}