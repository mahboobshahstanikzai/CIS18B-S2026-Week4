package edu.norcocollege.cis18b.weekx.mini09;

public class DecoratorApp {
    public static void main(String[] args) {
        System.out.println("=== Decorator Pattern Demo ===\n");
        
        Alert alert = new Alert(1, "CPU usage exceeded threshold", AlertLevel.CRITICAL);

        AlertHandler basicHandler = new BasicAlertHandler();
        AlertHandler loggedHandler = new LoggingAlertHandlerDecorator(basicHandler);
        
        System.out.println("Handling alert with decorated handler:");
        System.out.println("-".repeat(50));
        loggedHandler.handle(alert);
        System.out.println("-".repeat(50));
        
        System.out.println("\n✓ Decorator Pattern Demo Complete!");
        System.out.println("The decorator added logging without modifying BasicAlertHandler.");
    }
}