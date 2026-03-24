package edu.norcocollege.cis18b.weekx.mini10;

import java.util.List;

public class AlwaysFailRepository implements AlertRepository {
    @Override
    public void save(Alert alert) throws AlertStorageException {
        throw new AlertStorageException(
            "Simulated storage failure for alert: " + alert.id(),
            new RuntimeException("Database connection failed")
        );
    }

    @Override
    public List<Alert> findAll() {
        return List.of();
    }
}