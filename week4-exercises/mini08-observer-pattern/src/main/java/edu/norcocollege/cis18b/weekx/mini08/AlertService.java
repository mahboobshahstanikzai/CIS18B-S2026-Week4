package edu.norcocollege.cis18b.weekx.mini08;

import java.util.ArrayList;
import java.util.List;

public class AlertService {
    private final List<AlertObserver> observers = new ArrayList<>();

    public void addObserver(AlertObserver observer) {
        observers.add(observer);
        System.out.println("✓ Observer added: " + observer.getClass().getSimpleName());
    }

    public void processAlert(Alert alert) {
        System.out.println("\n📢 Processing alert: " + alert.message());
        System.out.println("   Alert ID: " + alert.id() + " | Level: " + alert.level());
        System.out.println("   Notifying " + observers.size() + " observer(s)...");
        System.out.println("-".repeat(50));
        
        for (AlertObserver observer : observers) {
            observer.onAlert(alert);
            System.out.println();
        }
        
        System.out.println("-".repeat(50));
        System.out.println("✓ Alert processing complete\n");
    }
}