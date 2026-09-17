public class LocationGlitch extends Glitch {

    private String person;
    private String firstLocation;
    private String secondLocation;
    private int time;

    // Constructor
    public LocationGlitch(String person,
                          String firstLocation,
                          String secondLocation,
                          int time) {

        super(
            "Location Glitch",
            person + " is present at two locations at the same time.",
            "HIGH"
        );

        this.person = person;
        this.firstLocation = firstLocation;
        this.secondLocation = secondLocation;
        this.time = time;
    }

    // Displays location glitch details
    @Override
    public void displayGlitch() {

        System.out.println("\n⚠ LOCATION GLITCH");
        System.out.println("Person: " + person);
        System.out.println("Location 1: " + firstLocation);
        System.out.println("Location 2: " + secondLocation);
        System.out.println("Time: " + time);
        System.out.println("Severity: " + severity);
    }
}
