package edu.norcocollege.cis18b.weekx.mini08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogAlertObserver implements AlertObserver {
    
    private static final DateTimeFormatter formatter = 
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    @Override
    public void onAlert(Alert alert) {
        String timestamp = LocalDateTime.now().format(formatter);
        System.out.println("📝 LOG ENTRY");
        System.out.println("   Timestamp: " + timestamp);
        System.out.println("   Alert ID: " + alert.id());
        System.out.println("   Level: " + alert.level());
        System.out.println("   Message: " + alert.message());
        System.out.println("   Log file: /var/log/alerts/system.log");
    }
}