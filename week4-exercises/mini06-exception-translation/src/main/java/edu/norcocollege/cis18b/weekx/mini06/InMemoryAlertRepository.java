package edu.norcocollege.cis18b.weekx.mini06;

public class InMemoryAlertRepository implements AlertRepository {
    @Override
    public void save(Alert alert) throws AlertStorageException {
        try {
            System.out.println("Attempting to save alert: " + alert);
            throw new RuntimeException("DATABASE_CONNECTION_FAILED: Unable to connect");
        } catch (RuntimeException ex) {
            throw new AlertStorageException(
                "Failed to store alert with ID " + alert.id(),
                ex
            );
        }
    }
}