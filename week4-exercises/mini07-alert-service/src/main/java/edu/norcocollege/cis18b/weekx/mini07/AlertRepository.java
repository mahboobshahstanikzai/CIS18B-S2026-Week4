package edu.norcocollege.cis18b.weekx.mini07;

public interface AlertRepository {
    void save(Alert alert) throws AlertStorageException;
}