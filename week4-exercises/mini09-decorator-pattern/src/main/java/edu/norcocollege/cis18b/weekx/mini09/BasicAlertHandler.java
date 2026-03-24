package edu.norcocollege.cis18b.weekx.mini09;

public class BasicAlertHandler implements AlertHandler {
    @Override
    public void handle(Alert alert) {
        System.out.println("🔔 HANDLING: Alert #" + alert.id() + 
                          " [" + alert.level() + "] - " + alert.message());
    }
}