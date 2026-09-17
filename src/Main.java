import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Event> events = new ArrayList<>();

        GlitchDetector detector = new GlitchDetector(events);

        int choice = 0;

        System.out.println("======================================");
        System.out.println("       REALITY GLITCH DETECTOR");
        System.out.println("======================================");

        do {

            System.out.println("\n------------- MENU ----------------");
            System.out.println("1. Add Person");
            System.out.println("2. Add Event");
            System.out.println("3. View People");
            System.out.println("4. View Events");
            System.out.println("5. Detect Glitches");
            System.out.println("6. View Glitch Report");
            System.out.println("7. Save Report");
            System.out.println("8. Simulate Event Processing");
            System.out.println("9. Exit");
            System.out.println("-----------------------------------");

            System.out.print("Enter your choice: ");

            try {

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:

                        System.out.print("Enter person's name: ");
                        String name = sc.nextLine();

                        if (name.trim().isEmpty()) {
                            System.out.println("Name cannot be empty.");
                            break;
                        }

                        Person person = new Person(name);
                        people.add(person);

                        System.out.println("Person added successfully.");
                        break;

                    case 2:

                        if (people.size() == 0) {
                            System.out.println("Please add a person first.");
                            break;
                        }

                        System.out.print("Enter person's name: ");
                        String personName = sc.nextLine();

                        boolean found = false;

                        for (Person p : people) {

                            if (p.getName().equalsIgnoreCase(personName)) {
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Person not found.");
                            break;
                        }

                        System.out.print("Enter event type (ENTER/EXIT): ");
                        String eventType = sc.nextLine();

                        if (!eventType.equalsIgnoreCase("ENTER")
                                && !eventType.equalsIgnoreCase("EXIT")) {

                            System.out.println(
                                "Please enter only ENTER or EXIT."
                            );

                            break;
                        }

                        System.out.print("Enter location: ");
                        String location = sc.nextLine();

                        if (location.trim().isEmpty()) {
                            System.out.println("Location cannot be empty.");
                            break;
                        }

                        System.out.print("Enter time: ");

                        int time;

                        try {

                            time = sc.nextInt();
                            sc.nextLine();

                            if (time < 0) {
                                System.out.println(
                                    "Time cannot be negative."
                                );
                                break;
                            }

                        } catch (Exception e) {

                            System.out.println(
                                "Please enter a valid number."
                            );

                            sc.nextLine();
                            break;
                        }

                        Event event = new Event(
                            personName,
                            eventType,
                            location,
                            time
                        );

                        events.add(event);

                        System.out.println("Event added successfully.");
                        break;

                    case 3:

                        System.out.println("\n--------- PEOPLE ---------");

                        if (people.size() == 0) {

                            System.out.println("No people added yet.");

                        } else {

                            for (Person p : people) {
                                p.showPerson();
                            }
                        }

                        break;

                    case 4:

                        System.out.println("\n--------- EVENTS ---------");

                        if (events.size() == 0) {

                            System.out.println("No events added yet.");

                        } else {

                            for (Event e : events) {
                                e.showEvent();
                            }
                        }

                        break;

                    case 5:

                        System.out.println("\nChecking reality rules...");

                        detector.checkRules();

                        System.out.println(
                            "Reality check completed."
                        );

                        break;

                    case 6:

                        detector.showGlitches();
                        break;

                    case 7:

                        FileManager.saveReport(
                            detector.getGlitches()
                        );

                        break;

                    case 8:

                        System.out.println(
                            "\nStarting event processing..."
                        );

                        EventThread firstThread =
                            new EventThread("Event A");

                        EventThread secondThread =
                            new EventThread("Event B");

                        firstThread.start();
                        secondThread.start();

                        try {

                            firstThread.join();
                            secondThread.join();

                        } catch (InterruptedException e) {

                            System.out.println(
                                "Thread was interrupted."
                            );
                        }

                        System.out.println(
                            "All events processed."
                        );

                        break;

                    case 9:

                        System.out.println("\nExiting...");
                        System.out.println(
                            "Thank you for using Reality Glitch Detector!"
                        );

                        break;

                    default:

                        System.out.println(
                            "Invalid choice. Please try again."
                        );
                }

            } catch (Exception e) {

                System.out.println(
                    "Please enter a valid number."
                );

                sc.nextLine();
                choice = 0;
            }

        } while (choice != 9);

        sc.close();
    }
}
