public class TimeGlitch extends Glitch {

    private String person;
    private String event;
    private int time;

    // Constructor
    public TimeGlitch(String person, String event, int time) {

        super(
            "Time Glitch",
            "An event happened in an incorrect sequence.",
            "MEDIUM"
        );

        this.person = person;
        this.event = event;
        this.time = time;
    }

    // Displays time glitch details
    @Override
    public void displayGlitch() {

        System.out.println("\n⚠ TIME / SEQUENCE GLITCH");
        System.out.println("Person: " + person);
        System.out.println("Event: " + event);
        System.out.println("Time: " + time);
        System.out.println("Severity: " + severity);
    }
}
