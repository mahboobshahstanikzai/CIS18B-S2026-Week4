package edu.norcocollege.cis18b.weekx.mini04;

public class Alert {
    private final int id;
    private final String message;
    private final AlertLevel level;

    public Alert(int id, String message, AlertLevel level) {
        this.id = id;
        this.message = message;
        this.level = level;
    }

    public int getId() { return id; }
    public String getMessage() { return message; }
    public AlertLevel getLevel() { return level; }
    
    @Override
    public String toString() {
        return "Alert{id=" + id + ", message='" + message + "', level=" + level + "}";
    }
}