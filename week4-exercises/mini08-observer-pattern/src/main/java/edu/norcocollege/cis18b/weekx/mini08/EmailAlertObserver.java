package edu.norcocollege.cis18b.weekx.mini08;

public class EmailAlertObserver implements AlertObserver {
    @Override
    public void onAlert(Alert alert) {
        System.out.println("📧 EMAIL NOTIFICATION");
        System.out.println("   To: admin@monitoring-system.com");
        System.out.println("   Subject: ALERT: " + alert.level() + " - " + alert.message());
        System.out.println("   Body: Alert ID: " + alert.id());
        System.out.println("   Status: Email sent");
    }
}