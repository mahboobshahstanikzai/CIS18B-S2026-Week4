package edu.norcocollege.cis18b.weekx.mini09;

import java.time.LocalDateTime;

public class LoggingAlertHandlerDecorator implements AlertHandler {
    private final AlertHandler wrapped;

    public LoggingAlertHandlerDecorator(AlertHandler wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void handle(Alert alert) {
        System.out.println("[LOG] Starting: " + LocalDateTime.now());
        wrapped.handle(alert);
        System.out.println("[LOG] Finished: " + LocalDateTime.now());
    }
}