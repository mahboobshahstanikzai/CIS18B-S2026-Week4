package edu.norcocollege.cis18b.weekx.mini04;

public class AlertValidator {
    
    public void validate(Alert alert) throws InvalidAlertException {
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
}