public class Glitch {

    protected String type;
    protected String message;
    protected String severity;

    // Constructor
    public Glitch(String type, String message, String severity) {
        this.type = type;
        this.message = message;
        this.severity = severity;
    }

    // Displays basic glitch information
    public void displayGlitch() {

        System.out.println("Glitch Type: " + type);
        System.out.println("Message: " + message);
        System.out.println("Severity: " + severity);
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public String getSeverity() {
        return severity;
    }
}
