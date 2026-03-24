package edu.norcocollege.cis18b.weekx.mini10;

import java.util.List;

public interface AlertRepository {
    void save(Alert alert) throws AlertStorageException;
    List<Alert> findAll();
}