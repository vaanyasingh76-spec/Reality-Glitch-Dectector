import java.util.ArrayList;

public class GlitchDetector implements RuleChecker {

    private ArrayList<Event> events;
    private ArrayList<Glitch> glitches;

    // Constructor
    public GlitchDetector(ArrayList<Event> events) {

        this.events = events;
        glitches = new ArrayList<>();
    }

    // Checks all reality rules
    @Override
    public void checkRules() {

        glitches.clear();

        checkLocationRule();
        checkTimeRule();
    }

    // Rule 1:
    // A person cannot be at two different places
    // at the same time.
    private void checkLocationRule() {

        for (int i = 0; i < events.size(); i++) {

            for (int j = i + 1; j < events.size(); j++) {

                Event first = events.get(i);
                Event second = events.get(j);

                if (first.getPersonName()
                        .equalsIgnoreCase(second.getPersonName())
                    && first.getTime() == second.getTime()
                    && !first.getLocation()
                        .equalsIgnoreCase(second.getLocation())) {

                    LocationGlitch glitch =
                        new LocationGlitch(
                            first.getPersonName(),
                            first.getLocation(),
                            second.getLocation(),
                            first.getTime()
                        );

                    glitches.add(glitch);
                }
            }
        }
    }

    // Rule 2:
    // A person should ENTER before they EXIT.
    private void checkTimeRule() {

        for (int i = 0; i < events.size(); i++) {

            Event current = events.get(i);

            if (current.getEventType()
                    .equalsIgnoreCase("EXIT")) {

                boolean enteredBefore = false;

                for (int j = 0; j < events.size(); j++) {

                    Event previous = events.get(j);

                    if (previous.getPersonName()
                            .equalsIgnoreCase(
                                current.getPersonName())
                        && previous.getEventType()
                            .equalsIgnoreCase("ENTER")
                        && previous.getTime()
                            < current.getTime()) {

                        enteredBefore = true;
                        break;
                    }
                }

                if (!enteredBefore) {

                    TimeGlitch glitch =
                        new TimeGlitch(
                            current.getPersonName(),
                            "EXIT before ENTER",
                            current.getTime()
                        );

                    glitches.add(glitch);
                }
            }
        }
    }

    // Displays all detected glitches
    public void showGlitches() {

        if (glitches.size() == 0) {

            System.out.println(
                "\n✓ No reality glitches detected."
            );

            return;
        }

        System.out.println(
            "\n================================="
        );

        System.out.println(
            "          GLITCH REPORT"
        );

        System.out.println(
            "================================="
        );

        // Polymorphism:
        // Each glitch can display itself differently.
        for (Glitch glitch : glitches) {

            glitch.displayGlitch();
        }
    }

    // Returns the detected glitches
    public ArrayList<Glitch> getGlitches() {

        return glitches;
    }
}
