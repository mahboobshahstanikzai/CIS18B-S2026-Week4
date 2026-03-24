package edu.norcocollege.cis18b.weekx.mini07;

public class AlertService {
    private final AlertRepository repository;
    private final AlertValidator validator;

    public AlertService(AlertRepository repository) {
        this.repository = repository;
        this.validator = new AlertValidator();
    }

    public void processAlert(Alert alert)
            throws InvalidAlertException, AlertStorageException, AlertProcessingException {
        
        try {
            validator.validate(alert);
            System.out.println("✓ Validation passed for alert ID: " + alert.id());
            repository.save(alert);
            System.out.println("✓ Alert processed successfully!");
        } catch (InvalidAlertException | AlertStorageException e) {
            throw e;
        } catch (Exception e) {
            throw new AlertProcessingException(
                "Unexpected error processing alert with ID " + alert.id(),
                e
            );
        }
    }
}