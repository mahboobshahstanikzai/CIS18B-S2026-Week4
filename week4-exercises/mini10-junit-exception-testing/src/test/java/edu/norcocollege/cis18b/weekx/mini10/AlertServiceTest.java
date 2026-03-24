package edu.norcocollege.cis18b.weekx.mini10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class AlertServiceTest {
    @Test
    void shouldStoreSuccessfullyProcessedAlert() throws Exception {
        AlertService service = new AlertService(new InMemoryAlertRepository());
        Alert alert = new Alert(1, "Unauthorized login attempt", AlertLevel.CRITICAL);

        service.processAlert(alert);
        assertEquals(1, service.getAlertCount());
    }

    @Test
    void shouldThrowWhenRepositoryFails() {
        AlertService service = new AlertService(new AlwaysFailRepository());
        Alert alert = new Alert(2, "Disk failure", AlertLevel.CRITICAL);

        assertThrows(AlertStorageException.class, () -> service.processAlert(alert));
    }
}