public class Event {

    private String personName;
    private String eventType;
    private String location;
    private int time;

    // Constructor
    public Event(String personName, String eventType,
                 String location, int time) {

        this.personName = personName;
        this.eventType = eventType;
        this.location = location;
        this.time = time;
    }

    public String getPersonName() {
        return personName;
    }

    public String getEventType() {
        return eventType;
    }

    public String getLocation() {
        return location;
    }

    public int getTime() {
        return time;
    }

    // Displays event details
    public void showEvent() {

        System.out.println(
            personName + " | " +
            eventType + " | " +
            location + " | Time: " + time
        );
    }
}
